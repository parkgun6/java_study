package d1;

import java.util.Scanner;

public class Study1 {
	
	public static void main(String[] args) {
		System.out.println("현재 시각을 입력하시오.");

		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int min = scanner.nextInt();

		System.out.println("현재 시각 : " + hour + "시 " + min + "분 ");
		
		/*시침과 분침의 각도를 구한다.
		 * 시침의 각도 = ( 360 / 12 ) * 시간 --> 30 */
		int hour_deg = ( 360 / 12 ) * hour;
		
		System.out.println("시침의 각도 : " + hour_deg);
		
		// 분침의 각도 = ( 360 / 60 ) * 60min
		int min_deg = ( 360 / 60 ) * min;
		
		System.out.println("분침의 각도 : " + min_deg);
		
		// 분에 따른 시침의 이동 = hour_move_deg
		double hour_move_deg = ( 30.0 / 60.0 ) * min;
		// 소수점이 있기 때문에 double을 사용해야함.
		
		System.out.println("1분당 시침의 이동 각도 : " + hour_move_deg);
		
		/*핵심 로직 : 시침 각도 - 분침 가고
		 * 결과 = 시침 각도 - 분침 각도 --> 30 - 180 */
		 
		double result = (hour_deg + hour_move_deg) - min_deg;
		
		/* 만일 각도가 음수가 나오면 어떻게 해야하나 ?
		   결과를 절댓값으로 표현한다.*/
		System.out.println("----------결과-----------");
		System.out.println("시침과 분침의 각도 : " + Math.abs(result));
		//Math.abs() 는 절대값.
	}

}
