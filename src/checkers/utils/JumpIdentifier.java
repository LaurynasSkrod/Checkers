package checkers.utils;
import checkers.Board;
import checkers.actions.*;
import checkers.model.*;

public class JumpIdentifier {
    public  Jump identifyJump(Move move, Board board) {
        if (move.getNowA() < move.getNewA() && move.getNowB() < move.getNewB() && " ".equals(board.getBoard()[move.getNewA() * 2 + 2][move.getNewB() * 2 + 2])){
            return new JumpSE();
        }
        else if (move.getNowA() > move.getNewA() && move.getNowB() > move.getNewB() && " ".equals(board.getBoard()[move.getNewA() * 2 - 2][move.getNewB() * 2 - 2])){
            return new JumpNW();
        }
        else if (move.getNowA() < move.getNewA() && move.getNowB() > move.getNewB() && " ".equals(board.getBoard()[move.getNewA() * 2 + 2][move.getNewB() * 2 - 2])){
            return new JumpSW();
        }
        else if (move.getNowA() > move.getNewA() && move.getNowB() < move.getNewB() && " ".equals(board.getBoard()[move.getNewA() * 2 - 2][move.getNewB() * 2 + 2])) {
            return new JumpNE();
        }
        return null;
    }
}