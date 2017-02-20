package ru.ivmiit.inherritence;

import ru.ivmiit.interfaces.Moveable;

public class Human implements Moveable {
    private static final int DEFAULT_AGE = 0;
    private int age;
    private String name;

    public Human(int age, String name) {
        this.name = name;
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            this.age = DEFAULT_AGE;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void go() {
        System.out.println("Human go");
    }

    @Override
    public void move(int speed) {
        System.out.println("Human moving with speed " + speed);
    }
}
