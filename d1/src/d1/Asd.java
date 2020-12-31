package d1;
import java.util.Scanner;

public class Asd {

   public static void main(String[] args) {
      while (true) {
         // 1_화면에 주사위를 굴릴까요? 라는 메세지가 보입니다.
         
         System.out.println("주사위를 굴릴까요?(동의시 Enter)");

         Scanner scanner = new Scanner(System.in);

         // 2_사용자는 ENTER를 누릅니다.

         String s = scanner.nextLine();

         int dice1 = (int) (Math.random() * 6) + 1;

         // 3_화면에 사용자가 뽑은 번호가 출력됩니다.

         System.out.println("당신의 주사위 : " + dice1);

         // 4_"컴퓨터가 주사위를 굴립니다. 실행할까요?"라는 메세지가 출력됩니다

         System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요? (동의시 Enter)");

         // 5_사용자는 ENTER를 누릅니다.

         String s1 = scanner.nextLine();

         // 6_컴퓨터가 만들어 낸 주사위 숫자가 출력되고, 사용자가 더 높은수이면
         // "You Win!",낮은 수이면 "You lose!", 비기면 "Draw"라는 메세지를 출력합니다.
         
         int dice2 = (int) (Math.random() * 6) + 1;
         System.out.println("컴퓨터의 주사위 : " + dice2);

         if (dice1 < dice2) {
            System.out.println("You lose!");
         } else if (dice1 > dice2) {
            System.out.println("You Win!");
         } else if (dice1 == dice2) {
            System.out.println("Draw");
         }
         System.out.println("다시하시겠습니까?(동의시 Enter)");
         String s2 = scanner.nextLine();
         continue;

      }

   }
}