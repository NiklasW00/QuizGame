public class Answers {
	public String[] answers;
	public Answers() {
		answers = new String [] {"Teenie Weenie","fine","Iceland"};
	}
	public String getAnswer(int index) {
		
		if (index>=0&&index<answers.length) {
			return answers[index];
		}
	return null;
	}
}
