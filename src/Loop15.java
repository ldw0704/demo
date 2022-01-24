/**
 * 
 * 
 * @author smart19
 *
 */
public class Loop15 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// continue는 바로 조건문으로 이동
			if (i == 5) {
				continue;

			}
			System.out.println(i);
		}
	}
}
