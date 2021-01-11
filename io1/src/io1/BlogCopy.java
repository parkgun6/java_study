package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class BlogCopy {

	// bad code - throws Exception
	public static void main(String[] args) throws Exception {
		// 읽는빨대
		String path = "https://vliveplus.pstatic.net/0/campaign/2020/11/naverwithsme/hg_intro.mp4";
		
		URL url = new URL(path);
		
		InputStream in = url.openStream();

		System.out.println(in);

		// 쓰는빨대
		OutputStream out = new FileOutputStream("c:\\zzz\\copy.mp4");

		// read - 1byte의 내용물을 읽어서 int 타입으로 반환한다.
		while (true) {

			int data = in.read();// 맨 앞에있는 데이터 함수형으로 설계됨
			if (data == -1) {
				break;
			}
			out.write(data);

		} // end while
	}// end main
}
