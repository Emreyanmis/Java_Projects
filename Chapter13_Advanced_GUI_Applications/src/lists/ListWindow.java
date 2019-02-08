package lists;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListWindow extends JFrame
{
	// To hold components
	private JPanel monthPanel;
	
	// To hold components
	private JPanel selectedMonthPanel;
	
	// The months
	private JList monthList;
	
	// The selected month
	private JTextField selectedMonth;
	
	// A message
	private JLabel label;
	
	// The following array holds the values that will be displayed 
	// in the monthList list component
	private String[] months = {"January","February", "March","April","May","June","July",
								"August","September","October","November","December"};
	
	public ListWindow()
	{
			setTitle("List Demo");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			buildMonthPanel();
			buildSelectedMonthPanel();
			
			// Add the panels to the content pane
			add(monthPanel, BorderLayout.CENTER);
			add(selectedMonthPanel, BorderLayout.SOUTH);
			
			pack();
			setVisible(true);
	}
	private void buildMonthPanel() 
	{
		monthPanel = new JPanel();
		monthList = new JList(months);
		
		// Set the selection mode to single selection
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Register the list selection listener
		monthList.addListSelectionListener(new ListListener());
		
		// Add the list to the panel
		monthPanel.add(monthList);
		
		
	}
	
	private void buildSelectedMonthPanel() 
	{
		selectedMonthPanel = new JPanel();
		
		// Create the label
		label = new JLabel("You selected: ");
		
		// Create the text field
		selectedMonth = new JTextField(10);
		
		// Make the text field non-editable
		selectedMonth.setEditable(false);
		
		// Add the label and text field to the panel
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);	
	}
	
	public class ListListener implements ListSelectionListener 
	{

		@Override
		public void valueChanged(ListSelectionEvent e)
		{
			String selection = (String) monthList.getSelectedValue();
			
			// Put the selected month in the text field
			selectedMonth.setText(selection);
		}
	}	

	public static void main(String[] args)
	{
		new ListWindow();
	}
}
