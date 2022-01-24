/**
 * 계산기 프로그램 작성. 임의의 두수를 입력받아 + - * / %를 수행하시오 출력값은 4+2 = 6
 * 
 * @author smart19
 *
 */
public class Method6 {

	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		add(i, j);// 더하기
		minus(i, j);// 빼기
		multiple(i, j); // 곱하기
		divide(i, j); // 나누기
		remainder(i, j); //  나머지

	}

	private static void remainder(int i, int j) {
		System.out.println(i + " / " + j + "의 나머지는 " + (i % j));

	}

	private static void divide(int i, int j) {
		System.out.println(i + " / " + j + " = " + (i / j));

	}

	private static void multiple(int i, int j) {
		System.out.println(i + " * " + j + " = " + (i * j));

	}

	private static void minus(int i, int j) {
		System.out.println(i + " - " + j + " = " + (i - j));

	}

	private static void add(int i, int j) {
		System.out.println(i + " + " + j + " = " + (i + j));
	}

}
