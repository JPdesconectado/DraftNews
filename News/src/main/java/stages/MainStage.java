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

import java.util.Optional;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import newsStages.EightNewsStage;
import newsStages.FirstNewsStage;
import newsStages.FiveNewsStage;
import newsStages.FourNewsStage;
import newsStages.NineNewsStage;
import newsStages.SecondNewsStage;
import newsStages.SevenNewsStage;
import newsStages.SixNewsStage;
import newsStages.ThirdNewsStage;
import util.Strings;

public class MainStage {
	
	private ImageView imagem1, imagem2, imagem3, imagem4, imagem5, imagem6, imagem7, imagem8, imagem9, bar1, c1, icon1;
	
	public MainStage(Stage stage) {

	AnchorPane pane = new AnchorPane();
	pane.setPrefSize(1280, 720);
	stage.getIcons().add(new Image("icon2.png"));
	stage.setTitle(Strings.title);
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	BackgroundImage back = new BackgroundImage(new Image("bg1.jpg"),  BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
	pane.setBackground(new Background(back));
	c1 = new ImageView(new Image("c1.jpg"));
	pane.getChildren().add(c1);
	c1.setFitHeight(720);
	c1.setFitWidth(1180);
	c1.setX(50);

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
	
	Button btVoltar = new Button("Sair");
	btVoltar.setLayoutX(1190);
	btVoltar.setLayoutY(7);
	btVoltar.setOnAction(e -> {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Saindo");
		alert.setHeaderText("O sistema será encerrado.");
		alert.setContentText("Deseja sair?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
		stage.close();
		}
	});
	
	pane.getChildren().add(btVoltar);
	
	imagem1 = new ImageView(new Image("img1.png"));
	imagem1.setFitHeight(177);
	imagem1.setFitWidth(328);
	imagem1.setX(130);
	imagem1.setY(60);
	
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
	
	
	
	imagem2 = new ImageView(new Image("img2.png"));
	imagem2.setFitHeight(177);
	imagem2.setFitWidth(328);
	imagem2.setX(130);
	imagem2.setY(260);	
	
	imagem2.setOnMouseEntered(e -> {
		imagem2.setScaleY(1.05);
	});
	
	imagem2.setOnMouseExited(e -> {
		imagem2.setScaleY(1);
	});
	imagem2.setOnMouseClicked(e  -> {
		try {
		new SecondNewsStage(new Stage());
		stage.close();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	});
	
	
	pane.getChildren().add(imagem2);
	
	
	imagem3 = new ImageView(new Image("img3.jpg"));
	imagem3.setFitHeight(177);
	imagem3.setFitWidth(328);
	imagem3.setX(130);
	imagem3.setY(460);
	
	imagem3.setOnMouseEntered(e -> {
		imagem3.setScaleY(1.05);
	});
	
	imagem3.setOnMouseExited(e -> {
		imagem3.setScaleY(1);
	});
	imagem3.setOnMouseClicked(e  -> {
		new ThirdNewsStage(new Stage());
		stage.close();
	});
	
	pane.getChildren().add(imagem3);
	
	
	imagem4 = new ImageView(new Image("img4.jpg"));
	imagem4.setFitHeight(177);
	imagem4.setFitWidth(328);
	imagem4.setX(480);
	imagem4.setY(60);
	
	imagem4.setOnMouseEntered(e -> {
		imagem4.setScaleY(1.05);
	});
	
	imagem4.setOnMouseExited(e -> {
		imagem4.setScaleY(1);
	});
	imagem4.setOnMouseClicked(e  -> {
		new FourNewsStage(new Stage());
		stage.close();
	});
	
	
	pane.getChildren().add(imagem4);
	
	imagem5 = new ImageView(new Image("imgCapa5.jpeg"));
	imagem5.setFitHeight(177);
	imagem5.setFitWidth(328);
	imagem5.setX(480);
	imagem5.setY(260);
	
	imagem5.setOnMouseEntered(e -> {
		imagem5.setScaleY(1.05);
	});
	
	imagem5.setOnMouseExited(e -> {
		imagem5.setScaleY(1);
	});
	imagem5.setOnMouseClicked(e  -> {
		new FiveNewsStage(new Stage());
		stage.close();
	});
	
	
	pane.getChildren().add(imagem5);
	
	imagem6 = new ImageView(new Image("img6.jpg"));
	imagem6.setFitHeight(177);
	imagem6.setFitWidth(328);
	imagem6.setX(480);
	imagem6.setY(460);
	
	imagem6.setOnMouseEntered(e -> {
		imagem6.setScaleY(1.05);
	});
	
	imagem6.setOnMouseExited(e -> {
		imagem6.setScaleY(1);
	});
	imagem6.setOnMouseClicked(e  -> {
		new SixNewsStage(new Stage());
		stage.close();
	});
	
	
	pane.getChildren().add(imagem6);
	
	imagem7 = new ImageView(new Image("img7.jpg"));
	imagem7.setFitHeight(177);
	imagem7.setFitWidth(328);
	imagem7.setX(830);
	imagem7.setY(60);
	
	imagem7.setOnMouseEntered(e -> {
		imagem7.setScaleY(1.05);
	});
	
	imagem7.setOnMouseExited(e -> {
		imagem7.setScaleY(1);
	});
	imagem7.setOnMouseClicked(e  -> {
		
		new SevenNewsStage(new Stage());
		stage.close();
	});
	
	
	pane.getChildren().add(imagem7);
	
	
	imagem8 = new ImageView(new Image("img8.jpg"));
	imagem8.setFitHeight(177);
	imagem8.setFitWidth(328);
	imagem8.setX(830);
	imagem8.setY(260);
	
	imagem8.setOnMouseEntered(e -> {
		imagem8.setScaleY(1.05);
	});
	
	imagem8.setOnMouseExited(e -> {
		imagem8.setScaleY(1);
	});
	imagem8.setOnMouseClicked(e  -> {
		
		new EightNewsStage(new Stage());
		stage.close();
	});
	
	pane.getChildren().add(imagem8);
	
	imagem9 = new ImageView(new Image("img9.jpg"));
	imagem9.setFitHeight(177);
	imagem9.setFitWidth(328);
	imagem9.setX(830);
	imagem9.setY(460);
	
	imagem9.setOnMouseEntered(e -> {
		imagem9.setScaleY(1.05);
	});
	
	imagem9.setOnMouseExited(e -> {
		imagem9.setScaleY(1);
	});
	imagem9.setOnMouseClicked(e  -> {
		
		new NineNewsStage(new Stage());
		stage.close();
	});
	
	pane.getChildren().add(imagem9);
	
	Text label = Strings.titleNot1;
	label.setFill(Color.WHITE);
	label.setLayoutX(135);
	label.setLayoutY(210);
	label.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label);
	
	Text label1 = new Text("Cinema");
	label1.setFill(Color.DARKRED);
	label1.setLayoutX(135);
	label1.setLayoutY(190);
	label1.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label1);
	
	Text label2N = Strings.titleNot2;
	label2N.setFill(Color.WHITE);
	label2N.setLayoutX(135);
	label2N.setLayoutY(410);
	label2N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label2N);
	
