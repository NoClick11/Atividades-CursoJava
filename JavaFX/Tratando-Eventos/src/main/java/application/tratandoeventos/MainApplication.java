package application.tratandoeventos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            System.out.println(getClass().getResource("/gui/View.fxml"));
            Parent parent = FXMLLoader.load(getClass().getResource("/application/gui/View.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}