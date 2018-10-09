package uifx;

import domain.Caesar;
import domain.Cijfercontroller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import uifx.CodeerUIFx;

import java.awt.*;

public class CodeerAppFx extends Application {
    private Cijfercontroller cc;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ps) {
        cc = new Cijfercontroller(new Caesar());

        ps.setTitle("Geheimschrift App");

        VBox root = new VBox();
        TextField inputField = new TextField();
        TextField outfield = new TextField();



        Scene mainScene = new Scene(root, 550, 400);
        ps.setScene(mainScene);

        ps.show();
    }
}
