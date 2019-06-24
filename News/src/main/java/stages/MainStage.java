package stages;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import newsStages.FirstNewsStage;
import util.Strings;

public class MainStage {
	
	private ImageView imagem1, bar1, c1, icon1;
	
	public MainStage(Stage stage) {

	AnchorPane pane = new AnchorPane();
	pane.setPrefSize(1280, 720);
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	BackgroundImage back = new BackgroundImage(new Image("bg1.jpg"),  BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
	pane.setBackground(new Background(back));
	c1 = new ImageView(new Image("c1.jpg"));
	pane.getChildren().add(c1);
	c1.setFitHeight(720);
	c1.setFitWidth(1000);
	c1.setX(130);

	bar1 = new ImageView(new Image("bar1.png"));
	pane.getChildren().add(bar1);
	
	Text logo = new Text("Forecast Dog");
	logo.setFill(Color.DARKGREY);
	logo.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 40));
	logo.setY(40);
	logo.setX(200);
	pane.getChildren().add(logo);
	Text logo2 = new Text("Forecast Dog");
	logo2.setFill(Color.DARKRED);
	logo2.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 40));
	logo2.setY(40);
	logo2.setX(202);
	pane.getChildren().add(logo2);
	icon1 = new ImageView(new Image("icon1.png"));
	icon1.setY(3);
	icon1.setX(130);
	icon1.setFitHeight(45);
	icon1.setFitWidth(70);
	pane.getChildren().add(icon1);
	Button btLogin = new Button(Strings.btLogin);
	btLogin.setLayoutX(1000);
	btLogin.setLayoutY(7);
	btLogin.setOnAction(e ->{
		new CadastroUserStage(new Stage());
	});
	
	pane.getChildren().add(btLogin);
	
	Button btAdmin = new Button(Strings.btAdmin);
	btAdmin.setLayoutX(1100);
	btAdmin.setLayoutY(7);
	btAdmin.setOnAction(e ->{
		new LoginStage(new Stage());
	});
	
	pane.getChildren().add(btAdmin);
	
	
	imagem1 = new ImageView(new Image("img1.png"));
	imagem1.setFitHeight(177);
	imagem1.setFitWidth(328);
	imagem1.setX(150);
	imagem1.setY(80);
	
	imagem1.setOnMouseEntered(e -> {
		imagem1.setScaleY(1.05);
	});
	
	imagem1.setOnMouseExited(e -> {
		imagem1.setScaleY(1);
	});
	imagem1.setOnMouseClicked(e  -> {
		new FirstNewsStage(new Stage());
		stage.close();
	});
	
	pane.getChildren().add(imagem1);
	
	Text label = Strings.titleNot1;
	label.setFill(Color.WHITE);
	label.setLayoutX(155);
	label.setLayoutY(230);
	label.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label);
	
	Text label1 = new Text("Cinema");
	label1.setFill(Color.DARKRED);
	label1.setLayoutX(155);
	label1.setLayoutY(210);
	label1.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label1);
	new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
	stage.show();
	
}
	
}
