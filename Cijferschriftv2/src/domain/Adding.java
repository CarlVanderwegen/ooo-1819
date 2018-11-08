package domain;

public class Adding implements Geheimschrift {
    public Adding() {

    }

    public String codeer(String text) {
        char[] chars = text.toCharArray();
        char[] coded = new char[chars.length];
        for (int i = 1; i < text.length(); i++) {
            char current = chars[i];
            current += chars[i-1];
            current %=127;
            coded[i] = current;
        }


        return coded.toString();
    }

    public String decodeer(String code) {
        return "";
    }
}
