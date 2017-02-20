package ru.ivmiit.inherritence;

public class Cooker extends Human {
    private String specialization;

    public Cooker(String name, int age, String specialization) {
        // вызов конструктора предка
        super(age, name);
        this.specialization = specialization;
    }

    public void cook(String foodName) {
        System.out.println("Cooker cook " + foodName);
    }

    public void go() {
        System.out.println("Cooker go");
    }
}
