package lab.labproject.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public final class IceFang extends PhysicalMove {
    PhysicalMove iceFang;
    public IceFang() {
        super(Type.ICE, 65, 95);
    }

    @Override
    protected String describe() {
        return "The user bites with cold-infused fangs. This may also make the target flinch or leave it frozen";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect1 = new Effect().chance(0.1);
        if (effect1.success()) Effect.flinch(pokemon);
        Effect effect2 = new Effect().chance(0.1);
        if (effect2.success()) Effect.freeze(pokemon);
    }
}
