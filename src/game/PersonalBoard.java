package game;

import gameoflife.GameOfLifeBoard;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {

    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (i >= 0 && i <= getWidth() && i1 >= 0 && i1 <= getHeight()) {
            return getBoard()[i][i1];
        } else {
            return false;
        }
    }

    /*
    @Override
    public void turnToLiving(int i, int i1) {
        boolean[][] board = getBoard();
        if (i >= 0 && i <= getHeight() && i1 >= 0 && i1 <= getWidth()) {
            int neighbourCount = getNumberOfLivingNeighbours(i, i1);

            if (board[i][i1] == true) {
                if (neighbourCount == 2 || neighbourCount == 3) {
                    board[i][i1] = true;
                } else {
                    board[i][i1] = false;
                }
            } else {
                if (neighbourCount == 3) {
                    board[i][i1] = true;
                } else {
                    board[i][i1] = false;
                }
            }
        }

    }

     */
    @Override
    public void turnToLiving(int i, int i1) {
        if (i >= 0 && i <= getWidth() && i1 >= 0 && i1 <= getHeight()) {
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (i >= 0 && i <= getWidth() && i1 >= 0 && i1 <= getHeight()) {
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int counter = 0;
//        int rowPos = i - 1;
//        int columnPos = i1 - 1;
//        int finalRowPos = i + 1;
//        int finalColumnPos = i1 + 1;
//
//        if (rowPos < 0) {
//            rowPos = 0;
//        }
//
//        if (columnPos < 0) {
//            columnPos = 0;
//        }
//
//        if (finalRowPos > getHeight()) {
//            finalRowPos = getHeight();
//        }
//
//        if (finalColumnPos > getWidth()) {
//            finalColumnPos = getWidth();
//        }
//
//        boolean[][] board = getBoard();
//        for (; rowPos < finalRowPos; rowPos++) {
//            for (; columnPos < finalColumnPos; columnPos++) {
//                if (rowPos != i && columnPos != i1) {
//                    if (board[rowPos][columnPos]) {
//                        counter++;
//                    }
//                }
//
//            }
//        }

        return counter;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {

    }

}
