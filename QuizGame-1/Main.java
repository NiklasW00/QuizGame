package QuizGame;
import java.util.Scanner;



public class Main {
	// starts with 0 score and Input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        //Get Questions and Answers from the other files
        Questions obj = new Questions(input);
        Answers obj2 = new Answers(input, totalScore);
     
    }
}
