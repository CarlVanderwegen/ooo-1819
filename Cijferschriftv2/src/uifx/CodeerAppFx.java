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
        CodeerUIFx ui = new CodeerUIFx(ps);

    }
}
