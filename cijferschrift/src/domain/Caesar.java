package domain;

public class Caesar implements Geheimschrift {
    
    public Caesar() {

    }

    public String codeer(String text)
    {
        return algo(text, 13);
    }


    public String decodeer(String text)
    {
        return algo(text, 26-13);
    }


    private String algo (String text, int shift){

        text = text.toLowerCase();

        char[] chars = text.toCharArray();
        for (int i=0; i < text.length(); i++) {
            char c = chars[i];
            System.out.println("code: "+ c + "   " + (int)c);
            if (c <= 122 && c >= 97) {
                c -= 97;
                c += shift;
                c%=26;
                System.out.println((int)c);
                c+= 97;
                chars[i] = c;
            }
        }
        return new String(chars);



        /*char[] chars = text.toCharArray();
        for (int i=0; i < text.length(); i++)
        {
            char c = chars[i];
            if (c >= 32 && c <= 127)
            {
                // Change base to make life easier, and use an
                // int explicitly to avoid worrying... cast later
                int x = c - 32;
                x = (x + shift) % 96;
                if (x < 0)
                    x += 96; //java modulo can lead to negative values!
                chars[i] = (char) (x + 32);
            }
        }
        return new String(chars);*/
    }
}
