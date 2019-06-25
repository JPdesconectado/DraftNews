package exceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AdmException extends Exception{
	
	private Alert alert;
	private static final long serialVersionUID = 1L;

	public AdmException(){
		super("O Admin � inalter�vel.");
		
		alert = new Alert(AlertType.WARNING);
        alert.setTitle("AVISO");
        alert.setHeaderText("Tentativa Inv�lida.");
        alert.setContentText("O Admin n�o pode ser alterado.");
        alert.showAndWait();
	}

}
