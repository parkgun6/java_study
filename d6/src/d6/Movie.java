package d6;

public class Movie {

	//인스턴스변수 - 멤버변수 - Field
	String category;
	
	int action;
	
	int kiss;

	//생성자 함수 -> new와 함께 인스턴스를 만들때 
	public Movie(String category, int action, int kiss) {
		this.category = category;
		this.action = action;
		this.kiss = kiss;
	}

	public double calcDistance(int action, int kiss) {
		
		return Math.sqrt( Math.pow(this.action - action,2) + Math.pow(this.kiss - kiss,2));
		
	}
	
	@Override
	public String toString() {
		return "Movie [category=" + category + ", action=" + action + ", kiss=" + kiss + "]";
	}
	
}

