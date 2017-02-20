package ru.ivmiit.interfaces;

import ru.ivmiit.abstractclasses.Bike;
import ru.ivmiit.inherritence.Cooker;
import ru.ivmiit.inherritence.Human;
import ru.ivmiit.inherritence.Killer;

public class Program {
    public static void main(String[] args) {
        Bike bike = new Bike("Kawasaki");
        Human human = new Human(23, "Marsel");
        Cooker cooker = new Cooker("Vika", 16, "Makaroons");
        Killer killer = new Killer(18, "Slava", "Blaster");
        Bike bike1 = new Bike("Hyundai");

        Moveable moveables[] = {bike, human, cooker, killer, bike1};

        for (int i = 0; i < moveables.length; i++) {
            moveables[i].move(230);
        }
    }
}
