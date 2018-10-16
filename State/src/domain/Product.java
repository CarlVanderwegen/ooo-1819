package domain;

public class Product {
    private String naam;
    private double aankoopprijs;
    private State state;

    public final State UITGELEEND;
    public final State UITLEENBAAR;
    public final State BESCHADIGD;
    public final State VERWIJDERD;


    public Product(String naam, double aankoopprijs) {
        UITGELEEND = new UitgeleendState(this);
        UITLEENBAAR = new UitleenbaarState(this);
        BESCHADIGD = new BeschadigdState(this);
        VERWIJDERD = new VerwijderdState(this);

        setNaam(naam);
        setAankoopprijs(aankoopprijs);
        state = UITLEENBAAR;
    }

    public void setState(State s) {
        this.state = s;
    }


    private void setNaam(String n) {
        this.naam = n;
    }

    private void setAankoopprijs(double ap) {
        this.aankoopprijs = ap;
    }

    public State getUitgeleendState() {
        return this.UITGELEEND;
    }

    public State getUitleenbaarState() {
        return this.UITLEENBAAR;
    }

    public State getBeschadigdState() {
        return this.BESCHADIGD;

    }

    public State getVerwijderdState() {
        return this.VERWIJDERD;
    }


}
