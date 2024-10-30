package lab.labproject.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public final class Thunder extends SpecialMove {
    SpecialMove thunder;
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected String describe() {
        return "A wicked thunderbolt is dropped on the target to inflict damage. This may also leave the target with paralysis";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect1 = new Effect().chance(0.3);
        if (effect1.success()) Effect.paralyze(pokemon);
    }
}
