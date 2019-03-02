package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {

public static void main(String[] args) {
	
	
	fortunecookie fc= new fortunecookie();
	fc.showButton();
}

	
	public void showButton() {
	     System.out.println("Button clicked");
JFrame frame=new JFrame();
frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int rand = new Random().nextInt(3);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "Every second a fool is born");
		}
		if(rand==1) {
			
			JOptionPane.showMessageDialog(null, "You r gonna get rejected");
		}
if(rand==2) {
			
			JOptionPane.showMessageDialog(null, "You need a life");
		}
	}

	
	
	
	
}
