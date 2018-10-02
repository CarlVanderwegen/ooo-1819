package domain.model;

public class CD extends Product {

    public CD (String naam, int id) {
        setName(naam);
        setId(id);
    }

    public double getPrice(int d) {
        return 1.5*d;
    }
}
