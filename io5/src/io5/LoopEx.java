package io5;


public class LoopEx {

	public static void main(String[] args) {

		new Thread(() -> {

			for (int i = 0; i < 1000; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}).start();

		System.out.println("--------------------");

		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}
}
