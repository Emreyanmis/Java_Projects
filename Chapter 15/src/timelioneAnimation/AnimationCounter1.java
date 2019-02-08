package timelioneAnimation;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;



public class AnimationCounter1 extends Application
{

	@Override
	public void start(Stage stage) throws Exception 
	{
		Label label = new Label("0");
		label.setAlignment(Pos.CENTER);
		
		EventHandler<ActionEvent> handler  = event ->
		{
			int count;
			count = Integer.parseInt(label.getText());
			count++;
			label.setText(String.valueOf(count));
		};
		
		// Build the frame
		Duration sec = new Duration(1000);
		KeyFrame keyFrame = new KeyFrame(sec, handler);
		
		// Build the time line animation
		Timeline timeline = new Timeline(keyFrame);
		timeline.setCycleCount(15);
		
		// Set the stage and show, and play the animation
		stage.setScene(new Scene(label, 250, 30));
		stage.setTitle("Animation Counter");
		stage.show();
		timeline.playFromStart();
	}

}