	Text label2 = new Text("Cinema");
	label2.setFill(Color.DARKRED);
	label2.setLayoutX(135);
	label2.setLayoutY(390);
	label2.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label2);
	
	Text label3N = Strings.titleNot3;
	label3N.setFill(Color.WHITE);
	label3N.setLayoutX(135);
	label3N.setLayoutY(610);
	label3N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label3N);
	
	Text label3 = new Text("Games");
	label3.setFill(Color.DARKRED);
	label3.setLayoutX(135);
	label3.setLayoutY(590);
	label3.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label3);
	
	Text label4N = Strings.titleNot4;
	label4N.setFill(Color.WHITE);
	label4N.setLayoutX(485);
	label4N.setLayoutY(210);
	label4N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label4N);
	
	Text label4 = new Text("Cinema");
	label4.setFill(Color.DARKRED);
	label4.setLayoutX(485);
	label4.setLayoutY(190);
	label4.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label4);
	
	Text label5N = Strings.titleNot5;
	label5N.setFill(Color.WHITE);
	label5N.setLayoutX(485);
	label5N.setLayoutY(410);
	label5N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label5N);
	
	Text label5 = new Text("Cinema");
	label5.setFill(Color.DARKRED);
	label5.setLayoutX(485);
	label5.setLayoutY(390);
	label5.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label5);
	
	Text label6N = Strings.titleNot6;
	label6N.setFill(Color.WHITE);
	label6N.setLayoutX(485);
	label6N.setLayoutY(610);
	label6N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label6N);
	
	Text label6 = new Text("Cinema");
	label6.setFill(Color.DARKRED);
	label6.setLayoutX(485);
	label6.setLayoutY(590);
	label6.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label6);
	
	Text label7N = Strings.titleNot7;
	label7N.setFill(Color.WHITE);
	label7N.setLayoutX(835);
	label7N.setLayoutY(210);
	label7N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label7N);
	
	Text label7 = new Text("Séries");
	label7.setFill(Color.DARKRED);
	label7.setLayoutX(835);
	label7.setLayoutY(190);
	label7.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label7);
	
	Text label8N = Strings.titleNot8;
	label8N.setFill(Color.WHITE);
	label8N.setLayoutX(835);
	label8N.setLayoutY(410);
	label8N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label8N);
	
	Text label8 = new Text("Séries");
	label8.setFill(Color.DARKRED);
	label8.setLayoutX(835);
	label8.setLayoutY(390);
	label8.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label8);
	
	Text label9N = Strings.titleNot9;
	label9N.setFill(Color.WHITE);
	label9N.setLayoutX(835);
	label9N.setLayoutY(610);
	label9N.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 16));
	pane.getChildren().add(label9N);
	
	Text label9 = new Text("Cinema");
	label9.setFill(Color.DARKRED);
	label9.setLayoutX(835);
	label9.setLayoutY(590);
	label9.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 14));
	pane.getChildren().add(label9);
	
	new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
	stage.show();
	
}
	
}
