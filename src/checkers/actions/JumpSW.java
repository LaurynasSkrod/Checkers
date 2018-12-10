package checkers.actions;

import checkers.Board;
import checkers.model.Move;
import checkers.units.Unit;

public class JumpSW extends Jump {

    public JumpSW() {
    }

    @Override
    public void doJump(Board board, Move move, Unit unit) {
        board.getBoard()[move.getNewA() * 2 + 2][move.getNewB() * 2 - 2] = unit.getType();
    }
}
