import java.util.Scanner;

/**
 * ������, ����, ��� ����ó�����α׷��� �ۼ��Ͻÿ�
 * 
 * @author smart19
 *
 */
public class ArrayExam5 {
// �迭�� ������ ���� �����Ұ� ����Ÿ�Ը� ���尡��
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //�˻������ϰ��ϴ� Ŭ����.
		
		int[] grade = new int[5];
		System.out.println(grade.length); // �������� . �ڿ� ���� ��ɾ����� length ����
		System.out.println("������Է�");
		grade[0] = scan.nextInt();
		System.out.println("������Է�");
		grade[1] = scan.nextInt();
		System.out.println("���м����Է�");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("����: %d, ����: %d, ����:%d ", grade[0], grade[1],grade[2]);
		System.out.printf("����: %d, ���: %d", grade[3], grade[4]); // ���������� ���ϼ� �ִ�.
	}

}
