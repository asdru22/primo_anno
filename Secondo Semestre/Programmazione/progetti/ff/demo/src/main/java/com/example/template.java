package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class template extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        VBox root = new VBox();
        root.getChildren().add(new Text("dsa"));

        // Create a scene to hold the root pane
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene, and show the stage
        primaryStage.setTitle("Display Image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
