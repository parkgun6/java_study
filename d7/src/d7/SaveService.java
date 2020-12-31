package d7;

public class SaveService {

	int balance;

	// 생성자

	// 입금
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	public int withdraw() {
		int result = 0;

		result = balance;

		balance = 0;

		return result;
	}
}