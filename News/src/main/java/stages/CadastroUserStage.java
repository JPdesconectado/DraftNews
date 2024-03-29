package stages;

import entities.User;
import exceptions.LoginException;
import exceptions.RegisterException;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.DB;
import util.Strings;

public class CadastroUserStage {
	private Button btAdd, btLogin;
	private TextField txtUser;
	private PasswordField txtPass;
	public CadastroUserStage(Stage stage) {
		
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
		
		btAdd = new Button(Strings.btCadastro);
		btAdd.setLayoutX(10);
		btAdd.setLayoutY(130);
		btAdd.setMaxWidth(150);
		btAdd.setMinWidth(150);
		btAdd.setPrefWidth(150);
		
		btLogin = new Button(Strings.btLogin);
		btLogin.setLayoutX(10);
		btLogin.setLayoutY(90);
		btLogin.setMaxWidth(150);
		btLogin.setMinWidth(150);
		btLogin.setPrefWidth(150);
		
		btLogin.setOnMouseClicked(e -> {
			
			try {
				
				login(txtUser.getText(), txtPass.getText(), stage);
				stage.close();
				
			} catch (LoginException ex) {
				System.out.println(ex.getMessage());
			}
					
		});

		btAdd.setOnMouseClicked(e -> {
			
			try {
				
				cadastrar(txtUser.getText(), txtPass.getText(), stage);
				
			} catch (RegisterException ex) {
				System.out.println(ex.getMessage());
			}
			
		});
		
		pane.getChildren().add(btLogin);
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
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Confirma��o");
					alert.setHeaderText("Usu�rio Logado!");
					alert.setContentText("Bem-vindo ao sistema.");
					alert.showAndWait();
	}
	
	private void cadastrar(String username, String password, Stage stage) throws RegisterException{
		
		User user = DB.users.getUser(txtUser.getText());
		
		try {
			if(!user.getPass().equals(txtPass.getText()) || user.getName().equals(txtUser.getText())){
				throw new RegisterException();
			}
			
		} catch (NullPointerException ex) {
			DB.users.addUser(txtUser.getText(), txtPass.getText());
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Confirma��o");
			alert.setHeaderText("Usu�rio Cadastrado!");
			alert.setContentText("Bem-vindo ao sistema.");
			alert.showAndWait();
			
			
		}
		
		
	}
}
