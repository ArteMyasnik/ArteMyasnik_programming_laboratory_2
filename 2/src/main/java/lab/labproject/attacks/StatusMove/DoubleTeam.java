package lab.labproject.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove {
    StatusMove doubleTeam;
    public DoubleTeam() {
        this.doubleTeam = new StatusMove(Type.NORMAL, 0, 0);
    } // two minuses

    @Override
    protected String describe() {
        return "By moving rapidly, the user makes illusory copies of itself to raise its evasiveness";
    }
}
