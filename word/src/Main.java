import java.util.Scanner;

import ord.word.dao.WordDAO;
import ord.word.service.WordProvider;
import ord.word.ui.WordExamUI;

public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WordDAO dao = new WordDAO();
		WordProvider provider = new WordProvider(dao);
		WordExamUI ui = new WordExamUI(scanner,provider);
		ui.exam();
	}
}
