package bbb;

import java.io.File;
import java.util.Scanner;

public class ScanEx {

	// bad code
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("C:\\zzz\\sample.txt"));
		while (true) {
			
			try {
				String str = scanner.nextLine();
			
				System.out.println(str);
			}catch(Exception e) {
				break;
			}
		}
	}
}
