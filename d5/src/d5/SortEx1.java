package d5;

import java.util.Arrays;

public class SortEx1 {

	public static void main(String[] args) {
		
		Integer[] arr = {13,16,47,53,34,17};
		int target = 50;
		Arrays.sort(arr,(a,b)->Math.abs(target-a)-Math.abs(target-b));
		System.out.println(Arrays.toString(arr));
	}
}
