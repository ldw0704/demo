import java.util.Scanner;

/**
 * 국영수, 총합, 평균 성적처리프로그램을 작성하시오
 * 
 * @author smart19
 *
 */
public class ArrayExam5 {
// 배열은 생성후 길이 조절불가 같은타입만 저장가능
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //검색가능하게하는 클래스.
		
		int[] grade = new int[5];
		System.out.println(grade.length); // 참조형은 . 뒤에 각종 명령어존재 length 길이
		System.out.println("국어성적입력");
		grade[0] = scan.nextInt();
		System.out.println("영어성적입력");
		grade[1] = scan.nextInt();
		System.out.println("수학성적입력");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("국어: %d, 영어: %d, 수학:%d ", grade[0], grade[1],grade[2]);
		System.out.printf("총점: %d, 평균: %d", grade[3], grade[4]); // 변수개수를 줄일수 있다.
	}

}
