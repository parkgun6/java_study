package ord.word.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import ord.word.dao.WordDAO;
import ord.word.domain.Word;

public class WordProviderTests2 {

	WordProvider provider;

	@Before // 테스트를 하기전에
	public void setUp() throws Exception {

		WordDAO dao = new WordDAO();
		provider = new WordProvider(dao);
	}

//	@Test
//	public void test() {
//		assertNotNull(provider);
//	}
//
//	@Test//테스트 코드를 만들때 보이드로 선언하고 파라미터를 비워야한다.
//	public void testGetNext() {
//		Word word = provider.getNext();
//		System.out.println(word);
//		assertEquals(word.getAnswer(), "apple");
//	}
//	
//	@Test
//	public void testCopy() {
//		int[] arr = {1,2,3,4,5};
//		int[] dest = new int[4];
//		
//		System.arraycopy(arr, 1, dest, 0, dest.length);
//		System.out.println(Arrays.toString(dest));
//		arr=dest;
//	}

	@Test
	public void split() {
		String str = "투표를 영어로 무엇이라하는가?@vote";
		String[] arr = str.split("@");

		System.out.println(Arrays.toString(arr));

		Word word = new Word(arr[0], arr[1]);

		System.out.println(word);

	}

	@Test
	public void loadTest() throws FileNotFoundException {
		File file = new File("C:\\zzz\\test.txt");
		Scanner scanner = new Scanner(file, "UTF-8");
		Word[] words = new Word[5];
		for (int i = 0; i < 5; i++) {
			String line = scanner.nextLine();
			System.out.println(line);
			String[] arr = line.split("@");
			Word word = new Word(arr[0], arr[1]);
			words[i] = word;

			System.out.println(word);
		}
		System.out.println(Arrays.toString(words));

	}

}
