package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class RockTomb extends PhysicalMove {
    PhysicalMove rockTomb;
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected String describe() {
        return "The user hurls boulders at the target to inflict damage. This also lowers the target’s Speed stat by cutting off its movement";
    }
    
}
