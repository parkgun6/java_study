package d4;

public class NullEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		System.out.println(arr);
		
		arr = null;
		
		int[][] mrr = { null, {3,4}, {5,6} };
		
		System.out.println(mrr[0]);
		
		System.out.println(mrr[0][1]);
	}
}
