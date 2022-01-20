
public class ControlFlow4 {

	public static void main(String[] args) {
		// if
		int i = 1;
		switch (i) {
		case 1:
			System.out.println("1입니다");
			break; // break;없으면 나올때까지 출력
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
		case 5:
			System.out.println("5입니다");
			break;
		default:
			System.out.println("1~5가 아닙니다");
			break;
		}// switch는 등호만 사용가능
		if (i > 5) {
			System.out.println("5보다 큽니다.");
		} else if (i == 5) {
			System.out.println("5입니다.");
		} else {
			System.out.println("5보다 작습니다.");
		}
	}

}