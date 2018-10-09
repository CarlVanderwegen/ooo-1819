package domain;

public class Product {
    private String naam;
    private double aankoopprijs;
    public Product(String naam, double aankoopprijs) {
        setNaam(naam);
        setAankoopprijs(aankoopprijs);
    }

    private void setNaam(String n) {
        this.naam = n;
    }

    private void setAankoopprijs(double ap) {
        this.aankoopprijs = ap;
    }
}
