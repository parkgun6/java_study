package d2;

public class Movie {

	public static void main(String[] args) {

		int price = 10000;
		int count = 120;
		
		for (int i = 0; i < 10; i++) {
			
			int income = price * count;
			
			int outcome = 180000 + (count * 800);
			
			int money = income - outcome;
			System.out.println("가격 : " + price);
			System.out.println("관객수 : " + count);
			System.out.println("수익 : " + money);
			System.out.println("-------------------");
			price = price - 1000;
			count = count + 30;
		}	//end loop
		

	}
}
