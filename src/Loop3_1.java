/**
 * for�� 2022 ���� ������� �ݺ��ؼ� ���
 * 
 * @author smart19
 *
 */
public class Loop3_1 {

	public static void main(String[] args) {
		int i = 2022;
		int myAge = 1988;
		while (i >= myAge) {
			System.out.printf("�⵵ %d, ���� %d %n", i, i - (myAge - 1));
			i--;
		}
	}
}
