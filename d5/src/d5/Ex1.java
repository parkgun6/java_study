package d5;

public class Ex1 {

	// 0. public static void
	// 1.이름 -> 로직 -> 동사 contains (){}
	// 2.입력되는 값 (타입 이름, 타입 이름...)
	// 3.결과 타입 -> 이름없는 변수
	public static boolean contains(int[] targetArr, int target) {
		boolean result = false;

		for (int i = 0; i < targetArr.length; i++) {
			if (targetArr[i] == target) {
				result = true;
				break;
			}
		}
		return result;
	}

}
