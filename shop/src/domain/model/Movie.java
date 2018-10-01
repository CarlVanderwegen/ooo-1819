package domain.model;

public class Movie extends Product {

    public Movie(String naam, int id) {
        setName(naam);
        setId(id);
    }


    @Override
    public double getPrice(int d) {
        double price = 5;
        int daysLeft = d - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
