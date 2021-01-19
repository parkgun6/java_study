package io5;

import java.net.URL;
import java.util.Scanner;

public class Ex1 {

	// bad code
	public static void main(String[] args) throws Exception {

		Scanner keyscanner = new Scanner(System.in);

		System.out.println("마음의 준비를 하고 Enter");

		keyscanner.nextLine();

		String path = "http://www.naver.com";

		for (int i = 0; i < 5000; i++) {
			new Thread(() -> {
				try {
					URL url = new URL(path);

					Scanner inScanner = new Scanner(url.openStream());

					for (int j = 0; j < 10; j++) {
						System.out.println(inScanner.nextLine());
					} // end for
				} catch (Exception e) {
				}
			}).start();
		} // end for
	}
}
