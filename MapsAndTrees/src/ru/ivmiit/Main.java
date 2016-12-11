package ru.ivmiit;

import ru.ivmiit.map.Map;
import ru.ivmiit.map.array.MapArrayImpl;
import ru.ivmiit.map.tree.MapTreeImpl;

public class Main {

    public static void main(String[] args) {
	    Map myMap;
        // myMap = new MapArrayImpl();
        myMap = new MapTreeImpl();

        myMap.put(-10, "Edvard");
        myMap.put(1, "Azat");
        myMap.put(22, "Zufar");
        myMap.put(234, "Nikita");
        myMap.put(228, "Fedor");
        myMap.put(668, "Slava");
        myMap.put(775, "Marsel");
        myMap.put(777, "Kseniya");
        myMap.put(1488, "Vika");

        int i = 0;

        String fromMapName = myMap.get(1488);

        //System.out.println(fromMapName);

        myMap.show();
    }
}
