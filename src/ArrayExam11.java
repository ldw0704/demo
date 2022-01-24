/**
 * 주어진 배열의 항목에서최대값을구해보세요. {1,5,3,8,2}
 * 
 * 결과값은 8
 * 
 * @author smart19
 *
 */
public class ArrayExam11 {

	public static void main(String[] args) {
		int[] i = { -1, 5, 3, 8, 2, };
		// int s = -99999999; = Integer.MAX_VALUE : s = 최대값 /최소값 MIN_VALUE
		int k = 0;
		for (int j = 0; j < i.length; j++) {
			if (i[j] > k) {
				k = i[j];
			}
//			System.out.println(k);
		}
		System.out.println(k);
	}
}
