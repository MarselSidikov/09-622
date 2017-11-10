package ru.itis;

/**
 * 03.11.2017
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    private String name;
    private int age;
    private String color;
    private boolean isReligion;
    private char sex;

    // закрытый конструктор, принимает на вход Builder и оттуда вытаскивает значения
    // которые положили другие программисты
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.color = builder.color;
        this.isReligion = builder.isReligion;
        this.sex = builder.sex;
    }

    // метод, который возвращает объект Builder
    public static Builder builder() {
        return new Builder();
    }

    // вложенный класс Builder
    public static class Builder {
        private String name;
        private int age;
        private String color;
        private boolean isReligion;
        private char sex;

        // метод принимает на вход значение соответствующего поля
        public Builder name(String name) {
            // кладет его в поле билдера
            this.name = name;
            // возвращает самого себя
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder isReligion(boolean isReligion) {
            this.isReligion = isReligion;
            return this;
        }

        public Builder sex(char sex) {
            this.sex = sex;
            return this;
        }

        // возвращает новый объект User, который заполнен билдером
        public User build() {
            return new User(this);
        }
    }
}
