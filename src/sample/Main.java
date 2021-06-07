package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
        stage.setTitle("Optimized Med");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}