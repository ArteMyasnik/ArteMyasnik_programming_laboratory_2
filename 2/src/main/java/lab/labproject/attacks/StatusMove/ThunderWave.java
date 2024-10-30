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

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect1 = new Effect().chance(1);
        if (effect1.success()) Effect.paralyze(pokemon);
        effect1.attack(0.25);
        pokemon.setMod(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) * 0.5));
    }

}
