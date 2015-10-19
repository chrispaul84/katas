package gameoflife;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 18/10/15
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    private List<Cell> cells = Lists.newArrayList();

    public Board(){}

    private Board(List<Cell> cells){
        this.cells = cells;
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public List<Cell> getNeighbours(Cell cell) {
        List<Cell> neighbours = Lists.newArrayList();

        List<Cell> potentialNeighbours = getNeighbourHood(cell);
        for (Cell potentialNeighbour : potentialNeighbours){
            if (!potentialNeighbour.equals(cell) && isAlive(potentialNeighbour)){
                neighbours.add(potentialNeighbour);
            }
        }
        return neighbours;
    }

    boolean isAlive(Cell boardCell) {
        return cells.contains(boardCell);
    }

    private List<Cell> getNeighbourHood(Cell cell) {
        List<Cell> neighbourHood = Lists.newArrayList();
        for (int dy = -1; dy < 2; dy++){
            int y = dy+cell.getY();
            for (int dx = -1; dx < 2; dx++){
                int x = dx+cell.getX();
                neighbourHood.add(new Cell(x, y));
            }
        }
        neighbourHood.remove(cell);
        return neighbourHood;
    }

    public Board iterate() {
        List<Cell> newBoardCells = Lists.newArrayList();
        for (Cell cell : cells){
            if (shouldLive(cell)){
                newBoardCells.add(cell);
            }
            List<Cell> potentialCells = getNeighbourHood(cell);
            for (Cell potentialCell : potentialCells){
                if (shouldBeReborn(potentialCell)){
                    newBoardCells.add(potentialCell);
                }
            }
        }
        return new Board(newBoardCells);
    }

    private boolean shouldBeReborn(Cell potentialCell) {
        if (isAlive(potentialCell)){
            return false;
        }
        List<Cell> neighbours = getNeighbours(potentialCell);
        return neighbours.size() == 3;
    }

    private boolean shouldLive(Cell cell) {
        List<Cell> neighbours = getNeighbours(cell);
        return neighbours.size() == 2 || neighbours.size() == 3;
    }
}
