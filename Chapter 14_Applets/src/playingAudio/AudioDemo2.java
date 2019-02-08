package playingAudio;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class AudioDemo2 extends JApplet
{
	private JLabel credit;
	private JButton playButton, loopButton, stopButton;
	private AudioClip sound;
	
	public void init()
	{
		setLayout(new FlowLayout());
		
		credit = new JLabel("Audio source: NASA");
		add(credit);
		
		// Make the buttons and add them
		makeButtons();
		
		// Get an AudioClip object for the sound file
		sound = getAudioClip(getCodeBase(),"step.wav");
	}

	private void makeButtons()
	{
		playButton = new JButton("Play");
		loopButton = new JButton("Loop");
		stopButton = new JButton("Stop");
		
		playButton.addActionListener(new ButtonListener());
		loopButton.addActionListener(new ButtonListener());
		stopButton.addActionListener(new ButtonListener());
		
		add(playButton);
		add(loopButton);
		add(stopButton);
		
	}
	
	public class ButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
		    if(playButton.isSelected())
		    	sound.play();
		    else if(playButton.isSelected())
		    	sound.loop();
		    else if(playButton.isSelected())
		    	sound.stop();

		}

	}

}

