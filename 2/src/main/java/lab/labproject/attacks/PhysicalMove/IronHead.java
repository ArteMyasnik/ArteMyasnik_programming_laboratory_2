package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class IronHead extends PhysicalMove {
    PhysicalMove ironHead;
    public IronHead() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected String describe() {
        return "The user slams the target with its steel-hard head. This may also make the target flinch";
    }
}
