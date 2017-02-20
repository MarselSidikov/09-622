package ru.ivmiit.abstractclasses;

public abstract class Transport {
    private String modelName;

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    /**
    public void go() {
        System.out.println("Transport go");
    }**/

    public abstract void go();
}
