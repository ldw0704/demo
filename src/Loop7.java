
import java.time.LocalDateTime;// �ý��� Ŭ������ �⺻���� �ҷ����� �������� ���� �ҷ��´�.

/**
 * for�� ����ð����
 * 
 * @author smart19
 *
 */
public class Loop7 {

	public static void main(String[] args) {

		for (;;) {
			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour() + ":");
			System.out.print(ldt.getMinute() + ":");
			System.out.println(ldt.getSecond());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}