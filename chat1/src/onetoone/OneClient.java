package onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneClient {

	// bad code
	public static void main(String[] args) throws Exception {

//		ServerSocket server = new ServerSocket(5555);

		Scanner keyScanner = new Scanner(System.in);

		System.out.println("Ready ............");

//		Socket socket = server.accept();
		Socket socket = new Socket("192.168.0.101", 5555);

		System.out.println("a client connected..........");

		DataInputStream din = new DataInputStream(socket.getInputStream());

		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        System.out.println("닉네임 입력");
        String name = keyScanner.nextLine();
        dos.writeUTF("등록=" + name);
		new Thread(() -> {
			try {
				// 읽기용 루프
				for (int i = 0; i < 100; i++) {
					String msg = din.readUTF();
					System.out.println(msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

		// 쓰기용 루프
		for (int i = 0; i < 100; i++) {
			String myMsg = keyScanner.nextLine();
			dos.writeUTF(myMsg);
			dos.flush();
		}
	}
}
