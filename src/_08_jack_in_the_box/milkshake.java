package _08_jack_in_the_box;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class milkshake implements ActionListener{

int counter = 0;	
	  public void showButton() {
          JFrame frame = new JFrame();
          frame.setVisible(true);
          JButton button = new JButton();
          frame.add(button);
          frame.pack();
          button.addActionListener(this);
          button.setText("whoops");
          
	  }
		private void showPicture(String fileName) {
		    try {
		        JLabel imageLabel = createLabelImage(fileName);
		        JFrame frame = new JFrame();
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(imageLabel);
		        frame.pack();
		        frame.setVisible(true);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		private JLabel createLabelImage(String fileName) {
			try {
		            URL imageURL = getClass().getResource(fileName);
		            if (imageURL == null) {
			       System.err.println("Could not find image " + fileName);
			       return new JLabel();
		            } else {
		                Icon icon = new ImageIcon(imageURL);
		                JLabel imageLabel = new JLabel(icon);
		                return imageLabel;
		            }
		        } catch (Exception e) {
		            System.err.println("Could not find image " + fileName);
		            return new JLabel();
		        }
		}
		
		private void playSound(String soundFile) { 
		    try {
		       // AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		        //sound.play();
		        System.out.println("*jack in the box noises*");
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			counter++;
			if (counter >= 5) {
				showPicture("jackInTheBox.png");
				counter = 0;
			}
		}
		
	
	
}
