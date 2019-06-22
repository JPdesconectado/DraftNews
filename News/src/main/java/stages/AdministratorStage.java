package stages;

import entities.User;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
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

		colPass.setCellValueFactory(new PropertyValueFactory<User, String>("pass"));
		colPass.setCellFactory(TextFieldTableCell.forTableColumn());
		colPass.setMinWidth(200);
		colPass.setOnEditCommit(e -> {
			DB.users.changePass(e.getRowValue().getName(), e.getNewValue());
		});

		usersTable.getColumns().add(colName);
		usersTable.getColumns().add(colPass);
		usersTable.setItems(DB.users.getUsers());
		pane.getChildren().add(usersTable);

		
		new JMetro(JMetro.Style.LIGHT).applyTheme(pane);
		stage.show();
	}

}
