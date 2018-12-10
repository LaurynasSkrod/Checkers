/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import checkers.model.Move;

public class Board {
    private static Board instance;
    public String[][] board = new String[][]{
            {" ", "|", "1", "|", "2", "|", "3", "|", "4", "|", "5", "|", "6", "|", "7", "|", "8", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"1", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"2", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"3", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|", " ", "|", "X", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"4", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"5", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"6", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"7", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"8", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|", "O", "|", " ", "|"},
    };

    private Board() {
    }

    public String[][] getBoard() {
        return board;
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    public int getHeight() {
        return board.length;
    }

    public int getWidth() {
        return board[0].length;
    }

    public void clearJumpUnit(Move move) {
        board[move.getNowA() * 2][move.getNowB() * 2] = " ";
        board[move.getNewA() * 2][move.getNewB() * 2] = " ";
    }

    public void clearMoveUnit(Move move) {
        board[move.getNowA() * 2][move.getNowB() * 2] = " ";
    }

    public int countOUnits() {
        int countO = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (board[i][j].equals("O") || board[i][j].equals("Q")) {
                    countO++;
                }
            }

        }
        return countO;
    }

    public int countXUnits() {
        int countX = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (board[i][j].equals("X") || board[i][j].equals("K")) {
                    countX++;
                }

            }

        }
        return countX;
    }
}
