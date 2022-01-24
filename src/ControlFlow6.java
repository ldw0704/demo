import java.util.Scanner;

public class ControlFlow6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연차를 입력하세요.");
		int m = 0;
		do {
			System.out.println("양수값을 입력핫에여");
			m = scan.nextInt();
		} while (m < 0);
		int y = m / 12;
		int day = 11 + y / 2;
		if (m < 12) {
			System.out.println(m - 1 + "일");
		} else {
			System.out.println((day >= 25) ? 25 : day + "일");
		}

	}

}
