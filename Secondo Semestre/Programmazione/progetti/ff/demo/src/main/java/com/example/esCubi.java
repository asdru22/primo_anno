package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class esCubi extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text t = new Text();
        TextField tf = new TextField("insert");

        EventHandler < ActionEvent > sq = new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent event) {
                double inp = Double.parseDouble(tf.getText()); 
                t.setText(Math.pow(inp,2.0)+"");
            }
        };
        EventHandler < ActionEvent > cu = new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent event) {
                double inp = Double.parseDouble(tf.getText());
                if(inp==69.0) t.setText("ammazzati coglione");
                else t.setText(Math.pow(inp,3.0)+"");
            }
        };
        
        ToggleButton tb1 = new ToggleButton("quadrato");
        ToggleButton tb2 = new ToggleButton("cubo");
        ToggleGroup group = new ToggleGroup();
        tb1.setToggleGroup(group); 
        tb1.setOnAction(sq);
        tb2.setToggleGroup(group);
        tb2.setOnAction(cu);


        VBox root = new VBox();
        root.getChildren().addAll(new Text("text"),tf,tb1,tb2,t);

        // Create a scene to hold the root pane
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene, and show the stage
        primaryStage.setTitle("Meth");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
