package stagesAndScenes;

import javafx.application.*;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) 
	{	
		stage.setTitle("Simple JavaFX Application");
		stage.show();
	}

}
