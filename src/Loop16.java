/**
 * for�� �������� ����ϼ��� 3�ǹ���϶��� ¦�̶�� ����ϼ���
 * 
 * @author smart19
 *
 */
public class Loop16 {

	public static void main(String[] args) {
		int i = 0;
//		while (++i <= 50) {
		while (i <= 50) {
			i++;
			if (i % 3 == 0) {
				System.out.println("¦");
				continue;
			}
			System.out.println(i);
		}
	}
}