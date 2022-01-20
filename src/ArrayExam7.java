/**
 * 3*3 마방진
 * 
 * @author smart19
 *
 */
public class ArrayExam7 {

	public static void main(String[] args) {
		; // 다차원배열 선언과동시에 값 주는 형식.
		// 배열의 크기가 행마다 달라도 됨
		int[][] arr = { 
				{ 2,7,6 },
				{  9,5,1},
				{  4,3,8}
				
				};
		int rowCntChk = 0; //가로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (15*3)) {
			System.out.println("오답");
			return;
		}
		
		int colCntChk = 0;//세로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // 좌표 바꿈
			}			
		}
		if(colCntChk != (15*3)) {
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
		if(leftTop != 15) {
			System.out.println("오답");
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
			System.out.println("오답");
			return;
		}
		System.out.println("정답");
	}
}