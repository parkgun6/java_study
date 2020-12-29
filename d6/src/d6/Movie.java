package d6;

public class Movie {
	// 데이터의 구조 먼저 정리.
	// 인스턴스변수-멤버변수-필드(값)
	String category;
	int action;
	int kiss;
	// 변수선언만하고 초기화는 하지않는다.
	// 클래스에서 블럭을 정함 블럭=메모리

	
	// 생성자함수 -> new와 함께 인스턴스를 만들때
	//알트 쉬프트 s 컨스트럭트 유징 필드
	public Movie(String category, int action, int kiss) {
		super();
		this.category = category;
		this.action = action;
		this.kiss = kiss;
	}//개발자가 인스턴스변수가없으면 출력을 안함
	//기본생성자를 지워버림


	@Override
	public String toString() {
		return "Movie [category=" + category + ", action=" + action + ", kiss=" + kiss + "]";
	}

}
