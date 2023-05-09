import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;

public class Main extends Application {
public static void main(String[] args) {launch(args);}
	 public void start(Stage primaryStage) {
		 HBox root = new HBox();
		 StackPane sp = new StackPane();
		 Circle n = new Circle(5);
		 n.setStroke(Color.YELLOW);
		 Rectangle background = new Rectangle(60, 60);
		 background.setStroke(Color.RED);
		 background.setFill(Color.BLACK);
		 
		 Label l = new Label();
		 l.setFont(new Font("Verdana", 30));

		 sp.getChildren().addAll(background, l,n);
		 root.getChildren().add(sp);
		 
		 root.setAlignment(Pos.CENTER);
		 primaryStage.show();
	 }
	 }


	 
