package sceneGraphsAndNodes;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXHelloWorld extends Application
{

	@Override
	public void start(Stage stage)  
	{
		// Create label
		Label label = new Label("Hello World");
		label.setAlignment(Pos.CENTER);
		
		// Set the label as the root of the scene graph
		Scene scene = new Scene(label, 300, 80);
		stage.setScene(scene);
		
		// Set the stage title and show the stage
		stage.setTitle("Hello World!");
		stage.show();

	}

}
