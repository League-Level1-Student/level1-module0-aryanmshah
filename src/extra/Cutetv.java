package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cutetv implements ActionListener {

	
	public static void main(String[] args) {
		
		
		Cutetv fc= new Cutetv();
		fc.showButton();
		
	
		
	}
	JButton button = new JButton();
	JButton button1= new JButton();
	JButton button2= new JButton();
	public void showButton() {
	    System.out.println("Button clicked");
	JFrame frame=new JFrame();
JPanel panel=new JPanel();
frame.add(panel);
	frame.setVisible(true);
	
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button.setText("1");
	button1.setText("2");
	button2.setText("3");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonpressed=(JButton)e.getSource();
		if(buttonpressed==button) {
			
			showDucks();
		}
if(buttonpressed==button1) {
			
			showFrog();
		}
if(buttonpressed==button2) {
	
	showFluffyUnicorns();
}
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
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
