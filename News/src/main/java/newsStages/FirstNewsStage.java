package newsStages;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FirstNewsStage {
	private ImageView imagem, logo, imagem2;
	public FirstNewsStage(Stage stage) {
		

		BorderPane borderpane = new BorderPane();
		ScrollPane scrollPane = new ScrollPane(borderpane);
		scrollPane.setFitToHeight(true);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
	    imagem = new ImageView(new Image("https://cdn140.picsart.com/290100131068211.png?r1024x1024"));
	    imagem.setX(100);
	    imagem.setY(800);
	    logo = new ImageView(new Image("http://www.sclance.com/pngs/open-book-png-icon/open_book_png_icon_959216.png"));
	    logo.setFitWidth(100);
		logo.setFitHeight(100);
	    imagem2 = new ImageView(new Image("https://images.unsplash.com/photo-1460602594182-8568137446ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80"));
	    borderpane.setCenter(imagem2);
	    BorderPane.setAlignment(logo, Pos.CENTER);
	    borderpane.setBottom(imagem);
	    borderpane.setTop(logo);
	    Scene scene = new Scene(scrollPane);
	    stage.setScene(scene);
	    stage.show();
	}
}
