package d7;


public class PiggyService {

	int balance = 0;

	// 입금
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	public String withdraw(int money1) {

		String str = "";

		if (balance - money1 < 0) {
			str = "잔액이 모자랍니다. 다시 입력 해주세요.";
		} else {
			balance -= money1;
		}
		return str;
		//sysout을 사용하지 못하기 때문에 리턴값을 스트링으로 변경하였다.
	}
}
