package domain;

public abstract class Product {
    private String name;
    private int id;

    public String getName() {
        return this.name;
    }

    public void setName (String n) {
        if (n != null && !n.trim().isEmpty()) {
            this.name = n;
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public abstract double getPrice() ;
}
