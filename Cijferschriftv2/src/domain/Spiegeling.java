package domain;

public class Spiegeling implements Geheimschrift {
    public Spiegeling() {

    }

    public String codeer(String text) {
        String code = "";
        for (int i = text.length()-1; i >= 0; i--) {
            code += text.charAt(i);
        }
        return code;
    }

    public String decodeer(String code) {
        return codeer(code);
    }
}
