package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("eerste");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
<<<<<<< HEAD
<<<<<<< HEAD
        //Controller controller = new Controller();

=======
>>>>>>> parent of 84a305d... einde les
=======
>>>>>>> parent of 84a305d... einde les
    }


    public static void main(String[] args) {
        launch(args);
    }
}
