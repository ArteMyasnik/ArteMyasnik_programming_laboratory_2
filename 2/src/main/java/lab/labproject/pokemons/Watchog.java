package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Watchog extends Pokemon{
    Pokemon watchog;
    public Watchog() {
        this.watchog = new Pokemon("Watchog", 1);
        this.setStats(60.0, 85.0, 69.0, 60.0, 69.0, 77.0);
        this.setType(Type.NORMAL);
    }

}
