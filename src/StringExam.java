/**
 * ���ڿ� String Ŭ����
 * 
 * @author smart19
 *
 */
public class StringExam {

	public static void main(String[] args) {
//���� �������� new�� �ʿ���. �Ⱦ����� ����.	""���.
//new�� ������ ���� �������ʰ� ������ �ִ� ���ڿ��� ����Ű�� �ȴ�.
//���ڿ� + ���ڿ��� ���ο� ���ڿ�+���ڿ��� ����� �ȴ�. ������ ���ڿ��� �߰��ϴ� ������ �ƴ�.
//		 StringBuilder �񵿱�
//		StringBuffer ���� - �޼ҵ� ���� ex)StringBuffer sb =null; ������ String�� ����. append�� ���
		// �乮��. �̸� ������ �����صΰ� �װ��� ���ڿ��� �Է���.
		String str = new String("abc");
		String str2 = new String("abc");
		System.out.println(str == str2); // �ּҰ� �ٸ��� ������ false, ����Ŭ������ �������� '==' ��������ʴ´�.
		System.out.println(str.equals(str2)); //equal �Լ�, ���� �ϳ��ϳ� ������ t/f��
		System.out.println(str);
		System.out.println(str2);
	}

}
