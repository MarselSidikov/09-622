package ru.ivmiit.utils;
import ru.ivmiit.list.HumansLinkedList;
import ru.ivmiit.list.Node;
import ru.ivmiit.model.Human;

import java.io.*;

public class HumansWriter {
    public void writeHumansList(HumansLinkedList humans, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            // получаем человека из списка и пишем его в файл
            Human current = humans.getCurrent();
            do {
                writer.write(current.getName() + '\t' + current.getAge() + '\n');
                // получили слеующего
                current = humans.getCurrent();
            } while (current != null);

            writer.close();
        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
