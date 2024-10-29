package lab.labproject.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public final class ChargeBeam extends SpecialMove {
    SpecialMove chargeBeam;
    public ChargeBeam() {
        this.chargeBeam = new SpecialMove(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected String describe() {
        return "The user attacks the target with an electric charge. The residual electricity may also boost the user’s Sp. Atk stat";
    }
}
