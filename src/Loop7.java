
import java.time.LocalDateTime;// 시스템 클래스는 기본으로 불러오고 나머지는 따로 불러온다.

/**
 * for문 현재시간출력
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
