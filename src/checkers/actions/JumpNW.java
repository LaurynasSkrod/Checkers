package checkers.actions;

import checkers.Board;
import checkers.model.Move;
import checkers.units.Unit;

public class JumpNW extends Jump {

    public JumpNW() {
    }

    @Override
    public void doJump(Board board, Move move, Unit unit) {
        board.getBoard()[move.getNewA() * 2 - 2][move.getNewB() * 2 - 2] = unit.getType();
    }
}
