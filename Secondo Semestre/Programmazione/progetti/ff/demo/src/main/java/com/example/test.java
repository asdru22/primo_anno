package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.File;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a file object to represent the image file
        File imageFile = new File("C:/Users/Ale/Pictures/Saved Pictures/s.jpg");

        // Create an image object from the file
        Image image = new Image(imageFile.toURI().toString());

        // Create an image view object to display the image
        ImageView imageView = new ImageView(image);

        // Create a stack pane to hold the image view
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

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
