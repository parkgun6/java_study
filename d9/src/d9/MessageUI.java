package d9;

import java.util.Scanner;

public class MessageUI {

	Scanner scanner;
	MailSender mailSender;

	public MessageUI(Scanner scanner, MailSender mailSender) {
		this.scanner = scanner;
		this.mailSender = mailSender;
	}

	public void doJob() {

		System.out.println("누구에게 보낼것인가?");
		String to = scanner.nextLine();
		System.out.println("제목은 무엇인가?");
		String title = scanner.nextLine();
		System.out.println("내용은 무엇인가?");
		String content = scanner.nextLine();

		MessageDTO dto = new MessageDTO(to, title, content);
		System.out.println(dto);

		System.out.println("전송을 취소하시려면 n을 입력하세요.");
		String oper = scanner.nextLine();
		if (oper.equals("n")) {
			doJob();
		} // 취소하고 다시 시작하면 재귀 셀프 리컬시브
		boolean result = mailSender.sendMail(dto);
		System.out.println("전송결과" + result);
	}

}
