package d5;

import java.util.Arrays;

public class CopyEx {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9};
	
	int[] arr2 = new int[5];
	System.arraycopy(arr, 0, arr2, 0, 0);//원본, 복사시작 , 대상 , 복사받을위치.몇개
	System.out.println(Arrays.toString(arr2));
}
}
