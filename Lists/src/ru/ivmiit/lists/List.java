package ru.ivmiit.lists;

/**
 * 04.03.2017
 * List
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface List<T> extends Iterable<T> {

    /**
     * Добавление элемента
     * @param element
     */
    void add(T element);

    /**
     * Получение элемента по индексу
     * @param index
     * @return
     */
    T get(int index);

    int size();
}
