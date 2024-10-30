package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class Agility extends StatusMove {
    StatusMove agility;
    public Agility() { super(Type.PSYCHIC, 0, 0); // two minuses
    }

    @Override
    protected String describe() {
        return "The user relaxes and lightens its body to move faster. This sharply raises the Speed stat";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) + 2));
    }
}
