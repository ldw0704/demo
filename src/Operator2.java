
public class Operator2 {

	public static void main(String[] args) {
		// ��������� + - * / %(��������)
		double i = 10;
		int j = 3;

		System.out.printf("%f + %d = %2.2f", i, j, i + j); // %x.x - x�� �ڸ���, %����ŭ ���ڼ� �ʿ�
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.printf("%.12f", i / j); // n�ڸ��� ����, 0 �ڸ��������� ���� ���ʿ� 0���, - ���� ��ĭ ����, m�Ҽ��� �Ʒ� �ڸ��� ����
		System.out.println(i % j);
	}

}
