package model;

import java.util.Random;

public class Dice {
    Random random ;
    public Dice() {
        random = new Random();
    }

    public int getDiceRoll() {
        return random.nextInt(6) + 1;
    }
}
