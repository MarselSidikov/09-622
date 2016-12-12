package ru.ivmiit.set;

import ru.ivmiit.map.tree.MapTreeImpl;

public class SetMapImpl implements Set{

    private MapTreeImpl map;
    private final String FAKE_VALUE_FOR_MAP = "";

    public SetMapImpl() {
        this.map = new MapTreeImpl();
    }

    @Override
    public void put(int value) {
        map.put(value, FAKE_VALUE_FOR_MAP);
    }

    @Override
    public boolean contains(int value) {
        return map.get(value) != null;
    }
}
