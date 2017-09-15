package ru.ivmiit;

import java.sql.*;
import java.util.Scanner;

public class Main {

    //language=SQL
    private static final String SQL_SELECT_STUDENTS =
            "SELECT * FROM student";

    //language=SQL
    private static final String SQL_INSERT_STUDENT =
            "INSERT INTO student(name, age) VALUES (?, ?)";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/students_09_622",
                    "postgres",
                    "qwerty007"
            );
            // создали выражение которое можно выполнить из java в БД
            Statement statement = connection.createStatement();
            // мы получили объект ResultSet
            // на самом деле этот объект ни что иное как ИТЕРАТОР, указывающий прям перед первой сторокой
            // результирующего множества
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_STUDENTS);
            // свдигаем итератор на первую строку
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                + resultSet.getString("name") + " "
                + resultSet.getInt("age"));
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя и возраст пользователя:");
            String name = scanner.next();
            int age  = scanner.nextInt();
            /*  Данный способ плох тем, что можно произвести SQL-инъекцию.
                Грубо говоря - на сайте в качесте имени при регистрации можно написать DROP TABLE USERS и экранировать
                все, что до и все что после
             *  statement.executeUpdate("INSERT INTO student(name, age) VALUES ('" + name + "', " + age + ");");
             */
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_STUDENT);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);

            preparedStatement.execute();
        } catch (SQLException e) {
            // если мы поймали ошибку при работе с БД
            // выбрасываем непроверяемое исключение и останавливаем программу таким образом
            throw new IllegalArgumentException(e);
        }

    }
}
