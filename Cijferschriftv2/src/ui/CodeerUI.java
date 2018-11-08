package ui;

import domain.*;

public class CodeerUI {
    public CodeerUI () {
        Cijfercontroller cc = new Cijfercontroller(new Spiegeling());
        System.out.println("spiegel azerty:");
        System.out.println(cc.codeer("azerty"));

        cc.setGeheimschrift(new Caesar());
    }
}
