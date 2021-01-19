package onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OnServer {

	// bad code
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5555);

		Scanner keyScanner = new Scanner(System.in);

		System.out.println("Ready ............");

		Socket socket = server.accept();

		System.out.println("a client connected..........");

		DataInputStream din = new DataInputStream(socket.getInputStream());

		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

		new Thread(() -> {
			try {
				// 읽기용 루프
				for (int i = 0; i < 100; i++) {
					String msg = din.readUTF();
					System.out.println("받은 메세지 : " + msg);
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
