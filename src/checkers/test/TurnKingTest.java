package checkers.test;

import checkers.Board;
import checkers.actions.TurnKing;
import checkers.model.Move;
import checkers.units.Unit;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnKingTest {
    Move move = new Move(6, 8, 1, 2);
    Board board = Board.getInstance();
    Unit unit = new Unit("X");
    TurnKing turnKing = new TurnKing();

    @Test
    public void turnKingQ() {
        turnKing.turnKing(move,unit,board);
        assertEquals("Q",board.board[move.getNewA() * 2][move.getNewB() * 2]);

    }
    @Test
    public void turnKingK() {
        turnKing.turnKing(move,unit,board);
        assertEquals("K",board.board[move.getNewA() * 2][move.getNewB() * 2]);

    }
}