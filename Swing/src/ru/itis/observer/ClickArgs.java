package ru.itis.observer;

/**
 * 30.09.2017
 * ClickArgs
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ClickArgs {
    private MouseButtons mouseButton;

    public ClickArgs(MouseButtons mouseButton) {
        this.mouseButton = mouseButton;
    }

    public MouseButtons getMouseButton() {
        return mouseButton;
    }
}
