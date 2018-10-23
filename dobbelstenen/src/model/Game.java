package model;

import java.util.ArrayList;

public class Game implements Observable {
    private ArrayList<Observer> spelers;
    int round;
    private Dice dice;

    public Game() {
        round = 1;
        spelers = new ArrayList<>();
        dice = new Dice();
    }


    @Override
    public void registerObserver(Observer o) {
        spelers.add((o));
    }

    @Override
    public void removeObserver(Observer o) {
        spelers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : spelers) {
            o.update();

        }
    }

    public int getThrowScore(int vorige) {
        int een = dice.getDiceRoll();
        int twee = dice.getDiceRoll();

        if (een == twee) {
            return een * 4;
        } else if (een + twee == vorige) {
            return vorige + 5;
        } else {
            return een + twee;
        }
    }
}
