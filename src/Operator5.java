
public class Operator5 {

	public static void main(String[] args) {
		// 대입연산자 =, +=, -=, *=, /=, %=
		int x = 1, y = 2, z = 0;
		x += y; // x = x + y; 좌항 우항에 같은 변수가 사용될때
		x -= y; // x = x - y;
		x *= y; // x = x * y;
		x /= y; // x = x / y;
		System.out.println(x);
		// 삼항연산자 = (조건문)? 참 : 거짓;
		// 시험성적 60미만 재시험, 아니면 패스
		int score = 100;
		String str = (score < 60) ? "재시험" : "패스";
		System.out.println(str);
	}

}
