import java.util.Iterator;

/**
 * n*n ������
 * 
 * @author smart19
 *
 */
public class ArrayExam9 {

	public static void main(String[] args) {
		int cube = 3; // n*n ������
		int sum = 0; //������ �� ��
		int chkNum = 0; // �� / n��
		for(int i = 0; i <= cube*cube;i++) {
			sum+=i;
		}
		chkNum = sum/cube;
		
		int[][] arr = { 
				{ 2,7,6 },
				{ 9,5,1},
				{ 4,3,8}
				}; 
		// �������迭 ��������ÿ� �� �ִ� ����.
		//n*n�ึ���� �� : n^2*(n^2+1)/2, ���밢�� ��ǥi,j���� : n-1, ������ : �� / n, n�� Ȧ��
		int rowCntChk = 0; //���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (sum)) {
			System.out.println("����");
			return;
		}
		
		int colCntChk = 0;//���ΰ� üũ
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // ��ǥ �ٲ�
			}			
		}
		if(colCntChk != (sum)) {
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
		if(leftTop != chkNum) {
			System.out.println("����");
			return;
		}
		
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i + j == cube - 1) {
					rightTop += arr[i][j];
				} 				
			}			
		}
		if(rightTop != chkNum) {
			System.out.println("����");
			return;
		}
		System.out.println("����");
	}
}