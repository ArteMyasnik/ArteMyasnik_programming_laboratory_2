package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Patrat extends Pokemon{
    Pokemon patrat;
    public Patrat() {
        this.patrat = new Pokemon("Patrat", 1);
        this.setStats(45.0, 55.0, 39.0, 35.0, 39.0, 42.0);
        this.setType(Type.NORMAL);
    }

}
