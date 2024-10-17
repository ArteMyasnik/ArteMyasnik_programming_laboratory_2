package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Raichu extends Pokemon{
    Pokemon raichu;
    public Raichu() {
        this.raichu = new Pokemon("Raichu", 1);
        this.setStats(60.0, 90.0, 55.0, 90.0, 80.0, 110.0);
        this.setType(Type.ELECTRIC);
    }

}