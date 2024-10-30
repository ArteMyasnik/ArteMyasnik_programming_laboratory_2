package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {
    StatusMove tailWhip;
    public TailWhip() {
    super(Type.NORMAL, 0, 100);
    } // first minuses
    @Override
    protected String describe() {
        return "The user wags its tail cutely, making opposing Pokémon less wary. This lowers their Defense stats";
    }
}
