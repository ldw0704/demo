/**
 * �Ǻ���ġ ���� 10��
 * 
 * @author smart19
 *
 */
public class Loop10 {

	public static void main(String[] args) {
		int j = 0;
		int k = 0;
		int l = 1;
		for (int i = 0; i < 7; i++) { // �� �ݺ� Ƚ���� ������ ���� �ʿ�� ����.

			k = l + j;
			l = j;
			j = k;
			System.out.print(k + "\t");

		}
	}
}
