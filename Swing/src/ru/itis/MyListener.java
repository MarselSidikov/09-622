package ru.itis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 30.09.2017
 * MyListener
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I'm in myEvent");
    }
}
