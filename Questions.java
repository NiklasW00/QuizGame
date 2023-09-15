public class Questions {

	public String [] questions;
	public Questions() {
		questions = new String [] {"what's your name?","How are you?","where are you from?"};
	
	}	
	public String getQuestion(int index) {
		if (index>=0 && index <questions.length) {
			return questions[index];
		}
		return null;
	}
}
