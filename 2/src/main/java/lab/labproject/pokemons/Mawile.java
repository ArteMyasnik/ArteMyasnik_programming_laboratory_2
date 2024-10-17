package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Mawile extends Pokemon {
    Pokemon mawile;
    public Mawile() {
        this.mawile = new Pokemon("Mawile", 1);
        this.setStats(50.0, 85.0, 85.0, 55.0, 55.0, 50.0);
        this.setType(Type.STEEL, Type.FAIRY);
    }
    
}
