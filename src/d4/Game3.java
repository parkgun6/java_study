package d4;

import java.util.Scanner;

public class Game3 {
	
	public static void main(String[] args) {
		
		
		//게임이 한번 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("몇 명이서 할꺼야?");
			int peopleCount = Integer.parseInt(scanner.nextLine()); //5
			
			//당첨 
			int target = (int)(Math.random() * peopleCount) + 1; //1 5
			System.out.println("target: " + target);
			
			for(int i = 1;  i <= peopleCount; i++) {
				System.out.println("마음에 준비를 하고 엔터...");
				scanner.nextLine();
				
				if( i == target) {
					System.out.println("당첨... ");
					break;
				}
				System.out.println("꽝............");
				
			}//for end 
			
			System.out.println("A Game end");
			
			while(true) {
				System.out.println("To be countinue? yes 1 , no 2 ");
				
				int choice =  Integer.parseInt(scanner.nextLine());
				//1이면 다시 
				if(choice == 1) {
					System.out.println("게임을 다시 시작합니다. ");
					break;
				}else if(choice == 2) {
					System.out.println("끝냅니다...");
					return;
				}else {
					System.out.println("잘 모르겠고.. 다시 선택해라.. ");
				}
			}//end while
			
			
		}//while
		
	}//main end 

}//class end
