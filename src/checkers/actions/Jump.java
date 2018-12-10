package checkers.actions;
import checkers.Board;
import checkers.model.Move;
import checkers.units.Unit;

public abstract class Jump {
    abstract public void doJump(Board board, Move move, Unit unit);
}
