import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread { // extends Thread 추가

	final static int SERVER_PORT = 1225;
	final static String MESSAGE_TO_CLINET = "Hi, Client";

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try { // 타이핑보단 눌러서 띄우자
			serverSocket = new ServerSocket(SERVER_PORT);

			while (true) {
				System.out.println("socket 연결 대기");
				Socket socket = serverSocket.accept();
				System.out.println("host:" + socket.getInetAddress() + "통신 연결성공");

				InputStream is = socket.getInputStream(); // 입력 
				OutputStream os = socket.getOutputStream(); // 출력

				byte[] data = new byte[16];
				int n = is.read(data);
				final String messageFromClient = new String(data, 0, n); // data 만큼만 읽어들인다.
				System.out.println(messageFromClient);

				os.write(MESSAGE_TO_CLINET.getBytes()); //.겟바이트, 바이트로 변환
				os.flush();
				
				is.close();
				os.close();  // 읽고 출력하는 부분 인풋스트림부터 클로즈까지

				socket.close();
			}

		} catch (Exception e) { // 앞의 IO지워줄것
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
