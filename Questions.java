package QuizGame;
import java.util.Scanner;

public class Questions {
    private String[] questions = {
    		// Questions added in order
        "Question 1: In which year was Star Wars Episode 4 released?",
        "Question 2: What was the first videogame?",
        "Question 3: Who plays the lead guitar in AC/DC?"
    };
    //print out questions in order and make --- between
    public Questions(Scanner input) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("---");
        }
    }
    
}
