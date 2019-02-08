package lists;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListWindowWithScroll extends JFrame
{
	private JTextField selectedMonth;
	private JLabel message;
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList monthList;
	private JScrollPane scrollPane;
	
	// The following array holds the values that will be displayed 
	// in the monthList list component
	private String[] months = {"January","February", "March","April","May","June","July",
								"August","September","October","November","December"};

	public ListWindowWithScroll()
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
		
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Register the list selection listener.
		monthList.addListSelectionListener(new ListListener());
		
		monthList.setVisibleRowCount(6);
		
		scrollPane = new JScrollPane(monthList);
		
		monthPanel.add(scrollPane);
		
	}
	
	
	private void buildSelectedMonthPanel() 
	{	
		selectedMonthPanel = new JPanel();
		
		message = new JLabel("You selected: ");
		selectedMonth = new JTextField(10);
		
		selectedMonth.setEditable(false);
		
		selectedMonthPanel.add(message);
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
		new ListWindowWithScroll();
	}
}
