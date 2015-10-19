package gameoflife;

import com.google.common.collect.Lists;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BoardTests {

    @Test
    public void aSingleCellHasNoNeighbours(){
        Board board = new Board();
        Cell cell = new Cell(1,1);
        board.addCell(cell);
        List<Cell> neighbours = board.getNeighbours(cell);
        List<Cell> expectedNeighbours = Lists.newArrayList();
        assertEquals(expectedNeighbours, neighbours);
    }

    @Test
    public void twoAdjacentCellsAreNeighbours(){
        Board board = new Board();
        Cell cell = new Cell(1,1);
        board.addCell(cell);
        Cell cell2 = new Cell(1,2);
        board.addCell(cell2);
        List<Cell> neighbours = board.getNeighbours(cell);
        List<Cell> expectedNeighbours = Lists.newArrayList(cell2);
        assertEquals(expectedNeighbours, neighbours);
    }

    @Test
    public void twoDistantCellsAreNotNeighbours(){
        Board board = new Board();
        Cell cell = new Cell(1,1);
        board.addCell(cell);
        Cell cell2 = new Cell(1,3);
        board.addCell(cell2);
        List<Cell> neighbours = board.getNeighbours(cell);
        List<Cell> expectedNeighbours = Lists.newArrayList();
        assertEquals(expectedNeighbours, neighbours);
    }

    @Test
    public void middleCellIn3x3BoardHasEightNeighbours(){
        Board board = createFilledBoard(3);
        List<Cell> neighbours = board.getNeighbours(new Cell(2, 2));
        assertEquals(8, neighbours.size());
    }

    static Board createFilledBoard(int size) {
        Board board = new Board();
        for (int i = 1; i < size+1; i++){
            for (int j = 1; j < size+1; j++){
                board.addCell(new Cell(i, j));
            }
        }
        return board;
    }
}
