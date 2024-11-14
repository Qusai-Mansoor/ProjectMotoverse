package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label with text
        Label label = new Label("Hello, JavaFX!");

        // Set up the root layout
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene with specified width and height
        Scene scene = new Scene(root, 300, 200);

        // Set up the Stage (window)
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //qusai ne change kar diya
    //Qusai nay second change kiya hai 

    public static void main(String[] args) {
        launch(args);
    }
}
