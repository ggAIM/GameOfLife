
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
     
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        
    }

    @Override
    public void turnToDead(int i, int i1) {
        
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        
        return -1;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        
    }
    
}
