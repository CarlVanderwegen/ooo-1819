package domain;

public class Game extends Product {

    public Game(String naam) {
        setName(naam);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
