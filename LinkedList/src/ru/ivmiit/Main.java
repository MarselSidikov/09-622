package ru.ivmiit;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(-9);
        list.add(11);
        list.add(34);

        list.print();

        list.remove(34);

        System.out.println("--------");

        list.print();
    }
}
