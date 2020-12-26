package d2;

public class ForEx2 {

	public static void main(String[] args) {
		outer:
		for (int i = 3; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println(i+ " : " + j);
				break outer;
			}//for
		}//for
	}
}
