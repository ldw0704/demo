/**
 * 5*5 ������
 * 
 * @author smart19
 *
 */
public class ArrayExam8 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 11,18,25,2,9 },
				{ 10,12,19,21,3 },
				{ 4, 6, 13, 20, 22 },
				{ 23, 5, 7, 14, 16},
				{ 17, 24, 1, 8, 15}// �迭�� ũ�Ⱑ �ึ�� �޶� ��
				}; // �������迭 ��������ÿ� �� �ִ� ����.
		
		int rowCntChk = 0; //���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (65*5)) {
			System.out.println("����");
			return;
		}
		
		int colCntChk = 0;//���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // ��ǥ �ٲ�
			}			
		}
		if(colCntChk != (65*5)) {
			System.out.println("����");
			return;
		}
		
		int leftTop =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					leftTop += arr[i][j];
				} 				
			}			
		}
		if(leftTop != 65) {
			System.out.println("����");
			return;
		}
		
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i + j == 4) {
					rightTop += arr[i][j];
				} 				
			}			
		}
		if(rightTop != 65) {
			System.out.println("����");
			return;
		}
		System.out.println("����");
	}
}