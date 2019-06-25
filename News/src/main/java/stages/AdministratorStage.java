package stages;

import entities.User;
import exceptions.AdmException;
import exceptions.UserException;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import util.DB;
import util.Strings;

public class AdministratorStage {
	
	public AdministratorStage(Stage stage) {
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		Label lbAdmin = new Label("Bem vindo Administrador.");
		lbAdmin.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 30));
		lbAdmin.setLayoutX(10);
		lbAdmin.setLayoutY(10);
		pane.getChildren().add(lbAdmin);
		TableView<User> usersTable = new TableView<User>();
		usersTable.setLayoutX(10);
		usersTable.setLayoutY(50);
		usersTable.setPrefSize(620, 420);
		usersTable.setEditable(true);
		
		TableColumn<User, String> colName = new TableColumn<>(Strings.username);
		TableColumn<User, String> colPass = new TableColumn<>(Strings.password);

		colName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
		colName.setCellFactory(TextFieldTableCell.forTableColumn());
		colName.setMinWidth(200);
		colName.setOnEditCommit(e -> {
			try {
				DB.users.changeUser(e.getRowValue().getName(), e.getNewValue());
			} catch (UserException ex) {
				System.out.println(ex.getMessage());
			} catch (AdmException ex2) {
			System.out.println(ex2.getMessage());
			}
		});
		
		colPass.setCellValueFactory(new PropertyValueFactory<User, String>("pass"));
		colPass.setCellFactory(TextFieldTableCell.forTableColumn());
		colPass.setMinWidth(200);
		colPass.setOnEditCommit(e -> {
			try {
				DB.users.changePass(e.getRowValue().getName(), e.getNewValue());
			} catch (UserException ex) {
				System.out.println(ex.getMessage());
				
			} catch (AdmException ex2) {
				System.out.println(ex2.getMessage());
			}
		});

		usersTable.getColumns().add(colName);
		usersTable.getColumns().add(colPass);
		usersTable.setItems(DB.users.getUsers());
		pane.getChildren().add(usersTable);

		
		new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
		stage.show();
	}

}
