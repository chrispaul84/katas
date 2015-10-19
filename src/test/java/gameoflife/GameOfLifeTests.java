package gameoflife;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameOfLifeTests {

    @Test
    public void aSingleCellShouldDie(){
        Board board = new Board();
        Cell cell = new Cell(1, 1);
        board.addCell(cell);
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertFalse(newBoard.isAlive(cell));
    }

    @Test
    public void aCellWithOneNeighbourShouldDie(){
        Board board = new Board();
        Cell cell = new Cell(1, 1);
        board.addCell(cell);
        board.addCell(new Cell(2, 2));
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertFalse(newBoard.isAlive(cell));
    }

    @Test
    public void aCellWithTwoNeighboursShouldLive(){
        Board board = new Board();
        Cell cell = new Cell(1, 1);
        board.addCell(cell);
        board.addCell(new Cell(1,2));
        board.addCell(new Cell(2,2));
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertTrue(newBoard.isAlive(cell));
    }

    @Test
     public void aCellWithThreeNeighboursShouldLive(){
        Board board = new Board();
        Cell cell = new Cell(1, 1);
        board.addCell(cell);
        board.addCell(new Cell(1,2));
        board.addCell(new Cell(2,1));
        board.addCell(new Cell(2,2));
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertTrue(newBoard.isAlive(cell));
    }

    @Test
    public void aCellWithMoreThanThreeNeighboursShouldDie(){
        Board board = BoardTests.createFilledBoard(3);
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertFalse(newBoard.isAlive(new Cell(2, 2)));
    }

    @Test
    public void aDeadCellWithThreeNeighboursShouldBeReborn(){
        Board board = new Board();
        board.addCell(new Cell(1,2));
        board.addCell(new Cell(2,1));
        board.addCell(new Cell(2,2));
        GameOfLife game = new GameOfLife(board);
        Board newBoard = game.iterate();
        assertTrue(newBoard.isAlive(new Cell(1, 1)));
    }
}
