/**
 * 
 * @author smart19
 *
 */
public class Loop8_1 {

	public static void main(String[] args) {
		int c = 0; // �������� ����
		int j = 1;
		int d = 0;
		while (j < 11) {
			if (j % 2 == 0) { // toggle breakpoint(���ߴ°�) -> ��� �����(�������) Ŭ��.
				c = c + j; // �� �����ϸ� ��ȭ�Ѱ� �� ����
			} else {
				d = d + j;
			} // �ݺ����� ���� ������°� ����
			j++;
		}
		System.out.println(c + d);
		System.out.println(c);
		System.out.println(d);
	}
}
