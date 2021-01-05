package ord.word.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Word {

	private String desc;
	private String answer;

	public boolean checkAnswer(String userStr) {
		return userStr.toLowerCase().equals(answer);
	}
	
//	@Override
//	public String toString() {
//		return "Word [desc=" + desc + ", answer=" + answer + "]";
//	}

//	public String getDesc() {
//		return desc;
//	}
//	public String getAnswer() {
//		return answer;
//	}
//	public Word(String desc, String answer) {
//		super();
//		this.desc = desc;
//		this.answer = answer;
}
