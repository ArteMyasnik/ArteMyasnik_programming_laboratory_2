package lab.labproject.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public final class ChargeBeam extends SpecialMove {
    SpecialMove chargeBeam;
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected String describe() {
        return "The user attacks the target with an electric charge. The residual electricity may also boost the user’s Sp. Atk stat";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, (int) pokemon.getStat(Stat.SPECIAL_ATTACK) + 1));
    }
}
