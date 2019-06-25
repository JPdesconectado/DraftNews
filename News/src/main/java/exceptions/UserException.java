package exceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class UserException extends Exception{

	private static final long serialVersionUID = 1L;
	private Alert alert;
	public UserException(int i){
		super("Problema no User, contate o admin");
		
		switch(i) {
		
		case 1:
		alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText("A senha não pode estar em branco.");
        alert.setContentText("Por favor, insira algo.");
        alert.showAndWait();
        break;
		
		case 2:
		alert = new Alert(AlertType.ERROR);
	    alert.setTitle("Erro 2");
	    alert.setHeaderText("O usuário não pode estar em branco.");
	    alert.setContentText("Por favor, insira algo.");
	    alert.showAndWait();
	    break;
		}
		
	}
}