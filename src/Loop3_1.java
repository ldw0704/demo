/**
 * for문 2022 본인 생년까지 반복해서 출력
 * 
 * @author smart19
 *
 */
public class Loop3_1 {

	public static void main(String[] args) {
		int i = 2022;
		int myAge = 1988;
		while (i >= myAge) {
			System.out.printf("년도 %d, 나이 %d %n", i, i - (myAge - 1));
			i--;
		}
	}
}
