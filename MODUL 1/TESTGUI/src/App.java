import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setTitle("Ini Coba GUI");
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}