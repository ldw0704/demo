/**
 * for�� 2022 ���� ������� �ݺ��ؼ� ���
 * 
 * @author smart19
 *
 */
public class Loop3 {

	public static void main(String[] args) {
		int myAge = 1988;
		for (int i = 2022; i >= myAge; i--) {
			System.out.printf("�⵵ %d, ���� %d %n", i, i - (myAge - 1));
		}
	}
}
