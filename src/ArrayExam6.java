
public class ArrayExam6 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		System.out.println(arr[1].length); // 다차원배열시 배열길이는 행개수, 특정 행의 길이는 열의 길이가 뜬다
		for (int i = 0; i < arr.length; i++) {// 배열반복은 배열길이를 활용하자!
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
