/**
 * �Ǻ���ġ ���� 10��
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
		while (i < 7) { // �� �ݺ� Ƚ���� ������ ���� �ʿ�� ����.

			k = l + j;
			l = j;
			j = k;
			System.out.print(k + "\t");
			i++;
		}
	}
}
