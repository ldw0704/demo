/**
 * ���ڿ� String Ŭ����
 * 
 * @author smart19
 *
 */
public class StringExam2 {

	public static void main(String[] args) {

		String str = "ABC"; // ��ҹ��� ������. -> �ٸ��� ������ ���� �޸𸮰� �Ҵ�.
		String str2 = "abc";
		System.out.println(str == str2); // new�� ������ �ٸ� �޸�. new ������ ���� �ּ� ���.
		System.out.println(str.equals(str2)); // ���� ���� ������ equals���.
		System.out.println(str);
		System.out.println(str2);
	}

}
