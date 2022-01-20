/**
 * 홀짝프로그램
 * 
 * @author smart19
 *
 */
public class ControlFlow7 {

	public static void main(String[] args) {
		int i;
		i = 59;// [DEG] - 디버그
//		System.out.println("[DEG]" + (i % 2 == 0)); 
		if (i % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
