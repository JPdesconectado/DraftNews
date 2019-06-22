import javafx.application.Application;
import javafx.stage.Stage;
import stages.MainStage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		new MainStage(new Stage());
	}
}
