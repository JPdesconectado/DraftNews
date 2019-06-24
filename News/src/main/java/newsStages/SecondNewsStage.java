package newsStages;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;
import stages.MainStage;
import util.Strings;

public class SecondNewsStage {
	private ImageView imagem;
	private ImageView imagemEscritor;
	
	public SecondNewsStage(Stage stage) {
		

		BorderPane borderpane = new BorderPane();
		ScrollPane scrollPane = new ScrollPane(borderpane);
		scrollPane.setFitToHeight(true);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		borderpane.setPrefSize(1280, 720);
	    imagem = new ImageView(new Image("img2.png"));
	    imagem.setFitHeight(428);
	    imagem.setFitWidth(720);
	    Strings.subtitleNot2.setFont(ITALIC_FONT);
	    Strings.subtitleNot2.setFill(Color.WHITE);    
	    Strings.titleNot2.setFont(new Font(40));
	    Strings.titleNot2.setFill(Color.WHITE);
	    Button btVoltar = new Button("Voltar");
	    Label title = new Label(null, new TextFlow(new Text("\n"), btVoltar, new Text("\n"), Strings.titleNot2, new Text(", \n"), Strings.subtitleNot2 ));
	    borderpane.setTop(title);
	    BorderPane.setAlignment(title, Pos.CENTER);
	    borderpane.setCenter(imagem);
	    BorderPane.setAlignment(imagem, Pos.CENTER);
	    Strings.not2.setFont(new Font(20));
	    Strings.not2.setFill(Color.WHITE);
	    Strings.autor1.setFont(new Font(18));
	    Strings.autor1.setFill(Color.WHITE);
	    Strings.tautor1.setFont(new Font(18));
	    Strings.tautor1.setFill(Color.AQUA);
	    imagemEscritor = new ImageView(new Image("https://secure.gravatar.com/avatar/5913b7c5ab46c40079149ea8daf0b3c9?s=128&d=mm&r=g"));
	    Label label = new Label(null, new TextFlow(new Text("\n"), Strings.not2, new Text(", \n"), new Text("\n\n\n\n"), imagemEscritor, Strings.autor1, Strings.tautor1));
	    borderpane.setBottom(label);
	    BorderPane.setAlignment(label, Pos.CENTER);
	    borderpane.setBackground(new Background(new BackgroundFill(Color.rgb(21, 21, 21), null, null)));
	    Scene scene = new Scene(scrollPane, 1280, 720);
	    new JMetro(JMetro.Style.LIGHT).applyTheme(scrollPane);
	    stage.setScene(scene);
	    
	    
	    btVoltar.setOnAction(e ->{
	    	new MainStage(new Stage());
	    	stage.close();
	    });
	    
	    stage.show();
	}
	
	public static final Font ITALIC_FONT =
            Font.font("Serif", FontPosture.ITALIC, 20);
}
