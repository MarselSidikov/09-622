package ru.itis.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 30.09.2017
 * Button
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Button {
    private List<ButtonClickObserver> observers;

    public Button() {
        observers = new ArrayList<>();
    }

    public void addObserver(ButtonClickObserver observer) {
        observers.add(observer);
    }

    public void click(ClickArgs args) {
        for (ButtonClickObserver observer : observers) {
            observer.handleClick(args);
        }
    }
}
