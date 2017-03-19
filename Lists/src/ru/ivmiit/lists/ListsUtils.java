package ru.ivmiit.lists;

import java.util.Comparator;
import java.util.Iterator;

/**
 * 04.03.2017
 * ListsUtils
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ListsUtils {

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        Object elements[] = list.getElements();
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                T a = (T)elements[j];
                T b = (T)elements[j + 1];
                boolean aMoreThanB;
                if (comparator == null) {
                    aMoreThanB = ((Comparable<T>)a).compareTo(b) > 0;
                } else {
                    aMoreThanB = comparator.compare(a, b) > 0;
                }
                
                if (aMoreThanB) {
                    Object temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        sort(list, null);
    }

    /*
    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList) {
        int i = 0;
        int j = 0;
        LinkedList<T> resultList = new LinkedList<T>();
        while (i < aList.size() && j < bList.size()) {
            if (aList.get(i).compareTo(bList.get(j)) < 0) {
                resultList.add(aList.get(i));
                i++;
            } else {
                resultList.add(bList.get(j));
                j++;
            }
        }

        while (i < aList.size()) {
            resultList.add(aList.get(i));
            i++;
        }

        while (j < bList.size()) {
            resultList.add(bList.get(j));
            j++;
        }

        return resultList;
    }
    */

    public static <T extends Comparable<T>> LinkedList<T> sort(LinkedList<T> list) {
        LinkedList stack[] = new LinkedList[32];

        for (int i = 0; i < stack.length; i++) {
            stack[i] = new LinkedList<T>();
        }

        int currentStackSize = 0;

        return stack[0];
    }

    /**
     * Функция слияния двух связных списков. Протестировать на случае, когда один из списков пустой, и когда два списка пустые
     * @param aList
     * @param bList
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> aList, LinkedList<T> bList) {
        Iterator<T> aListIterator = aList.iterator();
        Iterator<T> bListIterator = bList.iterator();

        LinkedList<T> resultList = new LinkedList<T>();
        while (aListIterator.hasNext() && bListIterator.hasNext()){
            T aValue = aListIterator.next();
            T bValue = bListIterator.next();

            // ДОПИСАТЬ
        }

        return resultList;
    }

    public void removeByNode(LinkedList.Node node) {

    }
}
