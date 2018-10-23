package model;

public class SpelerScores {
    private Dice dice;
    private int vorigescore;
    private int [] spelersscores;
    public SpelerScores() {
        spelersscores = new int[3];
        dice = new Dice();
        vorigescore = 0;
    }

    public void getSpeler(int spelerNummer) {
    }

    private int getOnePlay() {
        int score1 = dice.getDiceRoll();
        int score2 = dice.getDiceRoll();

        int totaal = score1+score2;

        if (score1 == score2) {
            totaal *= 2;
        }

        if (totaal == vorigescore) {
            totaal += 5;
        }

        vorigescore = totaal;
        return totaal;
    }
}
