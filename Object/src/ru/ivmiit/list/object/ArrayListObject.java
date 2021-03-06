package ru.ivmiit.list.object;

/**
 * 27.02.2017
 * ArrayListObject
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayListObject implements ListObject {

    private static final int MAX_ARRAY_SIZE = 5;

    private Object elements[];
    private int count;

    public ArrayListObject() {
        this.elements = new Object[MAX_ARRAY_SIZE];
        this.count = 0;
    }

    @Override
    public void add(Object element) {
        if (count < MAX_ARRAY_SIZE) {
            this.elements[count] = element;
            this.count++;
        } else {
            System.out.println("Array index of bounds");
        }
    }

    @Override
    public Object get(int index) {
        if (index < count) {
            return this.elements[index];
        } else {
            System.out.println("Incorrect index");
            return -1;
        }
    }
}
