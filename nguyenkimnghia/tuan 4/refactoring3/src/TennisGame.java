public class TennisGame extends Exception{
    private int player1;
    private int player2;

    private boolean endGame = false;

    public TennisGame() {

    }

    public TennisGame(int player1, int player2, boolean endGame) {
        this.player1 = player1;
        this.player2 = player2;
        this.endGame = endGame;
    }

    private void checkEndGame() {
        if (player1 >= 4 && player1 - player2 >= 2) {
            endGame = true;
        } else if (player2 >= 4 && player2 - player1 >= 2) {
            endGame = true;
        }
    }

    private String getScore(int points) {
        switch (points) {
            case 0:
                return "love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "40";
        }
    }

    public String getScore(){
        String player1Score = getScore(player1);
        String player2Score = getScore(player2);

        if (endGame){
            if (player1 > player2){
                return "player 1 win";
            }else {
                return "player 2 win";
            }
        }

        if (player1 >= 4 && player1 - player2 == 1)
            return "player1 has advantage";

        if (player2 > 4 && player2 - player1 == 1)
            return "player2 has advantage";

        return  player2Score + " - " + player1Score;
    }


}
