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

public class SevenNewsStage {
	private ImageView imagem;
	private ImageView imagemEscritor;
	
	public SevenNewsStage(Stage stage) {
		BorderPane borderpane = new BorderPane();
		ScrollPane scrollPane = new ScrollPane(borderpane);
		scrollPane.setFitToHeight(true);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		borderpane.setPrefSize(1280, 720);
	    imagem = new ImageView(new Image("img7.jpg"));
	    imagem.setFitHeight(428);
	    imagem.setFitWidth(720);
	    Strings.subtitleNot7.setFont(ITALIC_FONT);
	    Strings.subtitleNot7.setFill(Color.WHITE);    
	    Strings.titleNot7.setFont(new Font(40));
	    Strings.titleNot7.setFill(Color.WHITE);
	    Button btVoltar = new Button("Voltar");
	    Label title = new Label(null, new TextFlow(new Text("\n"), btVoltar, new Text("\n"), Strings.titleNot7, new Text(", \n"), Strings.subtitleNot7));
	    borderpane.setTop(title);
	    BorderPane.setAlignment(title, Pos.CENTER);
	    borderpane.setCenter(imagem);
	    BorderPane.setAlignment(imagem, Pos.CENTER);
	    Strings.not7.setFont(new Font(20));
	    Strings.not7.setFill(Color.WHITE);
	    Strings.autor3.setFont(new Font(18));
	    Strings.autor3.setFill(Color.WHITE);
	    Strings.tautor3.setFont(new Font(18));
	    Strings.tautor3.setFill(Color.AQUA);
	    imagemEscritor = new ImageView(new Image("https://secure.gravatar.com/avatar/3ad10ead59f16a09138d994ee316c7e7?s=128&d=mm&r=g"));
	    Label label = new Label(null, new TextFlow(new Text("\n"), Strings.not7, new Text("\n\n\n\n"), imagemEscritor, 
	    		Strings.autor3, Strings.tautor3));
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
	    
	    stage.getIcons().add(new Image("icon2.png"));
	    stage.show();
	}
	
	public static final Font ITALIC_FONT =
            Font.font("Serif", FontPosture.ITALIC, 20);

	
}