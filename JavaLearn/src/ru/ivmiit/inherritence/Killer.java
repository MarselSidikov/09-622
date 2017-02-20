package ru.ivmiit.inherritence;


public class Killer extends Human {

    private String gun;

    public Killer(int age, String name, String gun) {
        super(age, name);
        this.gun = gun;
    }

    public void kill(String victim) {
        System.out.println(victim + ", I'll kill you!");
    }
}
