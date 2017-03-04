package ru.ivmiit.lists;

import java.util.Iterator;

/**
 * 04.03.2017
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements List<T> {
    private int maxSize = 15;

    private Object elements[];
    private int count;

    public ArrayList() {
        elements = new Object[maxSize];
        count = 0;
    }

    private class ArrayListIterator<E> implements Iterator<E> {
        int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public E next() {
            E element = (E)elements[currentIndex];
            currentIndex++;
            return element;
        }
    }
    @Override
    public void add(T element) {
        if (count < maxSize) {
            elements[count] = element;
            count++;
        }
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index <= count) {
            return (T)elements[index];
        }
        return null;
    }

    @Override
    public int size() {
        return count;
    }

    // метод доступен во всех классах пакета
    T[] getElements() {
        return (T[])this.elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator<>();
    }
}
