package ru.ivmiit.lists;

import ru.ivmiit.Human;

import java.util.Comparator;

/**
 * 06.03.2017
 * HumansIdComparator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansIdComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getId() - o2.getId();
    }
}
