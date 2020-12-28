package d4;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for (int i = 0; i <arr.length; i++) { 
			arr[i]= i*10;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
