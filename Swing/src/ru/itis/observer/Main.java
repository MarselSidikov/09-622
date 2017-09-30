package ru.itis.observer;

/**
 * 30.09.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        // new ButtonClick.. - анонимный класс
        button.addObserver(new ButtonClickObserver() {
            @Override
            public void handleClick(ClickArgs args) {
                System.out.println("Hello, " + args.getMouseButton());
            }
        });
        button.addObserver(new ButtonClickObserver() {
            @Override
            public void handleClick(ClickArgs args) {
                System.out.println("Bye, " + args.getMouseButton());
            }
        });
        PrintErrorButtonClickObserver printErrorButtonClickObserver = new PrintErrorButtonClickObserver();
        button.addObserver(printErrorButtonClickObserver);

        button.addObserver(newArgs -> 
            System.out.println("I'm in lambda, " + newArgs.getMouseButton()));

        // вместо этого у вас в окне можно мышкой нажать
        button.click(new ClickArgs(MouseButtons.LEFT));
    }
}
