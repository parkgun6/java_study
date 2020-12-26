package d4;

public class Anagram {

	public static void main(String[] args) {
		
		//대한민국 남성 5명의 키평균과 몸무게평균을 구하라
		//키의 배열 만들기
		double height[] = {100,50,50,50,30};
		double average = 0;
		double sum = 0 ;
		//키 평균 구하기
		for (int i= 0 ; i < height.length ; i++) {
		sum = sum + height[i];
		}
		average = sum/height.length;
		System.out.println(height.length + "명의 평균키는" + average + "입니다.");
		//몸무게 배열 만들기
		double weight[] = {60.3 , 72.3 , 70.5 , 66.8 , 42.5};
		double average2 = 0;
		double sum2 = 0;
		
		//몸무게 평균 구하기
		for(int j = 0; j < weight.length; j++) {
			sum2 = sum2 + weight[j];
			average2 = sum2 / weight.length; 
		}
		System.out.println(weight.length + "명의 평균몸무게는" + average2 + "입니다.");

	}asrgargsrasgasrgargsagsr
}
