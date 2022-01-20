import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread { // extends Thread �߰�

	final static int SERVER_PORT = 1225;
	final static String MESSAGE_TO_CLINET = "Hi, Client";

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try { // Ÿ���κ��� ������ �����
			serverSocket = new ServerSocket(SERVER_PORT);

			while (true) {
				System.out.println("socket ���� ���");
				Socket socket = serverSocket.accept();
				System.out.println("host:" + socket.getInetAddress() + "��� ���Ἲ��");

				InputStream is = socket.getInputStream(); // �Է� 
				OutputStream os = socket.getOutputStream(); // ���

				byte[] data = new byte[16];
				int n = is.read(data);
				final String messageFromClient = new String(data, 0, n); // data ��ŭ�� �о���δ�.
				System.out.println(messageFromClient);

				os.write(MESSAGE_TO_CLINET.getBytes()); //.�ٹ���Ʈ, ����Ʈ�� ��ȯ
				os.flush();
				
				is.close();
				os.close();  // �а� ����ϴ� �κ� ��ǲ��Ʈ������ Ŭ�������

				socket.close();
			}

		} catch (Exception e) { // ���� IO�����ٰ�
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
