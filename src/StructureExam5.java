/**
 * 성적처리프로그램
 * 
 * @author smart19
 *
 */
public class StructureExam5 {
	// 멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {

		StructureExam5 se0 = new StructureExam5();
		se0.stdName = "홍길동";
		se0.coding = 100;
		print(se0.stdName, se0.coding);

		StructureExam5 se1 = new StructureExam5();
		se1.stdName = "안명진";
		se1.coding = 90;
		print(se1.stdName, se1.coding);

		StructureExam5 se2 = new StructureExam5();
		se2.stdName = "이순신";
		se2.coding = 95;
		print(se2.stdName, se2.coding);
	}

	private static void print(String stdName, int coding) {
		System.out.println(stdName + "의 코딩성적은 " + coding + "점입니다.");

	}

}
