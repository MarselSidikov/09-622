package ru.itis.observer;

/**
 * 30.09.2017
 * ButtonClickObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// интерфейс, описывающий поведение, которое отвечает за реакцию на нажатие кнопки
public interface ButtonClickObserver {
    void handleClick(ClickArgs args);
}
