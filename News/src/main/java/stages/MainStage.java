package stages;

import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;	
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import util.Strings;

public class MainStage {
	
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
	
	new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
	stage.show();
	
}
}
