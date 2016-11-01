package ru.ivmiit;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("marsel");
        // human.age = -50;
        human.setAge(-50);
        System.out.println(human.getAge());

        Human human1 = new Human();
        System.out.println(human1.getName());

        Human human2 = new Human("Marsel", 32);
        Human human3 = new Human(human);

        // Human.globalBudget = 500;

        human2.addToBudget(100);
        human3.getFromBudget(53);

        human1.showBudget();

        Human.showGlobalBudget();

        // -------------------------------
        Human marsel = new Human("Marsel", 22);
        Human ksenya = new Human("Ksenya", 18);
        Human zufar = new Human("Zufar", 17);
        Human ruslan = new Human("Ruslan", 19);
        Human albert = new Human("Albert", 18);
        Human nikita = new Human("Nikita", 20);

        Human[] humans = {ksenya, zufar, ruslan, albert, marsel, nikita};

        Human.sortByAge(humans);
        Human.showHumans(humans);

    }
}
