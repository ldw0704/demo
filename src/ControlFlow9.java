/**
 * 연차프로그램(년별)
 * 
 * @author smart19
 *
 */
public class ControlFlow9 {

	public static void main(String[] args) {
		int longevity = -10; // 나는 longevity년차
		if (longevity < 1) {
			System.out.println("usage:양수값을 입력하세요");
			return;// void(없음) 아래내용을 수행하지않음. -c언어
		}
		switch (longevity) {
		case 1:
			System.out.println("연차개수가 11개 입니다");
			break;
		case 2:
			System.out.println("연차개수가 15개 입니다");
			break;
		case 3:
		case 4:
			System.out.println("연차개수가 16개 입니다");
			break;
		case 5:
		case 6:
			System.out.println("연차개수가 17개 입니다");
			break;
		case 7:
		case 8:
			System.out.println("연차개수가 18개 입니다");
			break;
		case 9:
		case 10:
			System.out.println("연차개수가 19개 입니다");
			break;
		case 11:
		case 12:
			System.out.println("연차개수가 20개 입니다");
			break;
		case 13:
		case 14:
			System.out.println("연차개수가 21개 입니다");
			break;
		case 15:
		case 16:
			System.out.println("연차개수가 22개 입니다");
			break;
		case 17:
		case 18:
			System.out.println("연차개수가 23개 입니다");
			break;
		case 19:
		case 20:
			System.out.println("연차개수가 24개 입니다");
			break;

		default:
			System.out.println("연차개수가 25개 입니다");
			break;
		}
	}
}
