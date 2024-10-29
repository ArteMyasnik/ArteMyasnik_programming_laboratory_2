package lab.labproject.pokemons;
import lab.labproject.attacks.PhysicalMove.FeintAttack;
import lab.labproject.attacks.PhysicalMove.IceFang;
import lab.labproject.attacks.PhysicalMove.IronHead;
import lab.labproject.attacks.PhysicalMove.RockTomb;
import ru.ifmo.se.pokemon.*;

public class Mawile extends Pokemon {
    Pokemon mawile;
    public Mawile() {
        this.mawile = new Pokemon("Mawile", 36);
        this.setStats(50.0, 85.0, 85.0, 55.0, 55.0, 50.0);
        this.setType(Type.STEEL, Type.FAIRY);
        this.addMove(new RockTomb());
        this.addMove(new FeintAttack());
        this.addMove(new IceFang());
        this.addMove(new IronHead());
    }
    
}
