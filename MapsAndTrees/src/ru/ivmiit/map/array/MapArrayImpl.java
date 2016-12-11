package ru.ivmiit.map.array;

import ru.ivmiit.map.Map;

public class MapArrayImpl implements Map {
    private final static int MAX_SIZE_OF_TABLE = 15;

    private MapArrayElement[] elements;
    private int count;

    public MapArrayImpl() {
        elements = new MapArrayElement[MAX_SIZE_OF_TABLE];
        count = 0;
    }

    @Override
    public void put(int key, String value) {
        if (count == 0) {
            MapArrayElement newElement =
                    new MapArrayElement(key, value);
            elements[count] = newElement;
            count++;
        } else if (count < MAX_SIZE_OF_TABLE) {
            // бегаем по всем элементам
            for (int i = 0; i < count; i++) {
                // если элемент с таким ключом найден
                if (elements[i].getKey() == key) {
                    // перезаписываем его значение
                    elements[i].setValue(value);
                    return;
                }
            }

            MapArrayElement newElement = new MapArrayElement(key, value);
            elements[count] = newElement;
            count++;
        }
    }

    @Override
    public String get(int key) {
        for (int i = 0; i < count; i++) {
            if (elements[i].getKey() == key) {
                return elements[i].getValue();
            }
        }
        return null;
    }

    @Override
    public void show() {

    }
}
