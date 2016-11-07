package ru.ivmiit.list;

import ru.ivmiit.model.Human;

public class Node {
    // значение узла
    private Human value;
    // указатель на следующий элемент
    private Node next;

    public Node(Human value) {
        this.value = value;
    }

    public Node(Human value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Human getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
