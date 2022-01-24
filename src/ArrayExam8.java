/**
 * 5*5 마방진
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
				{ 17, 24, 1, 8, 15}// 배열의 크기가 행마다 달라도 됨
				}; // 다차원배열 선언과동시에 값 주는 형식.
		
		int rowCntChk = 0; //가로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
			}						
		}
		if(rowCntChk != (65*5)) {
			System.out.println("오답");
			return;
		}
		
		int colCntChk = 0;//세로값 체크
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i]; // 좌표 바꿈
			}			
		}
		if(colCntChk != (65*5)) {
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
		if(leftTop != 65) {
			System.out.println("오답");
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
			System.out.println("오답");
			return;
		}
		System.out.println("정답");
	}
}