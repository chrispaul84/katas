package tennis;

import org.junit.Before;
import tennis.TennisGame;

import static org.junit.Assert.assertEquals;

public class TennisGameTests {

    private String player1 = "boris";
    private String player2 = "pete";
    private TennisGame game;

    @Before
    public void setup(){
        game = new TennisGame(player1, player2);
    }

//    @Test
//    public void newGame(){
//        assertEquals("love all", game.getScore());
//    }

//    @Test
//    public void fifteenLove(){
//        game.playerOneScore();
//        assertEquals(player1 + ": 15, " + player2 + ": love", game.getScore());
//    }
//
//    @Test
//    public void fifteenAll(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        assertEquals("15 all", game.getScore());
//    }
//
//    @Test
//    public void thirtyFifteen(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        assertEquals(player1 + ": 30, "+player2+": 15", game.getScore());
//    }
//
//    @Test
//    public void fourtyFifteen(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerOneScore();
//        assertEquals(player1 + ": 40, "+player2+": 15", game.getScore());
//    }
//
//    @Test
//    public void playerOneAdvantage(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        assertEquals("Advantage "+player1, game.getScore());
//    }
//
//    @Test
//    public void playerOneWinsEasy(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerOneScore();
//        game.playerOneScore();
//        assertEquals(player1+ " wins", game.getScore());
//    }
//
//    @Test
//    public void deuce(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        assertEquals("deuce", game.getScore());
//    }
//
//    @Test
//    public void loveFifteen(){
//        game.playerTwoScore();
//        assertEquals(player1+ ": love, "+player2+": 15", game.getScore());
//    }
//
//    @Test
//    public void playerTwoAdvantage(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerTwoScore();
//        assertEquals("Advantage "+player2, game.getScore());
//    }
//
//    @Test
//    public void player1DeuceAfterAdvantage(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        assertEquals("deuce", game.getScore());
//    }
//
//    @Test
//    public void player2DeuceAfterAdvantage(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        assertEquals("deuce", game.getScore());
//    }
//
//    @Test
//    public void player2WinsCloseGame(){
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerTwoScore();
//        game.playerOneScore();
//        game.playerTwoScore();
//        game.playerTwoScore();
//        assertEquals(player2+ " wins", game.getScore());
//    }
}
