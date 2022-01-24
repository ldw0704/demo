import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	final static String SERVER_IP = "127.0.0.1";
	// 상수만들때쓰는 final, 상수변수명은 다 대문자, 단어사이는 언더바.
	// final 이 들어가면 변경 불가.
	final static int SERVER_PORT = 1225;
	final static String MESSAGE_TO_SERVER = "Hi, Server";

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);// try/catch
			System.out.println("socket 연결");

			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			os.write(MESSAGE_TO_SERVER.getBytes());
			os.flush();

			byte[] data = new byte[16];
			int n = is.read(data);
			final String messageFromServer = new String(data, 0, n); // data 만큼만 읽어들인다.
			System.out.println(messageFromServer);

			is.close();
			os.close();

			socket.close(); // 반드시 열면 닫아주자.

		} catch (Exception e) { // 예외처리 반드시 해당 변수가 처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
