package exceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AdmException extends Exception{
	
	private Alert alert;
	private static final long serialVersionUID = 1L;

	public AdmException(){
		super("O Admin é inalterável.");
		
		alert = new Alert(AlertType.WARNING);
        alert.setTitle("AVISO");
        alert.setHeaderText("Tentativa Inválida.");
        alert.setContentText("O Admin não pode ser alterado.");
        alert.showAndWait();
	}

}
