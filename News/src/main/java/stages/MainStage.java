package stages;

import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import newsStages.FirstNewsStage;
import util.Strings;

public class MainStage {
	
	private ImageView imagem1;
	
	public MainStage(Stage stage) {

	AnchorPane pane = new AnchorPane();
	pane.setPrefSize(1280, 720);
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	
	Button btLogin = new Button(Strings.btLogin);
	btLogin.setLayoutX(1000);
	btLogin.setLayoutY(10);
	btLogin.setOnAction(e ->{
		new CadastroUserStage(new Stage());
	});
	
	pane.getChildren().add(btLogin);
	
	Button btAdmin = new Button(Strings.btAdmin);
	btAdmin.setLayoutX(1100);
	btAdmin.setLayoutY(10);
	btAdmin.setOnAction(e ->{
		new LoginStage(new Stage());
	});
	
	pane.getChildren().add(btAdmin);
	
	imagem1 = new ImageView(new Image("http://i.imgur.com/enOkJbE.png"));
	
	imagem1.setOnMouseClicked(e  -> {
		new FirstNewsStage(new Stage());
	});
	
	pane.getChildren().add(imagem1);
	new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
	stage.show();
	
}
}
