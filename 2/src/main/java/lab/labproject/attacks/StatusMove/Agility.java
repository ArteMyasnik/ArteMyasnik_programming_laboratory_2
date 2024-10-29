package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class Agility extends StatusMove {
    StatusMove agility;
    public Agility() {
        this.agility = new StatusMove(Type.PSYCHIC, 0, 0); // two minuses
    }

    @Override
    protected String describe() {
        return "The user relaxes and lightens its body to move faster. This sharply raises the Speed stat";
    }

}
