
public class Variable2 {

	public static void main(String[] args) {
		byte b = 127;// 1byte
		short s = 1;// 2byte
		int i = 10;// 4byte
		long l = 10l;// int�� �����ϱ����� L����, 8byte
		double d = 10.0;
		double d2 = 0.0;// �Ҽ��� �� ������. -> 0., .0, 8byte ������ �Է��ص� ��밡��(�������� ū���� �������⶧��)
		char c = 'A';// �ƽ�Ű�ڵ�, �ڹٴ� �ѱ۵� ����
		float f = .0f;// double�� �����ϱ����� F������. 4byte
		boolean sw = true;
		boolean sw2 = false;
		System.out.println("��\t��");// �Ǹ�ŭ ����
		System.out.println("��\n��");// �ٹٲ�
		System.out.println("��\"��");// '"'�ֱ�
		System.out.println("��\\��");// '/' �ֱ�
	}

}
