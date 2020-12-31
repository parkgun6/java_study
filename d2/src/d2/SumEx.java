package d2;

public class SumEx {

	public static void main(String[] args) {
		
		int result = 0;//누적/합 루프의 바깥에 입력.
		
		for (int i = 1; i <= 10; i++) {
			
			result = result + i;
			
			System.out.println(result);
			
		}
		
	}
}
