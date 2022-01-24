/**
 * ★ ★★ ★★★ ★★★★ ★★★★★
 * 
 * @author smart19
 *
 */
public class Loop9 {

	public static void main(String[] args) {

		for (int a = 1; a < 6; a++) {

			for (int b = 1; b <= a; b++) {
				System.out.print("★");
			}
			System.out.println();
		}

		for (int c = 1; c < 6; c++) {

			for (int d = 1; d <= 6 - c; d++) {

				System.out.print("★");
			}
			System.out.println();

		}

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j <= ((i >= 3) ? 6 - i : i); j++) {
				System.out.print("★");
			}
			System.out.println();// System.out.printf("\n"); 줄바꾸기
		}
	}
}
