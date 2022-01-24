
public class Operator2 {

	public static void main(String[] args) {
		// 산술연산자 + - * / %(나머지값)
		double i = 10;
		int j = 3;

		System.out.printf("%f + %d = %2.2f", i, j, i + j); // %x.x - x는 자리수, %수만큼 인자수 필요
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.printf("%.12f", i / j); // n자리수 지정, 0 자리수지정시 남는 왼쪽에 0출력, - 왼쪽 빈칸 공백, m소수점 아래 자리수 지정
		System.out.println(i % j);
	}

}
