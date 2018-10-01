package domain;

public class Movie extends Product {

    public Movie(String naam) {
        setName(naam);
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
