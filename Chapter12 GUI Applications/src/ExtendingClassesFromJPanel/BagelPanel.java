package ExtendingClassesFromJPanel;

import javax.swing.*;
import java.awt.*;

public class BagelPanel extends JPanel
{
	 // Cost of each type of bagel
	public final double WHITE_BAGEL = 1.25;
	public final double WHEAT_BAGEL = 1.50;
	
	 private JRadioButton whiteButton;
	 private JRadioButton wholeWheatButton;
	 private ButtonGroup radiobuttonGroup;
	 
	 public BagelPanel()
	 {
		 setLayout(new GridLayout(2, 1));
		 
		 whiteButton = new JRadioButton("White");
		 wholeWheatButton = new JRadioButton("Whole wheat");
		 
		 // Group the radio buttons
		 radiobuttonGroup = new ButtonGroup();
		 radiobuttonGroup.add(whiteButton);
		 radiobuttonGroup.add(wholeWheatButton);
		 
		 // Add a border around the panel
		 setBorder(BorderFactory.createTitledBorder("Bagel"));
		 
		 // Add the radio buttons to the panel
		 add(whiteButton);
		 add(wholeWheatButton);	 
	 }
	 
	 public double getBagelCost()
	 {
		 double bagelCost = 0.0;
		 
		 if(whiteButton.isSelected())
			 bagelCost = WHITE_BAGEL;
		 else if(wholeWheatButton.isSelected())
			 bagelCost = WHEAT_BAGEL;
		 return bagelCost;
	 }
}
