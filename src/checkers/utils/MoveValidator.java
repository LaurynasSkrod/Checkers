package checkers.utils;

import checkers.Board;
import checkers.units.Unit;
import checkers.model.Move;

public class MoveValidator {

    public boolean moveInBoundaries(Move move) {
        return (move.getNowA() < 9 && move.getNowB() < 9 && move.getNewA() < 9 && move.getNewB() < 9 && move.getNowA() > 0 && move.getNowB() > 0 && move.getNewA() > 0 && move.getNewB() > 0);
    }

    private boolean isOpponent(Unit unit, Move move, Board board) {
        return (!unit.getType().equals(board.getBoard()[move.getNewA() * 2][move.getNewB() * 2]) && !" ".equals(board.getBoard()[move.getNewA() * 2][move.getNewB() * 2]));
    }

    public boolean moveValid(Move move) {
        return ((Math.abs(move.getNowA() - move.getNewA()) == 1) && (Math.abs(move.getNowB() - move.getNewB()) == 1));
    }

    public boolean isJump(Unit unit, Move move, Board board) {
        return (unit.getType().equals(board.getBoard()[move.getNowA() * 2][move.getNowB() * 2]) && (isOpponent(unit, move, board)));
    }
    public boolean isBasicMoveValid(Unit unit, Move move){
        if(unit.getType().equals("X") && move.getNowA()<move.getNewA()){
            return true;
        } else if(unit.getType().equals("O") && move.getNowA()>move.getNewA()){
            return true;
        }
        return false;
    }

    public boolean isMove(Unit unit, Move move, Board board) {
        return (unit.getType().equals(board.getBoard()[move.getNowA() * 2][move.getNowB() * 2]) && (" ".equals(board.getBoard()[move.getNewA() * 2][move.getNewB() * 2])));
    }
}

