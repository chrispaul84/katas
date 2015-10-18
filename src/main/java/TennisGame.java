public class TennisGame {

    private String player1;
    private String player2;
    private int player1Score = 0;
    private int player2Score = 0;

    public TennisGame(String player1, String player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {

        if (isWinner()) {
            return playerWithHighestScore()+" wins";
        }
        if (isDeuce()) {
            return "deuce";
        }
        if (isTied()) {
            return getScoreWord(player1Score) + " all";
        }
        if (isAdvantage()){
            return "Advantage " + playerWithHighestScore();
        }
        return getDifferentScoreString();
    }

    private String playerWithHighestScore() {
        if (player1Score > player2Score){
            return player1;
        } else {
            return player2;
        }
    }

    private boolean isAdvantage() {
        int scoreDifference = getScoreDifference();
        return scoreDifference == 1 && (player1Score == 3 || player2Score == 3);
    }

    private int getScoreDifference() {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference < 0){
            scoreDifference *= -1;
        }
        return scoreDifference;
    }

    private String[] words = {"love", "15", "30", "40"};
    private String getScoreWord(int score){
        return words[score];
    }

    private String getDifferentScoreString(){
        return player1+": "+getScoreWord(player1Score)+", "+player2+": "+getScoreWord(player2Score);
    }

    public void playerOneScore() {
        if (player2Score == 4){
            player1Score = 3;
            player2Score = 3;
        } else {
            player1Score++;
        }
    }

    public void playerTwoScore() {
        if (player1Score == 4){
            player1Score = 3;
            player2Score = 3;
        } else {
            player2Score++;
        }
    }

    public boolean isDeuce() {
        return player1Score == 3 && player2Score == 3;
    }

    public boolean isTied() {
        return player1Score == player2Score && player1Score < 3;
    }

    public boolean isWinner() {
        int scoreDifference = getScoreDifference();
        return scoreDifference >= 2 && (player1Score >= 4 || player2Score >= 4);
    }
}
