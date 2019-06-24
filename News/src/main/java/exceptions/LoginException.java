package exceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private Alert alert;
	public LoginException(int i) {
		super("Problema no Login, contate o admin");
		
		switch(i) {
		
		case 1:
		alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText("Login e/ou senha inválidos");
        alert.setContentText("Tente novamente.");
        alert.showAndWait();
        break;
		
		case 2:
		alert = new Alert(AlertType.ERROR);
	    alert.setTitle("Erro 2");
	    alert.setHeaderText("Login e/ou senha não foi inserido");
	    alert.setContentText("Tente novamente.");
	    alert.showAndWait();
	    break;
		}
	}

}
