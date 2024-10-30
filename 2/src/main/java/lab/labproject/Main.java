package lab.labproject;

import lab.labproject.pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
//		Pokemon p1 = new Pokemon("Чужой", 1);
//		Pokemon p2 = new Pokemon("Хищник", 1);
        Pokemon p3 = new Mawile();
        Pokemon p4 = new Patrat();
        Pokemon p5 = new Watchog();
        Pokemon p6 = new Pichu();
        Pokemon p7 = new Pikachu();
        Pokemon p8 = new Raichu();
//		b.addAlly(p1);
//		b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addAlly(p6);
        b.addAlly(p7);
        b.addAlly(p8);
        b.go();
    }
}
