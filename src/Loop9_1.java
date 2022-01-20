/**
 * ★ ★★ ★★★ ★★★★ ★★★★★
 * 
 * @author smart19
 *
 */
public class Loop9_1 {

	public static void main(String[] args) {
		int a = 1;
		while (a < 6) {
			int b = 1;
			while (b <= a) {
				System.out.print("★");
				b++;
			}
			System.out.println();
			a++;
		}

		int i = 1;
		while (i < 6) {
			int j = 1;
			while (j <= ((i >= 3) ? 6 - i : i)) {
				j++;
				System.out.print("★");
			}
			System.out.println();
			i++;// System.out.printf("\n"); 줄바꾸기
		}
	}
}
