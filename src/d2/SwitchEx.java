package d2;

public class SwitchEx {

	public static void main(String[] args) {

		// switch 변수타입 > 숫자, char, 문자열, Enum

		char grade = 'B';

		switch (grade) {
		case 'B':
			System.out.println("A");
			return;
		case 'A':
			System.out.println("B");
			break;
		default:
			System.out.println("Z");
			break;
		}

	}

}
