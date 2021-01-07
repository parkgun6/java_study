package shape;

public class Triangle implements Areable{
	private int bot, hei;

	public Triangle(int bot, int hei) {
		super();
		this.bot = bot;
		this.hei = hei;
	}
	
	public double calcArea() {
		return (bot*hei)/2;
	}

	@Override
	public double getArea() {
		
		return calcArea();
	}
}