package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class FeintAttack extends PhysicalMove {
    PhysicalMove feintAttack;
    public FeintAttack() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return "This move can’t be used. It’s recommended that this move is forgotten. Once forgotten, this move can’t be remembered";
    }
}
