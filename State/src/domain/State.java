package domain;

public abstract class State {
    public void uitlenen() {
        throw new IllegalArgumentException();
    }

    public void herstellen() {
        throw new IllegalArgumentException();
    }

    public void terugbrengen () {
        throw new IllegalArgumentException();
    }

    public void verwijderen() {
        throw new IllegalArgumentException();
    }
}
