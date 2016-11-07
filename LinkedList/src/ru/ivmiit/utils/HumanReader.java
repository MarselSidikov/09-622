package ru.ivmiit.utils;

import ru.ivmiit.model.Human;

import java.io.*;

// Класс, который связывается с файлом и считывает оттуда данные
public class HumanReader {

    // поле, имеющее тип встроенного класса для чтения
    private BufferedReader reader;

    // конструктор - связываем поле reader с конкретным файлом
    public HumanReader(String filename) {
        // try - блок, в котором возможны какие-либо исключения
        try {
            // ПОДКЛЮЧИЛИ ФАЙЛ К полю reader
            this.reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        }
        // catch - что делаем если словили исключение
        catch (FileNotFoundException e) {
            System.err.print("File not found");
        }
    }

    // считывает следующего человека из файла
    public Human readHuman() {
        // строка для хранения человека
        String humanLine;
        Human human = new Human();
        try {
            // считали строку
            humanLine = reader.readLine();

            if (humanLine == null) {
                return null;
            }

            // получил позицию символа табуляции
            int tabPosition = humanLine.indexOf('\t');

            // выделение подстроки - начало-конец
            String name = humanLine.substring(0, tabPosition);
            String ageAsString = humanLine.substring(tabPosition + 1, humanLine.length());

            // конвертация строки в число
            int age = Integer.parseInt(ageAsString);

            human = new Human(name, age);
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }

        return human;
    }
}
