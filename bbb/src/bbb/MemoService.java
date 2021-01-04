package bbb;

import java.util.Arrays;

import bbb.Memo;

public class MemoService {

	// 의존적인 객체 혹은 데이터는 주입해서 써라
	// 서비스는 ui가 없으면 쓸모가없다.
	private Memo[] arr;

	
	// 메서드를 공유하면 인스턴스배리어블
	public void readyMemo(int count) {
		int idx = (int) (Math.random() * count);
		arr = new Memo[count];
		for (int i = 0; i < count; i++) {
			arr[i] = idx == i ? new Memo("X") : new Memo("O");
		}

	}// 생성자없이 매번 새로운 리턴값

	public Memo getNextMemo() {
		System.out.println("DEBUG: " + Arrays.toString(arr));

		Memo result = arr[0];
		Memo[] temp = new Memo[arr.length-1];
		System.arraycopy(arr, 1, temp, 0, temp.length);
		
		arr = temp;
		
		
		return result;
	}

}
