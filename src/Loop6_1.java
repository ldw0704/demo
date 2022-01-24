/**
 * for문 현재시간출력
 * 
 * @author smart19
 *
 */
public class Loop6_1 {

	public static void main(String[] args) {
		int sec = (60 * 60 * 14) + (32 * 60);
//		System.out.println(sec);//전체초

		while (true) {// ;;는 무한루프
			sec++;
			System.out.print((sec) / (60 * 60) + "시 ");// 시
			System.out.print(((sec) % (60 * 60)) / 60 + "분 ");// 분
			System.out.println(((sec) % (60 * 60)) % 60 + "초");// 초
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1000이 1초
		}
	}
}
