package domain;

public class Game extends Product {

    public Game(String naam, int id) {
        setName(naam);
        setId(id);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
