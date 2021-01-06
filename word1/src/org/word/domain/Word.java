package org.word.domain;

public class Word {

	
	private String decs;
	private String answer;
	
	public Word(String decs, String answer) {
		super();
		this.decs = decs;
		this.answer = answer;
	}
	public boolean checkAnswer(String userStr) {
		answer = answer.replace(" ", "");

		return userStr.equalsIgnoreCase(answer);
	}

	public String getDecs() {
		return decs;
	}

	public String getAnswer() {
		return answer;
	}

	@Override
	public String toString() {
		return "Word [decs=" + decs + ", answer=" + answer + "]";
	}
	
}
