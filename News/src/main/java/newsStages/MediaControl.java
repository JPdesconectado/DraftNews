package newsStages;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;

import javafx.scene.media.MediaView;

public class MediaControl extends BorderPane {

    private MediaPlayer mp;
    private MediaView mediaView;
    public MediaControl(final MediaPlayer mp) {
        this.mp = mp;
        mediaView = new MediaView(mp);
        mediaView.setFitHeight(428);
        mediaView.setFitWidth(720);
        mp.setAutoPlay(false);
        Pane mvPane = new Pane() {
        };
        Button btPlay = new Button(">");
        Button btStop = new Button("II");
        mvPane.getChildren().add(mediaView);
        mvPane.setStyle("-fx-background-color: black");
        btPlay.setLayoutY(400);
        btStop.setLayoutX(60);
        btStop.setLayoutY(400);
        mvPane.getChildren().add(btPlay);
        mvPane.getChildren().add(btStop);
        setCenter(mvPane);
  
        
        
        btPlay.setOnAction(e ->{
        	if (mp.getStatus() == null) {
        		mp.stop();
        	}else {
        		mp.play();
        	}
        	
        	
        });
        
        btStop.setOnAction(e ->{
        	mp.stop();
        	
        });
        
  
    }
}