/**
 * for문 삼육구를 출력하세요 3의배수일때는 짝이라고 출력하세요
 * 
 * @author smart19
 *
 */
public class Loop16 {

	public static void main(String[] args) {
		int i = 0;
//		while (++i <= 50) {
		while (i <= 50) {
			i++;
			if (i % 3 == 0) {
				System.out.println("짝");
				continue;
			}
			System.out.println(i);
		}
	}
}