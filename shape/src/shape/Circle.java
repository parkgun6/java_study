package shape;

public class Circle implements Areable{
	private double ra;

	public Circle(double ra) {
		super();
		this.ra = ra;
	}



	public double getArea() {
		return Math.PI * (ra * ra);
	}

}
