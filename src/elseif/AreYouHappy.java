package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	
	String question1 = JOptionPane.showInputDialog(null, "Are you Happy?");
	
	
	if(question1.equals("yes")) {

		JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing!");
	}
	
	else if(question1.equals("no")) {

		String question2 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	
	
	
	if(question2.equals("yes")) {
		
		JOptionPane.showMessageDialog(null,"Change Something!!!");
	}
	
	
	else if(question2.equals("no")) {
		
		JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing!");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
