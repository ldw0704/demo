/**
 * for�� 1���� 10���� ���
 * 
 * @author smart19
 *
 */
public class Loop {

	public static void main(String[] args) {
//for �ʱⰪ, ���ǹ�, ������ ���๮ >���� ���ǹ����� ���๮ �ݺ��� false�� Ż��
		// ������ �̱��Խ� ���ѹݺ�(�������� ���⶧���� ������ ���Ͼ)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		} // i�� 0���� �����ϴ°� �迭���� �׸��� ���ǹ�Ƚ���� �������̰� �ȴ�.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
