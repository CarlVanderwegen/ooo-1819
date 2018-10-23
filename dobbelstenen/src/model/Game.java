package model;

import java.util.ArrayList;

public class Game implements Observable {
    private ArrayList<Observer> spelers;
    int round;

    public Game() {
        round = 1;
        spelers = new ArrayList<>();
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
}
