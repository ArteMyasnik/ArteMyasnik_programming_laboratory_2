package lab.labproject.pokemons;
import lab.labproject.attacks.SpecialMove.ChargeBeam;
import lab.labproject.attacks.StatusMove.Agility;
import lab.labproject.attacks.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pokemon{
    Pokemon pikachu;
    public Pikachu() {
        super("Pikachu", 24);
        this.setStats(35.0, 55.0, 40.0, 50.0, 50.0, 90.0);
        this.setType(Type.ELECTRIC);
        this.addMove(new ChargeBeam());
        this.addMove(new ThunderWave());
        this.addMove(new Agility());
    }

}