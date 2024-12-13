package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Charge le fichier FXML
            Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
            
            // Définit la scène
            Scene scene = new Scene(root);
            
            // Configure la fenêtre principale
            primaryStage.setTitle("Application Principale");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
