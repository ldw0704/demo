/**
 * �־��� �迭�� �׸񿡼��ִ밪�����غ�����. {1,5,3,8,2}
 * 
 * ������� 8
 * 
 * @author smart19
 *
 */
public class ArrayExam11 {

	public static void main(String[] args) {
		int[] i = { -1, 5, 3, 8, 2, };
		// int s = -99999999; = Integer.MAX_VALUE : s = �ִ밪 /�ּҰ� MIN_VALUE
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
