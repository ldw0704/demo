
public class ControlFlow4 {

	public static void main(String[] args) {
		// if
		int i = 1;
		switch (i) {
		case 1:
			System.out.println("1�Դϴ�");
			break; // break;������ ���ö����� ���
		case 2:
			System.out.println("2�Դϴ�");
			break;
		case 3:
			System.out.println("3�Դϴ�");
			break;
		case 4:
			System.out.println("4�Դϴ�");
			break;
		case 5:
			System.out.println("5�Դϴ�");
			break;
		default:
			System.out.println("1~5�� �ƴմϴ�");
			break;
		}// switch�� ��ȣ�� ��밡��
		if (i > 5) {
			System.out.println("5���� Ů�ϴ�.");
		} else if (i == 5) {
			System.out.println("5�Դϴ�.");
		} else {
			System.out.println("5���� �۽��ϴ�.");
		}
	}

}