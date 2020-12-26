import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean flag2 = true;
        int inputNum = 0;
        int random = 0;

        while(true) {

            System.out.println("경우의 수를 지정해주세요.");
            inputNum = scanner.nextInt();


            while(flag) {
                System.out.println("경우의 수가 " + inputNum + "이(가) 맞습니까?\n" + "맞습니다. : 1, 아닙니다 : 2");
                int correct = scanner.nextInt();

                switch (correct) {
                    case 1:
                        flag=false;
                        break;
                    case 2:
                        continue;
                    default:
                        System.out.println("잘못된 값입니다. 값을 다시 입력해주세요.");
                        break;
                }
                continue;
            }



            System.out.println("게임을 시작합니다.");

            while(true) {
                System.out.println("1부터 " + inputNum + "사이 하나의 숫자를 입력해주세요.");
                random = (int) (Math.random()*inputNum+1);

                int inputNum2 = scanner.nextInt();
                if(inputNum2 == random) {
                    System.out.println("당첨입니다.");
                    break;
                } else if(inputNum2 == 0) {
                    System.out.println("");
                    continue;
                } else if(inputNum2 != random) {
                    System.out.println("꽝입니다.");
                    continue;
                }
            }

            while(flag2) {
                System.out.println("게임을 다시하려면 1번 중지 2번");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        flag2 = false;
                        System.out.println("처음으로 돌아갑니다.");
                        System.out.println("-------------------");
                        break;
                    case 2:
                        System.out.println("이용해주셔서 감사합니다.");
                        System.out.println("----------------------");
                        return;
                    default:
                        System.out.println("잘못된 값입니다.");
                        continue;
                }
            }
        }
    }
}
