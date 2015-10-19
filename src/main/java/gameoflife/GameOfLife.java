package gameoflife;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 18/10/15
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 */
public class GameOfLife {

    private Board board;

    public GameOfLife(Board board) {
        this.board = board;
    }

    public Board iterate() {
        Board newBoard = board.iterate();
        return newBoard;
    }
}
