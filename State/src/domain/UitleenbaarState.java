package domain;

public class UitleenbaarState extends State {
    private Product product;
    public UitleenbaarState(Product p){
        this.product = p;
    }

    @Override
    public void uitlenen() {
        product.setState(product.getUitgeleendState());
    }

    @Override
    public void verwijderen() {
        product.setState(product.getVerwijderdState());
    }
}
