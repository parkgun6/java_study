package d4;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		
		double[] data = {40,38,38,35,34,35,46,35,33,37};
		
		double sum = 0;
		
		double max = data[0];
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
			double temp = data[i];
			if(temp > max) {
				max = temp;
			}
			
			sum = sum + data[i];
		}
		
		System.out.println("-----------------------");
		System.out.println(sum);
		
		System.out.println(sum/data.length);
		System.out.println(max);
	}
}
