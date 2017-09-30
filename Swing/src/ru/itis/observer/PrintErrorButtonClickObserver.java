package ru.itis.observer;

/**
 * 30.09.2017
 * PrintErrorButtonClickObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class PrintErrorButtonClickObserver implements ButtonClickObserver {
    @Override
    public void handleClick(ClickArgs args) {
        System.err.println("Error, " + args.getMouseButton());
    }
}
