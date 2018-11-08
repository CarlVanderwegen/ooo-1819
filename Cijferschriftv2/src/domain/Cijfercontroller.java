package domain;

public class Cijfercontroller {
    Geheimschrift schrift;

    public Cijfercontroller(Geheimschrift s) {
        setGeheimschrift(s);

    }

    public void setGeheimschrift(Geheimschrift s) {
        this.schrift = s;
    }

    public String codeer(String text) {
        return schrift.codeer(text);
    }

    public String decodeer(String code) {
        return schrift.decodeer(code);
    }
}
