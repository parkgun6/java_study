package d7;

public class Quiz {

	String text;

	Quiz yes;

	Quiz no;

	public Quiz(String str) {
		this.text = str;
	}
	public Quiz getNext(String answer) {
		Quiz result = null;
		
		if(answer.equals("y")){
			result = yes;
		}else {
			result = no;
		}
		return result;
		
		
	}
	public String toString() {
		return this.text;
	}
	
	
}//컴포지션