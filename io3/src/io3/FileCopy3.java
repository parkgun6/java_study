package io3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy3 {

	public static void main(String[] args) {

		// 모든입출력은 자동으로 메모리가 회수되지않는다.
		// close() 규칙
		// 각각 따로 클로즈
		
		//변수를 밖에다가 선언해야함
		//매번 따로따로 클로즈 해주어야함
		//개발자가 복붙을하다가 실수할 가능성이있음.
		
		// 입출력 관련된 변수는 미리 선언한다.
		InputStream fin = null;
		OutputStream fos = null;

		try {
			fin = new FileInputStream("C:\\zzz\\sample.jpg");
			fos = new FileOutputStream("C:\\zzz\\sampleCopy.jpg");
			byte[] buffer = new byte[1024*8];
			
			while(true) {
				int count = fin.read(buffer);
				if(count == -1) {break;}
				fos.write(buffer,0,count);
			}//end while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//상속을 잘하면 클로즈를 안하고 자동으로 클로즈를 할 수 있다.
			if (fin != null) {try{fin.close();}catch(Exception e) {} }
			if (fos != null) {try{fos.close();}catch(Exception e) {} }
		}
	}
}
