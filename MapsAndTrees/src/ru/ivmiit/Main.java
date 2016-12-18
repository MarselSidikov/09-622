package ru.ivmiit;

import ru.ivmiit.map.Map;

import ru.ivmiit.map.tree.MapTreeImpl;
import ru.ivmiit.set.Set;
import ru.ivmiit.set.SetMapImpl;

import java.util.HashMap;


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

        Set set = new SetMapImpl();
        set.put(34);
        set.put(27);
        set.put(67);
        set.put(67);

        System.out.println(set.contains(27));
        System.out.println(set.contains(67));
        System.out.println(set.contains(35));

        String hello = "Hello";
        System.out.println(hello.hashCode());
        String hella = "Hella";
        System.out.println(hella.hashCode());

        Integer a = -300;
        Integer b = -300;

        System.out.println(a == b);



    }
}
