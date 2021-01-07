package shape;

public class Rectangle implements Areable{
	private int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}

	@Override
	public double getArea() {

		return width*height;
	}
}