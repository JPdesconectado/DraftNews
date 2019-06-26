package newsStages;

import java.awt.Desktop;
import java.io.File;
import java.util.Optional;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
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

public class FiveNewsStage {
	private ImageView imagem;
	private ImageView imagemEscritor;
	
	public FiveNewsStage(Stage stage) {
		
		Strings.hyp.setText("Uma pesquisa");
		
		Strings.hyp.setOnAction(e ->{
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Redirecionamento");
			alert.setHeaderText("Abrindo link no navegador externo");
			alert.setContentText("Deseja Continuar?");
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK){
				
				try {

		    		File pdfFile = new File("C:\\Users/Shino/git/ProjectNews/News/src/main/resources", "2018-report.pdf");
		    		if (pdfFile.exists()) {

		    			if (Desktop.isDesktopSupported()) {
		    				java.awt.Desktop.getDesktop().open(pdfFile);
		    			} 
		    		}

		    	  } catch (Exception ex) {
		    		ex.printStackTrace();
		    	  }
		        
		    }
		});
		
		BorderPane borderpane = new BorderPane();
		ScrollPane scrollPane = new ScrollPane(borderpane);
		scrollPane.setFitToHeight(true);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		borderpane.setPrefSize(1280, 720);
	    imagem = new ImageView(new Image("img5.jpg"));
	    imagem.setFitHeight(428);
	    imagem.setFitWidth(720);
	    Strings.subtitleNot5.setFont(ITALIC_FONT);
	    Strings.subtitleNot5.setFill(Color.WHITE);    
	    Strings.titleNot5.setFont(new Font(40));
	    Strings.titleNot5.setFill(Color.WHITE);
	    Button btVoltar = new Button("Voltar");
	    Label title = new Label(null, new TextFlow(new Text("\n"), btVoltar, new Text("\n"), Strings.titleNot5, new Text(", \n"), Strings.subtitleNot5));
	    borderpane.setTop(title);
	    BorderPane.setAlignment(title, Pos.CENTER);
	    borderpane.setCenter(imagem);
	    BorderPane.setAlignment(imagem, Pos.CENTER);
	    Strings.not5.setFont(new Font(20));
	    Strings.not5.setFill(Color.WHITE);
	    Strings.autor2.setFont(new Font(18));
	    Strings.autor2.setFill(Color.WHITE);
	    Strings.tautor2.setFont(new Font(18));
	    Strings.tautor2.setFill(Color.AQUA);
	    Strings.hyp.setFont(new Font(20));
	    imagemEscritor = new ImageView(new Image("https://secure.gravatar.com/avatar/b640b6e2fa674edfa786ea96f46eb98e?s=128&d=mm&r=g"));
	    Label label = new Label(null, new TextFlow(new Text("\n"), Strings.hyp, Strings.not5, new Text("\n\n\n\n"), imagemEscritor, Strings.autor2, Strings.tautor2));
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
