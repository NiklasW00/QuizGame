import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < Questions.questions.length; i++) {
            String question = Questions.questions[i];
            String correctAnswer = Answers.answers[i];

            System.out.println("Question " + (i + 1) + ": " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is: " + correctAnswer);
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + Questions.questions.length);
        scanner.close();
    }
}