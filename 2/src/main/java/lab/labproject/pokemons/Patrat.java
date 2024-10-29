package lab.labproject.pokemons;
import lab.labproject.attacks.PhysicalMove.Crunch;
import lab.labproject.attacks.StatusMove.DoubleTeam;
import lab.labproject.attacks.StatusMove.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Patrat extends Pokemon{
    Pokemon patrat;
    public Patrat() {
        this.patrat = new Pokemon("Patrat", 28);
        this.setStats(45.0, 55.0, 39.0, 35.0, 39.0, 42.0);
        this.setType(Type.NORMAL);
        this.addMove(new Crunch());
        this.addMove(new DoubleTeam());
        this.addMove(new WorkUp());
    }

}
