package d6;

public class MovieTest {
	public static void main(String[] args) {
		
		//사용자가 정의하는 데이터의 타입
		//다차원배열은 같은 변수의타입밖에 입력을못함
		//Movie클래스 블록을 실행하라. new은 새로운 메모리
		Movie m1 = new Movie("멜로",3,5);
		
		

		Movie m2 = new Movie("멜로",3,5);

		Movie[] arr = {m1,m2};
	}

	@Override
	public String toString() {
		return "MovieTest []";
	}
}
