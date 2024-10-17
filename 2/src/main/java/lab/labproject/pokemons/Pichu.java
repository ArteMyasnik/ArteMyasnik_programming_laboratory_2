package lab.labproject.pokemons;
import ru.ifmo.se.pokemon.*;

public class Pichu extends Pokemon{
    Pokemon pichu;
    public Pichu() {
        this.pichu = new Pokemon("Pichu", 1);
        this.setStats(20.0, 40.0, 15.0, 35.0, 35.0, 60.0);
        this.setType(Type.ELECTRIC);
    }

}
