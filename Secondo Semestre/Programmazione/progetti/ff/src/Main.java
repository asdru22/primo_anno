import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;

public class Main extends Application {
public static void main(String[] args) {launch(args);}
	 public void start(Stage primaryStage) {
		 HBox root = new HBox();

		 Integer[] integers = {1, 7, 18, 19, 34, 2, 9};

		 for (int i = 0; i < integers.length; i++) {
		  StackPane sp = new StackPane();

		  Rectangle background = new Rectangle(60, 60);
		 background.setStroke(Color.RED);
		 background.setFill(Color.BLACK);
		 
		 Label l = new Label();
		 l.setText(integers[i].toString());
		 l.setFont(new Font("Verdana", 30));

		 sp.getChildren().addAll(background, l);
		 root.getChildren().add(sp);
		 }
		 root.setAlignment(Pos.CENTER);
		 primaryStage.show();
	 }	 }
