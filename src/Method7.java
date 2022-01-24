/**
 * 계산기 프로그램 작성. 임의의 두수를 입력받아 + - * / %를 수행하시오 출력값은 4+2 = 6
 * 
 * @author smart19
 *
 */
public class Method7 { // 함수안에 함수 정의 불가 / 자바는 함수위치 메인기준 위아래 문제없음. c언어는 무조건 메인함수위에 함수위치.

	public static void main(String[] args) {
		int i = 7;
		int j = 2;
		int res = 0;
		double res2 = 0.;

		res = add(i, j);
		System.out.println(i + " + " + j + " = " + res);

		res = minus(i, j);
		System.out.println(i + " - " + j + " = " + res);

		res = multiple(i, j);
		System.out.println(i + " * " + j + " = " + res);

		res2 = divide(i, j);
		System.out.println(i + " / " + j + " = " + res2);

		res = remainder(i, j);
		System.out.println(i + " / " + j + " 의 나머지는 " + res);

	}

//private : 자바안에서만 접근가능.
	private static int remainder(int i, int j) {
		return i % j;
//		System.out.println(i + " / " + j + "의 나머지는 " + (i % j));

	}

	private static double divide(int i, int j) {
		return (double) i / j;
//		System.out.println(i + " / " + j + " = " + (i / j));

	}

	private static int multiple(int i, int j) {
		return i * j;
//		System.out.println(i + " * " + j + " = " + (i * j));

	}

	private static int minus(int i, int j) {
		return i - j;
//		System.out.println(i + " - " + j + " = " + (i - j));

	}

	private static int add(int i, int j) {
		return i + j;
//		System.out.println(i + " + " + j + " = " + (i + j));
	}

}
