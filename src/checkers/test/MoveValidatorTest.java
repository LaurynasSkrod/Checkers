package checkers.test;

import checkers.Board;
import checkers.model.Move;
import checkers.units.Unit;
import checkers.utils.MoveValidator;

import static org.junit.Assert.*;

public class MoveValidatorTest {
    MoveValidator moveValidator = new MoveValidator();
    Move move = new Move(6,5,1,2);
    Board board = Board.getInstance();
    Unit unit = new Unit("O");
    @org.junit.Test
    public void moveInBoundaries() {

        assertTrue("Is Move Valid?",moveValidator.moveInBoundaries(move));
    }

    @org.junit.Test
    public void moveValid() {
        assertTrue(moveValidator.moveValid(move));
    }

    @org.junit.Test
    public void isJump() {
        assertTrue(moveValidator.isJump(unit,move,board));
    }

    @org.junit.Test
    public void isMove() {
        assertTrue(moveValidator.isMove(unit,move,board));
    }
}