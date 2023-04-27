package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginDemoExternalManager extends Application {
	
	private static Integer trials = 0;
	
    public static void main(String[] args) {
		launch(args);
	}
    
    @Override
    public void start(Stage stage) throws Exception {

    		VBox root = new VBox();
    		
    		Scene s1 = new Scene(root, 400, 300);
    		
    		Text t = new Text("Please type your password:");
    		
    		final PasswordField pf = new PasswordField();
    		final Button b = new Button("Login");
    		final Text loginMsg = new Text();
    		
    		final PasswordManager pwdManager = new PasswordManager();
    		
    		EventHandler<ActionEvent> bh = new EventHandler<ActionEvent>() {
    				@Override
	            public void handle(ActionEvent event) {
	           
    				trials++;
    					
    				if (pwdManager.checkPassword(pf.getText())) {
    		    			loginMsg.setText("Sono nei tuoi muri sono nei tuoi muri");
    		    			loginMsg.setFill(Color.BLACK);
    		    		}
    		    		else {
    		    			loginMsg.setText("Forgot your password? You tried "  + trials + " times...");
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
