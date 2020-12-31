package d4;

public class ArrayEx1 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		System.out.println(arr);
		int[] arr2 = arr;
		arr[1]=100;
		System.out.println(arr2[1]);
	}
}
