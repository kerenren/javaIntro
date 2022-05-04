public class Quiz {

	public static void main(String[] args) {

		// question 1
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"To prevent any method from overriding, we declare the method as:", "static", "const", "final",
				"abstract", "None of the above.", "c");

		question.check();

		// question 2
		question = new MultipleChoiceQuestion("What does the expression float a = 35 / 0 return?", "0", "Not a Number",
				"Infinity", "Run time exception", "None of the above.", "c");

		question.check();

		// question 3
		question = new MultipleChoiceQuestion("Which of the following is true?",
				"A finally block is executed before the catch block but after the try block.",
				"A finally block is executed, only after the catch block is executed.",
				"A finally block is executed whether an exception is thrown or not.",
				"A finally block is executed, only if an exception occurs.", "None of the above.", "c");

		question.check();

		// question 4
		question = new MultipleChoiceQuestion("Which of the following is not a Java features?", "Dynamic",
				"Architecture Neutral", "Use of pointers", "Object-oriented", "None of the above.", "c");

		question.check();

		// question 5
		question = new MultipleChoiceQuestion("_____ is used to find and fix bugs in the Java programs.", "JVM", "JRE",
				"JDK", "JDB", "None of the above.", "d");

		question.check();

		MultipleChoiceQuestion.showResults();
	}

}
