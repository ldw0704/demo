/**
 * 
 * @author smart19
 *
 */
public class Loop8 {

	public static void main(String[] args) {
		int c = 0; // �������� ����
		int d = 0;
		for (int j = 1; j < 11; j++) {
			if (j % 2 == 0) { // toggle breakpoint(���ߴ°�) -> ��� �����(�������) Ŭ��.
				c = c + j; // �� �����ϸ� ��ȭ�Ѱ� �� ����
			} else {
				d = d + j;
			} // �ݺ����� ���� ������°� ����

		}
		System.out.println(c + d);
		System.out.println(c);
		System.out.println(d);
	}
}
