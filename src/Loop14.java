/**
 * for�� �������� ����ϼ��� 3�ǹ���϶��� ¦�̶�� ����ϼ���
 * 
 * @author smart19
 *
 */
public class Loop14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			/*
			 * if (i % 3 == 0) { System.out.println("¦"); } else { System.out.println(i); }
			 */
			if (i % 3 == 0) {
				System.out.println("¦");
				continue;
			}
			System.out.println(i);
		}
	}
}