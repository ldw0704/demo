/**
 * for문 1-50 정수 중 3의 배수 총합구하기 출력결과 : 3+6+9+=18 ->3+6+9=18 되도록
 * 
 * @author smart19
 *
 */
public class Loop17 {
	public static void main(String[] args) {
		int sum = 0;
		int max = 30;

		for (int i = 1; i <= max; i++) {

			if (i % 3 == 0) {
//				sum = sum + i;
				sum += i;
				System.out.print(i);

//				if (max - i != max % 3) {
				if (i != (max - (max % 3))) {
					System.out.print("+");

				}
			}

		}

		System.out.print("=" + sum);
	}
}