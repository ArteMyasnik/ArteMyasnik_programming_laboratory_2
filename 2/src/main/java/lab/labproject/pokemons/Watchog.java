package lab.labproject.pokemons;
import lab.labproject.attacks.PhysicalMove.Crunch;
import lab.labproject.attacks.SpecialMove.Thunder;
import lab.labproject.attacks.StatusMove.DoubleTeam;
import lab.labproject.attacks.StatusMove.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Watchog extends Pokemon{
    Pokemon watchog;
    public Watchog() {
        this.watchog = new Pokemon("Watchog", 16);
        this.setStats(60.0, 85.0, 69.0, 60.0, 69.0, 77.0);
        this.setType(Type.NORMAL);
        this.addMove(new Crunch());
        this.addMove(new DoubleTeam());
        this.addMove(new WorkUp());
        this.addMove(new Thunder());
    }

}
