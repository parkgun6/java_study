package bmi2;

public class PersonData {

	private String name;
	private double height;
	private double weight;

	public PersonData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "PersonData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
