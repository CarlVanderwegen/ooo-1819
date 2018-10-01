package domain;

public class Movie extends Product {

    public Movie(String naam, int id) {
        setName(naam);
        setId(id);
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
