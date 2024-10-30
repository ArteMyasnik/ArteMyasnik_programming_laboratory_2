package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class ThunderWave extends StatusMove {
    StatusMove thunderWave;
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    } // first minuses

    @Override
    protected String describe() {
        return "The user launches a weak jolt of electricity that paralyzes the target";
    }
}
