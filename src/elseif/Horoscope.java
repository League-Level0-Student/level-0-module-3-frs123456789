package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	
	
	String question1 = JOptionPane.showInputDialog(null, "What is your star sign? (Zodiac Sign), if you don't know, look at this website, https://www.horoscopedates.com/zodiac-signs/");
	
	if(question1.equals("aries")) {

		JOptionPane.showMessageDialog(null,"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		
	}
	
	else if(question1.equals("taurus")) {

		JOptionPane.showMessageDialog(null,"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		
	}
	
	else if(question1.equals("gemini")) {

		JOptionPane.showMessageDialog(null,"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		
	}
	
	else if(question1.equals("cancer")) {

		JOptionPane.showMessageDialog(null,"Emotional, group oriented, seeks security, family.");
		
	}
	
	else if(question1.equals("leo")) {

		JOptionPane.showMessageDialog(null,"Generous, organized, protective, beautiful.");
		
	}
	
	else if(question1.equals("virgo")) {

		JOptionPane.showMessageDialog(null,"Particular, logical, practical, sense of duty, critical.");
		
	}
	
	else if(question1.equals("libra")) {

		JOptionPane.showMessageDialog(null,"Balanced, seeks beauty, sense of justice.");
		
	}
	
	else if(question1.equals("scorpio")) {

		JOptionPane.showMessageDialog(null,"Passionate, exacting, loves extremes, combative, reflective.");
		
	}
	
	else if(question1.equals("sagittarius")) {

		JOptionPane.showMessageDialog(null,"Happy, absent minded, creative, adventurous.");
		
	}
	
	else if(question1.equals("capricorn")) {

		JOptionPane.showMessageDialog(null,"Timeless, driven, calculating, ambitious.");
		
	}
	
	else if(question1.equals("aquarius")) {

		JOptionPane.showMessageDialog(null,"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		
	}
	
	else if(question1.equals("pisces")) {

		JOptionPane.showMessageDialog(null,"Likeable, energetic, passionate, sensitive.");
		
	}
	
	else {
		
		JOptionPane.showMessageDialog(null,"That's not a star sign silly.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
