package domain.model;

public class Product {
    String title;
    int id;
    double prijs;

    public Product(String title, int id, double prijs) {
        setId(id);
        setPrijs(prijs);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    protected double getPrijs() {
        return prijs;
    }

    protected void setPrijs(double prijs) {
        this.prijs = prijs;
    }


}
