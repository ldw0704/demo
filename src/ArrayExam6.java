
public class ArrayExam6 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		System.out.println(arr[1].length); // �������迭�� �迭���̴� �ళ��, Ư�� ���� ���̴� ���� ���̰� ���
		for (int i = 0; i < arr.length; i++) {// �迭�ݺ��� �迭���̸� Ȱ������!
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
