import java.util.Arrays;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	// Declare the class variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	// Declare the instance variables
	String question;
	String correctAnswer;

	// Declare unchangeable string constants that will be reused as feedbacks
	final static String CORRECT_FEEDBACK = "Correct!";
	final static String INCORRECT_FEEDBACK = "Incorrect. The correct answer is ";
	final static String INVALID_FEEDBACK = "Invalid answer. Please enter A, B, C, D, or E.";
	final static String[] VALID_ANSWERS = new String[] { "A", "B", "C", "D", "E" };

	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		correctAnswer = answer.toUpperCase();
	}

	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();

			// to check if the answer was included in VALID_ANSWERS
			if (Arrays.asList(VALID_ANSWERS).contains(answer)) {
				return answer;
			} else {
				JOptionPane.showMessageDialog(null, INVALID_FEEDBACK);
				continue;
			}
		}
	}

	void check() {
		String answer = ask();
		nQuestions++;
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, CORRECT_FEEDBACK);
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, INCORRECT_FEEDBACK + correctAnswer);
		}
	}

	// Declare the class method showResults with the static modifier
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}

}
