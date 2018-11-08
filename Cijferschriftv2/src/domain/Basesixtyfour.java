package domain;

import java.util.Base64;

public class Basesixtyfour implements Geheimschrift{


    @Override
    public String codeer(String text) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(text.getBytes());

    }

    @Override
    public String decodeer(String code) {
        Base64.Decoder decoder = Base64.getDecoder();

        return decoder.decode(code).toString();
    }
}
