import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	final static String SERVER_IP = "127.0.0.1";
	// ������鶧���� final, ����������� �� �빮��, �ܾ���̴� �����.
	// final �� ���� ���� �Ұ�.
	final static int SERVER_PORT = 1225;
	final static String MESSAGE_TO_SERVER = "Hi, Server";

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);// try/catch
			System.out.println("socket ����");

			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			os.write(MESSAGE_TO_SERVER.getBytes());
			os.flush();

			byte[] data = new byte[16];
			int n = is.read(data);
			final String messageFromServer = new String(data, 0, n); // data ��ŭ�� �о���δ�.
			System.out.println(messageFromServer);

			is.close();
			os.close();

			socket.close(); // �ݵ�� ���� �ݾ�����.

		} catch (Exception e) { // ����ó�� �ݵ�� �ش� ������ ó��
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
