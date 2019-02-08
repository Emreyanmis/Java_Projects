package panesAndComponentLayout;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.*;
import javafx.stage.*;


public class MarginExample extends Application
{

	public void start(Stage stage)
	{
		// Create  label and button
		Label label = new Label("This is a label");
		Button button = new Button("Button");
		Button button1 = new Button("Button1");
		
		// Set margins for a VBox pane on the label and button
		Insets insets = new Insets(10);
		VBox.setMargin(label, insets);
		VBox.setMargin(button, insets);
		
		// Create a VBox with default spacing and alignment
		VBox pane = new VBox();
		
		
		// Add the label and button to the children of the pane
		pane.getChildren().addAll(label, button);
		pane.getChildren().addAll(button);
		
		
		// Set pane as root of scene and set the scene on the stage
		Scene scene = new Scene(pane, 240, 80);
		stage.setTitle("Margin Example");
		stage.setScene(scene);
		stage.show();

		
	}
	
}
