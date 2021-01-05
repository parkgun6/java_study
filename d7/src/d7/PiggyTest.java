package d7;

public class PiggyTest {

	public static void main(String[] args) {
		PiggyService service = new PiggyService();
		PiggyUI ui = new PiggyUI(service);
		ui.userAnswer();

	}
}
