/**
 * 성적처리프로그램
 * 
 * @author smart19
 *
 */
public class StructureExam6 {
	// 멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {

		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 100;
		print(se0);

		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "안명진";
		se1.coding = 90;
		print(se1);

		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "이순신";
		se2.coding = 95;
		print(se2);
	}

	private static void print(StructureExam6 se) { // 구조체타입과 구조체명이 파라미터로.
		System.out.println(se.stdName + "의 코딩성적은 " + se.coding + "점입니다.");

	}

}
