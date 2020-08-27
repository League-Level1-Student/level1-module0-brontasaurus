package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class koook implements ActionListener {
        public void showButton() {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            JButton button = new JButton();
            frame.add(button);
            frame.pack();
            button.addActionListener(this);
            button.setText("button of fortune");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			 int number = new Random().nextInt(5);
			
			if(number == 0) {
				JOptionPane.showMessageDialog(null, "Itsa me mario");
			}
			else if(number == 1) {
				JOptionPane.showMessageDialog(null, "are you vegan? if so probably stop... you have a 100% chance of death. not great odds.");
			}
			else if(number == 2) {
				JOptionPane.showMessageDialog(null, "spagetti is delicious and you should eat some.");
			}
			else if(number == 3) {
				JOptionPane.showMessageDialog(null, "dont go through the next door... it wont end well. you might end up in a different room");
			}
			else if(number == 4) {
				JOptionPane.showMessageDialog(null, "go google penguins (you can thank me later)");
			}
			
		}
    }
	


