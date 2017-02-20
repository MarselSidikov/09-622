package ru.ivmiit.abstractclasses;

import ru.ivmiit.interfaces.Moveable;

public class Bike extends Transport implements Moveable {

    public Bike(String modelName) {
        super(modelName);
    }

    public void go() {
        System.out.println("Bike go");
    }

    @Override
    public void move(int speed) {
        System.out.println("Bike moving with speed " + speed);
    }
}
