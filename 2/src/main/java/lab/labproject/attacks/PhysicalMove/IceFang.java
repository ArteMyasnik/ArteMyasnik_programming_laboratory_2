package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class IceFang extends PhysicalMove {
    PhysicalMove iceFang;
    public IceFang() {
        this.iceFang = new PhysicalMove(Type.ICE, 65, 95);
    }

    @Override
    protected String describe() {
        return "The user bites with cold-infused fangs. This may also make the target flinch or leave it frozen";
    }
}
