/**
 * 3*3 ������
 * 
 * @author smart19
 *
 */
public class ArrayExam7 {

	public static void main(String[] args) {
		; // �������迭 ��������ÿ� �� �ִ� ����.
		// �迭�� ũ�Ⱑ �ึ�� �޶� ��
		int[][] arr = { 
				{ 2,7,6 },
				{  9,5,1},
				{  4,3,8}
				
				};
		int rowCntChk = 0; //���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (15*3)) {
			System.out.println("����");
			return;
		}
		
		int colCntChk = 0;//���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // ��ǥ �ٲ�
			}			
		}
		if(colCntChk != (15*3)) {
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
		if(leftTop != 15) {
			System.out.println("����");
			return;
		}
		
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i + j == 2) {
					rightTop += arr[i][j];
				} 				
			}			
		}
		if(rightTop != 15) {
			System.out.println("����");
			return;
		}
		System.out.println("����");
	}
}