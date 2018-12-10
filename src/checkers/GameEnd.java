package checkers;

import java.io.IOException;

public class GameEnd {
    Board board = Board.getInstance();
    public void endGame() {
        if (board.countOUnits() == 0 || board.countXUnits() == 0) {
            System.out.println("GAME OVER!!!!");
            System.exit(0);
        }
        else{
            System.out.println("O liko: "+board.countOUnits());
            System.out.println("X liko: "+board.countXUnits());
        }
    }
}
