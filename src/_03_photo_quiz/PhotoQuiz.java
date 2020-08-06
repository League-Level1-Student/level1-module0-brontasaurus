package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String c = "https://i.pinimg.com/originals/b5/e7/fd/b5e7fd669d291fb2660f01cec44100cd.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component x;
		// 3. use the "createImage()" method below to initialize your Component
x = createImage(c);
		// 4. add the image to the quiz window
quizWindow.add(x);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String qew = JOptionPane.showInputDialog("where is waldo'ˢ ʰᵃᵗ");
		// 7. print "CORRECT" if the user gave the right answer
if (qew.equalsIgnoreCase("on his head")){
	JOptionPane.showMessageDialog(null, "correct");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "you fool");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(x);
		// 10. find another image and create it (might take more than one line
		// of code)

String y ="https://i.ytimg.com/vi/IWtjxXC68Q0/maxresdefault.jpg";
Component t;
t = createImage(y);

		// 11. add the second image to the quiz window
quizWindow.add(t);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String olb = JOptionPane.showInputDialog("what is she?");
		// 14+ check answer, say if correct or incorrect, etc.
if (olb.equalsIgnoreCase("a failure")){
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "no.");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
