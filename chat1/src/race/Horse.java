package race;

public class Horse extends Thread {// 말한마리당 쓰레드하나

	private String name;
	private int pos;

	public Horse(String name) {
		super();
		this.name = name;
		this.pos = 0;
	}

	@Override
	public void run() {// 스타트 할때 실제로 실행되는 메서드
		// 여태 람다식으로 간단하게 실행했다.
		// 쓰레드를 쓰는데 파라미터를 전달할수없다.
		// 리턴타입이 보이드다.
		gallop();
	}

	public void gallop() {

		for (int i = 0; i < 100; i++) {
			pos = pos + (int) (Math.random() * 10);

			int count = pos / 10;
			synchronized (System.out) {
				for (int j = 0; j < count; j++) {
					System.out.print(".");
				}

				System.out.println(name + " : " + pos);

			}//end synchronized

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end for
	}// end gallop

}
