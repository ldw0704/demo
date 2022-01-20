
public class ControlFlow5 {

	public static void main(String[] args) {
		int score = 76;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		switch (score = score / 10) {
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
			break;
		case 9:
			System.out.println("A");
			break;
		case 10:
			System.out.println("A");
			break;
		default:
			System.out.println("F");
			break;
		}
		int m = 240; // 근무개월수
		int y = m / 12; // y는 년 day는 연차
		int day = 14 + y / 2;
		System.out.println((day >= 25) ? 25 : day);
	}

}
