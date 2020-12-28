package d5;

public class Study2 {
	public char getResult(double indexValue) {

		if (indexValue > 30) {
			return 'A';
		} else if (indexValue > 24) {
			return 'B';
		} else if (indexValue > 20) {
			return 'C';
		} else if (indexValue > 15) {
			return 'D';
		} else if (indexValue > 13) {
			return 'E';
		} else if (indexValue > 10) {
			return 'F';
		} else {
			return 'G';
		}
	}

	public double calculate(double height, double weight) {

		double hData = Math.pow(height, 2);
		double result = weight / hData;
		return result;
	}

	public static void main(String[] args) {
		Study2 m = new Study2();
		double h = 1.83D;
		double w = 58D;
		double index = m.calculate(h, w);
		System.out.println(index);
		System.out.println(m.getResult(index));

	}
}
