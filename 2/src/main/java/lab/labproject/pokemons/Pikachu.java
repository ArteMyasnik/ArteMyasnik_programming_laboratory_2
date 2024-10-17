package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pokemon{
    Pokemon pikachu;
    public Pikachu() {
        this.pikachu = new Pokemon("Pikachu", 1);
        this.setStats(35.0, 55.0, 40.0, 50.0, 50.0, 90.0);
        this.setType(Type.ELECTRIC);
    }

}