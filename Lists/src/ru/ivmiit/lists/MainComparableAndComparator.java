package ru.ivmiit.lists;

import ru.ivmiit.Human;

/**
 * 06.03.2017
 * MainComparableAndComparator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainComparableAndComparator {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human("Slava", 4, 18));
        humans.add(new Human("Zufar", 6, 18));
        humans.add(new Human("Azat", 3, 19));
        humans.add(new Human("Nikita", 2, 20));
        humans.add(new Human("Marsel", 1, 23));
        humans.add(new Human("Albert", 7, 18));
        humans.add(new Human("Vika", 10, 18));
        humans.add(new Human("Fedor", 5, 19));
        humans.add(new Human("Ksusha", 8, 19));
        humans.add(new Human("Ruslan", 9, 20));
        humans.add(new Human("Edvard", 11, 25));

        ListsUtils.sort(humans);

        // используется только когда класс реализует iterable
        for (Human human : humans) {
            System.out.println(human);
        }

        System.out.println("By id sort");
        ListsUtils.sort(humans, new HumansIdComparator());

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
