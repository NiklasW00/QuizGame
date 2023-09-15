package QuizGame;
import java.util.Scanner;

public class Answers {
    private String[] answers = {
    		// answers in same order than questions
        "1978",
        "Pong",
        "Angus Young"
    };
    //takes input for question
    public Answers(Scanner input, int totalScore) {
        for (int i = 0; i < answers.length; i++) {
            System.out.print("Enter the answer for question " + (i + 1) + ": ");
            String response = input.nextLine();
            
            //look if input matched answer
            if (response.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                totalScore += 1; 
            } else {
                System.out.println("Sorry, the correct answer: " + answers[i] + ".");
            }
        }
//      Print out score
        System.out.println("Final score: " + totalScore);
    }
}
