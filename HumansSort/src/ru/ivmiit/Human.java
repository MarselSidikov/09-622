package ru.ivmiit;

public class Human {
    // СТАТИЧНЫЕ ЧЛЕНЫ КЛАССА - глобальные члены класса
    // статичные поля
    // статичные поля - живут без создания объекта
    public static int globalBudget;

    // ИНИЦИАЛИЗАЦИЯ статичных полей
    static {
        globalBudget = 120;
    }

    // ИНКАПСУЛЯЦИЯ (в капсуле) - принцип ООП
    // 1) Защита состояния объектов
    // от внешнего некорректного использования

    // МОДИФИКАТОРЫ ДОСТУПА
    // public - штука видна везде
    // private - штука видна только внутри класса
    private int age;
    private String name;

    // КОНСТРУКТОР - штука, которая
    // выполняет инициализацию объекта
    // КОНСТРУКТОР - НЕ ЧЛЕН КЛАССА!!!!!
    // конструктор без формальных параметров
    // называется конструктором по умолчанию
    // создается автоматической самой джавой
    public Human() {
        this.age = 1;
        this.name = "DEFAULT NAME";
    }

    // конструктор с параметрами
    public Human(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    // конструктор копирования
    public Human(Human original) {
        this.setAge(original.getAge());
        this.setName(original.getName());
    }

    // ПРОЦЕДУРЫ И ФУНКЦИИ внутри класса
    // называются - МЕТОДАМИ

    // МЕТОДЫ ДОСТУПА
    // ГЕТТЕР - получает значение
    // СЕТТЕР - задает значение
    // this - объектная переменная объекта, внутри
    // которого производится операция
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("INCORRECT AGE");
            this.age = 1;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // при работе со статичными полями ключевое слово this - не используется
    public void addToBudget(int sum) {
        globalBudget = globalBudget + sum;
    }

    public void getFromBudget(int sum) {
        globalBudget = globalBudget - sum;
    }

    public void showBudget() {
        System.out.println(globalBudget);
    }

    //статичный метод
    // в статичных блоках и методах нельзя использовать нестатичные
    // члены класса (поля и методы)
    public static void showGlobalBudget() {
        System.out.println(globalBudget);
    }

    public static void sortByAge(Human[] humans) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].age > humans[j+1].age) {
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }

    public static void showHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].age);
        }
    }
}
