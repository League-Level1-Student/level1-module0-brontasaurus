package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class theduck implements ActionListener{
	JFrame grapes = new JFrame();
	JPanel harambe = new JPanel();
	JButton grap = new JButton();
	JButton chpk = new JButton();
	JButton pte = new JButton();
	
	public theduck() {
	grapes.add(harambe);
	grapes.setVisible(true);
    harambe.add(grap);
    grap.addActionListener(this);
    grap.setText("press for good luck");
	
    harambe.add(chpk);
    chpk.addActionListener(this);
    chpk.setText("press for snazzy songs");

    harambe.add(pte);
    pte.addActionListener(this);
    pte.setText("press for yes");
    grapes.pack();
    
	}
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     
		     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
		     //work on some Linux implementations
		     try {
		     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
		     if (Runtime.getRuntime().exec(new String[] {
		      "which", "xdg- open" }).getInputStream().read() != -1) {
		     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
		     }
		     } else {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     }      } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
		public void showButton() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == grap) {
				showDucks();
			}
			
			else if(e.getSource() == chpk) {
				showFrog();
			}
			
			else if(e.getSource() == pte) {
				showFluffyUnicorns();
			}
		}
		
		
	
}
