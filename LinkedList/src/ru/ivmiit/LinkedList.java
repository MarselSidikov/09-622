package ru.ivmiit;

// ДЗ
// есть файл, в нем 100500 записей
// ФИО возраст
// ПОЛУЧИТЬ файл, в котором все будет отсортировано по возрасту
// СОРТИРОВКА - ЛИНЕЙНАЯ
// указатель на последний элемент - в список
public class LinkedList {
    // указатель на первый элемент списка
    private Node top;
    private int count;

    /**
     * добавление элемента в конец списка
     * @param value значение элемента
     */
    public void add(int value) {
        // создаем новый узел
        Node newNode = new Node(value);

        // если список пустой
        if (top == null) {
            this.top = newNode;
        } else {
            // current - указатель на текущий элемент
            Node current = this.top;
            // пока есть следующий элемент после текущего
            while (current.getNext() != null) {
                // переходим на следующий
                current = current.getNext();
            }
            // кладете новый элемент
            current.setNext(newNode);
        }
        this.count++;
    }

    public void print() {
        Node current = this.top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void remove(int value) {
        // если удаляемый элемент - первый
        if (this.top.getValue() == value) {
            this.top = this.top.getNext();
        } else {
            Node current = this.top;
            int i = 0;
            while ((i < this.count - 1) && current.getNext().getValue() != value) {
                current = current.getNext();
                i++;
            }
            if (current.getNext() == null) {
                return;
            }
            current.setNext(current.getNext().getNext());
        }
    }


    // результирующий список - просто конкатенация двух списков
    public static LinkedList union(LinkedList listA, LinkedList listB) {
       return null;
    }

}
