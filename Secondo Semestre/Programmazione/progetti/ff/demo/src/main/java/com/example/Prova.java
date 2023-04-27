package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prova extends Application {

    private static Integer trials = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        Scene s1 = new Scene(root, 400, 300);

        final Button b = new Button("Odio");
        final Button d = new Button("Rewst");

        final Text loginMsg = new Text();

        EventHandler < ActionEvent > bh = new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent event) {
                trials++;
                loginMsg.setText(odio(trials));
            }
        };
        EventHandler < ActionEvent > dh = new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent event) {
                loginMsg.setText("CIAO");
                trials = 0;
            }
        };

        b.setOnAction(bh);
        d.setOnAction(dh);

        root.getChildren().addAll(b,d, loginMsg);
        stage.setScene(s1);
        stage.show();
    }
    public static String odio(int trials){
        if(trials==1) return "Modena";
        else if(trials==2) return "Catanzaro";
        else if(trials==3) return "Empoli";
        else if(trials==4) return "Calabria";
        else if(trials==5) return "Frosinone";
        else if (trials==6) return "Bergamo";
        else return "Napoli";
        
    }
}