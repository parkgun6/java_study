package d4;

public class ArrayEx3 {
	public static void main(String[] args) {

		// 2018년 8월의날씨
		double[] data = { 40, 38, 38, 35, 34, 35, 36, 45, 33, 37 };

		double sum = 0;

		double max = data[0];
		
		
		// 1. 루프를 돌아서 내용물을 출력
		for (int i = 0; i < data.length; i++) {

			// 루프를 돌아서 내용물을 출력

			// 제일 높은 수를 구하기
			double temp = data[i];
			if(temp > max) {
				max=temp;
				System.out.println(temp);
			}
			// 전체의 합
			sum = sum + data[i];
		}
		System.out.println(sum);
		// 전체의 평균
		System.out.println(sum/data.length);

		
		// 제일 높은 수와 인덱스 번호 구하기
	}
}
