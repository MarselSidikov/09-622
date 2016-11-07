package ru.ivmiit;

import ru.ivmiit.list.HumansLinkedList;
import ru.ivmiit.model.Human;
import ru.ivmiit.services.HumansListsSorter;
import ru.ivmiit.utils.HumanReader;
import ru.ivmiit.utils.HumansWriter;

public class Main {

    public static void main(String[] args) {
        HumanReader humanReader = new HumanReader("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\JAVA\\09-622\\LinkedList\\recources\\data.csv");

        HumansListsSorter sorter = new HumansListsSorter();
        HumansLinkedList[] prepared = sorter.readHumansPrepareToSort(humanReader);
        HumansLinkedList result = sorter.mergeAll(prepared);

        HumansWriter writer = new HumansWriter();
        writer.writeHumansList(result, "out.csv");
    }
}
