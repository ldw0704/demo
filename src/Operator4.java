
public class Operator4 {

	public static void main(String[] args) {
		// ���� ++, --
		int i = 0;
		// i++;, --i;
		System.out.println(++i); // ��½� ó������ ����
		// ���� !
		boolean b = false;
		System.out.println(!b);
		// �� >, >=, <, <=, ==, != ����� boolean
		int m = 10, n = 5;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println(m != n);
		// �� and[&&], or[||], not[!], xor(������ �����ϳ��� ���̾����)
		System.out.println("----------------");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("----------------");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("----------------");
		System.out.println(!false);
		System.out.println(!true);
		// ��Ʈ������ &, |, ^(xor), ~(not), <<, >>, >>>, 8�ڸ�
		byte bitNum1 = 15;
		byte bitNum2 = 20;
		System.out.println(bitNum1 & bitNum2); // 2������ ������ ���� 2�� ������ 1,1�� ��ġ. �� �ڸ����� �� ���Ѱ��� ��� 4
		System.out.println(bitNum1 | bitNum2); // ��� �ڸ����� 1�̹Ƿ� ���� 31
		System.out.println(~bitNum2); // ��ȣ���� �ٲ�, �������� 0 -127 <-> -1 - -128
		System.out.println(bitNum2 << 1);
		System.out.println(bitNum2 >> 1);
		System.out.println(bitNum2 >>> 1); // �ݴ�� ����, ��ȣ ���ٰ� �Ǵ�.�����Ⱦ�
		System.out.println(bitNum1 ^ bitNum2);
	}

}