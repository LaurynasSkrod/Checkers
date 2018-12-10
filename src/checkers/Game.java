package checkers;

import checkers.actions.TurnKing;
import checkers.units.Unit;
import checkers.model.Move;
import checkers.utils.CoordinatesReader;
import checkers.utils.GameRender;
import checkers.utils.JumpIdentifier;
import checkers.utils.MoveValidator;

public class Game {
    private JumpIdentifier jumpIdentifier;
    private GameRender gameRender;
    private CoordinatesReader inputReader;
    private MoveValidator moveValidator;
    private Board board;
    private TurnKing turnKing;
    private GameEnd gameEnd;

    Game() {
        this.gameEnd = new GameEnd();
        this.turnKing = new TurnKing();
        this.gameRender = new GameRender();
        this.board = Board.getInstance();
        this.moveValidator = new MoveValidator();
        this.inputReader = new CoordinatesReader();
        this.jumpIdentifier = new JumpIdentifier();
        gameRender.renderBoard(board);
    }

    public void start() {
        var move = inputReader.getCoordinates();
        var unitX = new Unit("X");
        var unitO = new Unit("O");
        var unitK = new Unit("K");
        var unitQ = new Unit("Q");
        if (moveValidator.moveInBoundaries(move)) {
            if (moveValidator.moveValid(move)) {
                if (moveValidator.isJump(unitX, move, board)) { //isJump type X
                    jump(unitX, move);
                } else if (moveValidator.isJump(unitO, move, board)) { //isJump type O
                    jump(unitO, move);
                } else if (moveValidator.isJump(unitK, move, board)) { //isMove type X
                    move(unitK, move);
                } else if (moveValidator.isJump(unitQ, move, board)) { //isJump type Q
                    jump(unitQ, move);
                } else if (moveValidator.isMove(unitX, move, board)) {
                    if (moveValidator.isBasicMoveValid(unitX, move)) {
                        move(unitX, move);
                    } else {
                        System.out.println("Blogai ivestos koordinates");
                        return;
                    }
                } else if (moveValidator.isMove(unitO, move, board)) { //isMove type O
                    if (moveValidator.isBasicMoveValid(unitO, move)) {
                        move(unitO, move);
                    } else {
                        System.out.println("Blogai ivestos koordinates");
                        return;
                    }
                } else if (moveValidator.isMove(unitK, move, board)) {
                    move(unitK, move);
                } else if (moveValidator.isMove(unitQ, move, board)) {
                    move(unitQ, move);
                } else {
                    System.out.println("Blogai ivestos koordinates");
                    return;
                }
                turnKing.turnKing(move, unitX, board);
                turnKing.turnKing(move, unitO, board);
                gameRender.renderBoard(board);
            }
        }
        gameEnd.endGame();
    }

    private void jump(Unit unit, Move move) {
        var jump = jumpIdentifier.identifyJump(move, board);
        if (jump == null) {
            System.out.println("Blogai ivestos koordinates.");
        } else {
            jump.doJump(board, move, unit);
            board.clearJumpUnit(move);
        }

    }

    private void move(Unit unit, Move move) {
        board.getBoard()[move.getNewA() * 2][move.getNewB() * 2] = unit.getType();
        board.clearMoveUnit(move);
    }

}
