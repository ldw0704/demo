/**
 * 피보나치 수열 10번
 * 
 * @author smart19
 *
 */
public class Loop10_1 {

	public static void main(String[] args) {
		int j = 0;
		int k = 0;
		int l = 1;
		int i = 0;
		while (i < 7) { // 꼭 반복 횟수를 변수로 넣을 필요는 없다.

			k = l + j;
			l = j;
			j = k;
			System.out.print(k + "\t");
			i++;
		}
	}
}
