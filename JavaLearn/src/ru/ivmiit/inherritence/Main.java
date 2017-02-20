package ru.ivmiit.inherritence;

public class Main {

    public static void main(String[] args) {
	    Human marsel = new Human(23, "Marsel");
        marsel.go();

        Cooker cooker = new Cooker("Jan Reno", 54, "chief");
        cooker.cook("Lazanya");
        cooker.go();

        Human humanCooker = cooker;

        humanCooker.go();
        // humanCooker.cook();

        Cooker cookerFromHumanCooker = (Cooker)humanCooker;
        cookerFromHumanCooker.cook("Paelya");


        Killer killer = new Killer(23, "Marsel", "Ak-47");
        killer.kill("C#");

        Human killerHuman = killer;

        Cooker cookerKiller = (Cooker)killerHuman;
    }
}
