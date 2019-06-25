package stages;

import entities.User;
import exceptions.LoginException;
import exceptions.StageException;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.DB;
import util.Strings;

public class LoginStage {
	private Button btAdd;
	private TextField txtUser;
	private PasswordField txtPass;
	
	public LoginStage(Stage stage) {
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(160, 200);
		Scene scene = new Scene(pane);
		stage.getIcons().add(new Image("icon2.png"));
		stage.setScene(scene);
		
		txtUser = new TextField();
		txtUser.setLayoutX(10);
		txtUser.setLayoutY(10);
		txtUser.setMaxWidth(150);
		txtUser.setMinWidth(150);
		txtUser.setPrefWidth(150);
		txtUser.setPromptText(Strings.username);
		
		txtPass = new PasswordField();
		txtPass.setLayoutX(10);
		txtPass.setLayoutY(50);
		txtPass.setMaxWidth(150);
		txtPass.setMinWidth(150);
		txtPass.setPrefWidth(150);
		txtPass.setPromptText(Strings.password);
		
		btAdd = new Button(Strings.btLogin);
		btAdd.setLayoutX(10);
		btAdd.setLayoutY(90);
		btAdd.setMaxWidth(150);
		btAdd.setMinWidth(150);
		btAdd.setPrefWidth(150);
		
		
		btAdd.setOnMouseClicked(e -> {
			
			try {
				login(txtUser.getText(), txtPass.getText(), stage);
				stage(stage);
			} catch (LoginException ex) {
				System.out.println(ex.getMessage());
			} catch (StageException ex2) {
				System.out.println(ex2.getMessage());
			}
					
		});

		pane.getChildren().add(btAdd);
		pane.getChildren().add(txtUser);
		pane.getChildren().add(txtPass);
		
		stage.setResizable(false);
		stage.show();
	}
	
	private void login(String username, String password, Stage stage) throws LoginException{
		User user = DB.users.getUser(txtUser.getText());
		
		try {
				if (!user.getPass().equals(txtPass.getText())) {
					throw new LoginException(1);
					
				}
					
				
			} catch (NullPointerException ex) {
				
				if (txtUser.getText().equals("") || (txtPass.getText().equals(""))) {
					throw new LoginException(2);
					
				}
				
				throw new LoginException(1);
			}
					
	}
	
	private void stage(Stage stage) throws StageException{
		
		try {
			
			if (stage == null) {
				throw new StageException();
			
				
			}
			
		} catch (NullPointerException ex) {
			throw new StageException();
		}
		
		new AdministratorStage(new Stage());
		stage.close();
	}
	
}
