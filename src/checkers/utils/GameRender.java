package checkers.utils;

import checkers.Board;

public class GameRender {
    public GameRender() { }

    public void renderBoard(Board board) {
        for (int i = 0; i < board.getHeight(); i++) {
            for (int j = 0; j < board.getWidth(); j++) {
                System.out.print(board.getBoard()[i][j]);
            }
            System.out.println();
        }
    }
}
