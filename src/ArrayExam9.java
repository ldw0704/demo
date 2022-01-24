import java.util.Iterator;

/**
 * n*n 마방진
 * 
 * @author smart19
 *
 */
public class ArrayExam9 {

	public static void main(String[] args) {
		int cube = 3; // n*n 마방진
		int sum = 0; //마방진 내 값
		int chkNum = 0; // 값 / n행
		for(int i = 0; i <= cube*cube;i++) {
			sum+=i;
		}
		chkNum = sum/cube;
		
		int[][] arr = { 
				{ 2,7,6 },
				{ 9,5,1},
				{ 4,3,8}
				}; 
		// 다차원배열 선언과동시에 값 주는 형식.
		//n*n행마방진 합 : n^2*(n^2+1)/2, 역대각선 좌표i,j의합 : n-1, 열의합 : 합 / n, n은 홀수
		int rowCntChk = 0; //가로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (sum)) {
			System.out.println("오답");
			return;
		}
		
		int colCntChk = 0;//세로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // 좌표 바꿈
			}			
		}
		if(colCntChk != (sum)) {
			System.out.println("오답");
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
			System.out.println("오답");
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
			System.out.println("오답");
			return;
		}
		System.out.println("정답");
	}
}