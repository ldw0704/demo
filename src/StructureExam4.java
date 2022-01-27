/**
 * 성적처리프로그램
 * 
 * @author smart19
 *
 */
public class StructureExam4 {
	// 멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {
		// int [] coding = new int[3];
		StructureExam4[] se = new StructureExam4[3]; // 단순배열

		StructureExam4 se0 = new StructureExam4(); // 구조체 - 자료타입에 상관없이 다 넣을수잇음
		se0.stdName = "홍길동";
		se0.coding = 100;
		se[0] = se0;

		StructureExam4 se1 = new StructureExam4();
		se1.stdName = "안명진";
		se1.coding = 90;
		se[1] = se1;

		StructureExam4 se2 = new StructureExam4();
		se2.stdName = "이순신";
		se2.coding = 95;
		se[2] = se2;
		System.out.println(se[0].stdName + "의 코딩성적은 " + se[0].coding + "점입니다.");
		System.out.println(se[1].stdName + "의 코딩성적은 " + se[1].coding + "점입니다.");
		System.out.println(se[2].stdName + "의 코딩성적은 " + se[2].coding + "점입니다.");
	}

}
