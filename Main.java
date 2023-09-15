public class Main {
   public static void main(String[] args) {
	   int questionNumber = 1;
       Questions questionBank = new Questions();
       Answers answerBank = new Answers();
       String question = questionBank.getQuestion(questionNumber);
       String answer = answerBank.getAnswer(questionNumber);
       System.out.println(question);
       System.out.println(answer);
   }
}

