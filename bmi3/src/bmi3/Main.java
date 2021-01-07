package bmi3;

public class Main {

	public static void main(String[] args) {
		
		BMICalculator cal = new BMICalculatorImpl();
		
		BMI3UI ui = new BMI3UI(cal);
		ui.play();
	}
}
