/**
 * 가위1 바위2 보3 게임프로그램 두명의유저가 임의값 선택후 결과출력
 * 
 * @author smart19
 */
public class ControlFlow8 {

	public static void main(String[] args) {
		int user1 = (int) (Math.random() * 3) + 1; // 본인
		int user2 = (int) (Math.random() * 3) + 1; // 상대방
		if (user1 == 1) {
			System.out.println("나는 가위");
		} else if (user1 == 2) {
			System.out.println("나는 바위");
		} else {
			System.out.println("나는 보");
		}
		if (user2 == 1) {
			System.out.println("상대방은 가위");
		} else if (user2 == 2) {
			System.out.println("상대방은 바위");
		} else {
			System.out.println("상대방은 보");
		}

		if (user1 == 1 && user2 == 1) {
			System.out.println("비김");
		} else if (user1 == 1 && user2 == 2) {
			System.out.println("짐");
		} else if (user1 == 1 && user2 == 3) {
			System.out.println("이김");
		} else if (user1 == 2 && user2 == 1) {
			System.out.println("이김");
		} else if (user1 == 2 && user2 == 2) {
			System.out.println("비김");
		} else if (user1 == 2 && user2 == 3) {
			System.out.println("짐");
		} else if (user1 == 3 && user2 == 1) {
			System.out.println("짐");
		} else if (user1 == 3 && user2 == 2) {
			System.out.println("이김");
		} else if (user1 == 3 && user2 == 3) {
			System.out.println("비김");
		}
	}
}
