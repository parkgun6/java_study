package io3;

public class Ex1 {
	// throws는 9회말 2아웃 대타
	private static int doA(int num1, int num2) throws Exception {

		int result = 0;

		try {
			result = num1 / num2;
			System.out.println("success");
			// close();
			return result;
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {

		Ex1.doA(10, 2);

	}
}
