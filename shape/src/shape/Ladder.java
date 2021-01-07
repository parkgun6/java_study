package shape;

public class Ladder implements Areable{
	int floor;
	int ceil;
	int top;
	
	
	public Ladder(int floor, int ceil, int top) {
		super();
		this.floor = floor;
		this.ceil = ceil;
		this.top = top;
	}

	@Override
	public double getArea() {
		return (floor + ceil)*top/2;
	}

}
