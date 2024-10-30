package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class WorkUp extends StatusMove {
    StatusMove workUp;
    public WorkUp() { super(Type.NORMAL, 0, 0); // two minuses
    }

    @Override
    protected String describe() {
        return "The user is roused, and its Attack and Sp. Atk stats increase";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, (int) (pokemon.getStat(Stat.SPECIAL_ATTACK) + 1));
    }
}
