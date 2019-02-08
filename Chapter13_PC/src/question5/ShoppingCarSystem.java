package question5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingCarSystem extends JFrame
{
	private JMenuBar menuBar;
	private JMenu DiscountsMenu;
	private JMenu BooksMenu;
	private JMenuItem discountsItem;
	
	private JRadioButtonMenuItem addBooks;
	private JList books;	

	private JRadioButtonMenuItem removeItem;
	private JRadioButtonMenuItem clearItem;
	private JRadioButtonMenuItem checkoutItem;
	
	private JRadioButtonMenuItem discounts;
	
	private JButton checkoutButton;

	
	public ShoppingCarSystem()
	{
		setTitle("Shopping Card System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		
		
	}
	
	
	public static void main(String[] args) 
	{
		

	}

}
