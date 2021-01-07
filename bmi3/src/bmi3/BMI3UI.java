package bmi3;


public class BMI3UI {

	private BMICalculator calculator;
	
	public BMI3UI(BMICalculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void play() {
		double h = 100;
		double w = 70;
		
		double result = calculator.clac(h, w);
		System.out.println(result);
	}
}
