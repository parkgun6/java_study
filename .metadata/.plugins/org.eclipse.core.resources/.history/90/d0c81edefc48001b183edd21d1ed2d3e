package d5;

import java.util.Arrays;

public class Lotto3 {
public static boolean contains(int[] targetArr, int target) {
	boolean result = false;
			for(int i = 0; i < targetArr.length; i++) {
				if(targetArr[i] == target) {
					target = -1;
					System.out.println(target);
					result = true;
					break;
			}
			}return result;
}
public static void main(String[] args) {
	int[] balls = new int[6];
	
	for (int i = 0; i < balls.length; i++) {
		int select = (int)(Math.random()*45)+1;
		System.out.println(select);
		if(contains(balls, select)) {
			System.out.println("바뀐수"+select);
			i--;
		}//end if
		balls[i]=select;
	}//end for
	System.out.println(Arrays.toString(balls));
}//end main
}
asfdasdfasfd