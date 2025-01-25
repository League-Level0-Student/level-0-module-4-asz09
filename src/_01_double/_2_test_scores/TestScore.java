package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("What is your test score?"));
		
		if (score >= 80){
		JOptionPane.showMessageDialog(null,("Great!"));
		}
		else if(score >= 70) {
			JOptionPane.showMessageDialog(null,("Not bad!!"));
		}
		else if (score<= 69) {
			JOptionPane.showMessageDialog(null,("You can do this, good luck next time!"));
		
		}
	}


	}


	
	
