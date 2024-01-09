package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 2. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog("what is the answer to this riddle  :  Who makes it, has no need of it.\n"
		+ "Who buys it, has no use for it.\n"
		+ "Who uses it can neither see nor feel it.\n"
		+ "What is it?");
		// 3. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("a coffin")){
	JOptionPane.showMessageDialog(null, "Correct");
	score +=1;
}
		// 4. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "WWWRRROOONNNGGG the correct answer is... A COFFIN");}
		// 5. Add some more riddles

		// 6. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"your score is..."+score);
	}
}

