import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			HashSet<Integer> hs = new HashSet<Integer>(); // �ߺ���� x
			while (true) {
				hs.add((int) (Math.random() * 45) + 1);
				if (hs.size() == 6) { // hs�� 6�� �������� �ݺ�
					break;// �ݺ��� Ż��
				}
			}
			System.out.println(hs);
		}

	} // 2022 �ζ� 6�� ��÷

}
