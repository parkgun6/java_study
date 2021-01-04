package bbb2;

public class MemoService {
	
	private Memo[] arr;
	
	//메모를 뽑을 때, 값을 누적하기 위한 용도
	private int ord;
	
	public void readyChoise(int count) {
		
		arr = new Memo[count];
		int idx = (int)(Math.random()*count);
		for (int i = 0; i < arr.length; i++) {
			if(idx==i) {
				arr[i] = new Memo("X");
			}else {
				arr[i] = new Memo("O");
			}//end if
		}//end for
	}//end readyChoise
	//생성자가 없어서 매번 새로운 리턴값을 배출한다.
	
	public Memo getNextMemo() {
		Memo result = null;
		
		result = arr[ord];
		ord++;
		
		return result;
	}//end getNextMemo
}//end class
