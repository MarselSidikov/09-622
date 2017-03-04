package ru.ivmiit;

/**
 * 04.03.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human implements Comparable<Human> {
    private String name;
    private int id;
    private int age;

    public Human(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + " " + this.id + " " + this.age;
    }

    @Override
    public int compareTo(Human otherHuman) {
        return this.age - otherHuman.age;
    }
}
