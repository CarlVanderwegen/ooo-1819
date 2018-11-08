package domain;

public class GeheimschriftFactory {

    public Geheimschrift createGeheimschrift(Scripts s){
        Geheimschrift schrift = null;
        /*if (s == Scripts.CAESAR) {
            return new Caesar();
        } else if (s == Scripts.ADDING) {
            return new Adding();
        }*/

        for (Scripts sc: Scripts.values()) {
            if (s == sc) {
                try{
                    String fullname = "domain." + s.toString().toUpperCase().substring(0,1) + s.toString().toLowerCase().substring(1);
                    Class klasse = Class.forName(fullname);
                    Object object = klasse.newInstance();

                    Geheimschrift geheimschrift = (Geheimschrift) object;
                    return geheimschrift;

                } catch(Exception ex) {}

            }
        }


        throw new IllegalArgumentException("Illegal scripts");

    }
}
