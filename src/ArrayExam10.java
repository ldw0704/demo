
public class ArrayExam10 {

	public static void main(String[] args) {

		int[] i = new int[2];
		int[] j = null;
		j = i; // j �� i�� ���� �迭�ּҸ� ���󰣴�, ���� �迭�ּҸ� ������.
		i[0] = 1;
		j[0] = 2; //j�� i�� ���� �迭�� �����Ҽ� ����.
		i = null; // �����ּ� ����� null �Է�
		System.gc(); // �����Ⱚ(null)�� ó���Ѵ�.
//		System.out.println(i[0]);
		System.out.println(j[0]);
	}
}