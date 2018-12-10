package checkers.actions;

import checkers.Board;
import checkers.model.Move;
import checkers.units.Unit;

public class TurnKing {

    public void turnKing(Move move, Unit unit, Board board) {
        if (unit.getType().equals("X") && move.getNewA() == 8) {
            board.board[move.getNewA() * 2][move.getNewB() * 2] = "K";
        } else if (unit.getType().equals("O") && move.getNewA() == 1) {
            board.board[move.getNewA() * 2][move.getNewB() * 2] = "Q";
        }
    }
}
