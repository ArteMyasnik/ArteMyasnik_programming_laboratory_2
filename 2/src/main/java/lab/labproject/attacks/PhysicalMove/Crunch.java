package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class Crunch extends PhysicalMove {
    PhysicalMove crunch;
    public Crunch() {
        this.crunch = new PhysicalMove(Type.DARK, 80, 100);
    }

    @Override
    protected String describe() {
        return "The user crunches up the target with sharp fangs. This may also lower the target’s Defense stat";
    }
}

