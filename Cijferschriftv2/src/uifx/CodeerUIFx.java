package uifx;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import domain.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ui.CodeerUI;


public class CodeerUIFx {

    private Cijfercontroller cc;
    private Stage primaryStage;
    //private final String CEASAR = "Caesar";
    //private final String MIRROR = "Mirror";

    //private Geheimschrift caesarScript = new Caesar();
    //private Geheimschrift mirrorScript = new Spiegeling();

    //enum mogelijkeScripts {CEASAR, MIRROR}

    private GeheimschriftFactory factory;

    private TextField inputField;
    private TextField outputfield;
    private Label inputlabel;
    private Label outputlabel;

    public CodeerUIFx(Stage ps) {
        primaryStage = ps;
        cc = new Cijfercontroller(new Caesar());

        ps.setTitle("Geheimschrift App");

        VBox root = new VBox();

        Scene mainScene = new Scene(root, 550, 400);
        ps.setScene(mainScene);

        factory = new GeheimschriftFactory();



        ObservableList<Scripts> scripts = FXCollections.observableArrayList();
        scripts.addAll(Scripts.values());
        ComboBox scriptsbox = new ComboBox(scripts);
        scriptsbox.setValue(Scripts.CAESAR);
        root.getChildren().add(scriptsbox);

        inputField = new TextField();
        outputfield = new TextField();
        inputlabel = new Label("input:");
        outputlabel = new Label("output:");

        root.getChildren().add(inputlabel);
        root.getChildren().add(inputField);
        root.getChildren().add(outputlabel);
        root.getChildren().add(outputfield);

        ButtonBar bb = new ButtonBar();
        Button encodeButton = new Button("encode");
        Button decodeButton = new Button("decode");

        bb.setButtonData(encodeButton, ButtonBar.ButtonData.YES);
        bb.setButtonData(decodeButton, ButtonBar.ButtonData.NO);
        bb.getButtons().addAll(encodeButton, decodeButton);
        root.getChildren().add(bb);

        encodeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputtext = inputField.getText();
                outputfield.setText(cc.codeer(inputtext));
            }
        });

        decodeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputtext = inputField.getText();
                outputfield.setText(cc.decodeer(inputtext));
            }
        });

        scriptsbox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cc.setGeheimschrift(factory.createGeheimschrift(Scripts.valueOf(scriptsbox.getValue().toString())));
                /*if (scriptsbox.getValue().equals(CEASAR)) {
                    cc.setGeheimschrift(caesarScript);
                } else if (scriptsbox.getValue().equals(MIRROR)) {
                    cc.setGeheimschrift(mirrorScript);
                }
                switch(scriptsbox.getValue().toString()) {
                    case "Caesar":
                        System.out.println("caesar");
                        break;

                    case "Mirror":
                        System.out.println("mirror");
                        break;
                }*/
            }
        });
        ps.show();
    }


}
