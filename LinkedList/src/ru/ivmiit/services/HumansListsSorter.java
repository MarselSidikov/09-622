package ru.ivmiit.services;

import ru.ivmiit.list.HumansLinkedList;
import ru.ivmiit.model.Human;
import ru.ivmiit.utils.HumanReader;

public class HumansListsSorter {
    public HumansLinkedList[] readHumansPrepareToSort(HumanReader reader) {
        // массив связных списков
        HumansLinkedList[] result = new HumansLinkedList[100];

        for (int i = 0; i < result.length; i++) {
            result[i] = new HumansLinkedList();
        }

        Human human = null;
        human = reader.readHuman();
        do {
            result[human.getAge()].addToBegin(human);
            System.out.println("READ HUMAN - " + human.getName());
            human = reader.readHuman();
        } while (human != null);
        return result;
    }

    public HumansLinkedList mergeAll(HumansLinkedList[] lists) {
        HumansLinkedList result = new HumansLinkedList();
        for (int i = 0; i < lists.length; i++) {
            result.union(lists[i]);
            System.out.println("MERGED");
        }

        return result;
    }
}
