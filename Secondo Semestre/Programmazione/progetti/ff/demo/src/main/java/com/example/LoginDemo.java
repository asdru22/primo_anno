package com.example;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginDemo extends Application {

    private static String password = "admin19"; // hard-coded (and too simple) password...
    private static Integer trials = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();

        Scene s1 = new Scene(root, 400, 300);

        File css = new File("src/gui/jfx/login/Login.css");
        s1.getStylesheets().add("file://" + css.getAbsolutePath());

        Text t = new Text("Please type your password:");

        final PasswordField pf = new PasswordField();
        final Button b = new Button("Login");
        final Text loginMsg = new Text();

        EventHandler < ActionEvent > bh = new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent event) {
                trials++;
                if (pf.getText().equals(password)) {
                    loginMsg.setText("Login successfull!");
                    loginMsg.setFill(Color.GREEN);
                } else {
                    loginMsg.setText("Forgot your password? You tried " + trials + " times...");
                    loginMsg.setFill(Color.RED);
                }
            }
        };
		
        b.setOnAction(bh);
        root.getChildren().addAll(t, pf, b, loginMsg);
        stage.setTitle("Admin panel");
        stage.setScene(s1);
        stage.show();
    }
}