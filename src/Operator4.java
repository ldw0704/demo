
public class Operator4 {

	public static void main(String[] args) {
		// 증감 ++, --
		int i = 0;
		// i++;, --i;
		System.out.println(++i); // 출력시 처리순서 차이
		// 부정 !
		boolean b = false;
		System.out.println(!b);
		// 비교 >, >=, <, <=, ==, != 결과는 boolean
		int m = 10, n = 5;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println(m != n);
		// 논리 and[&&], or[||], not[!], xor(무조건 둘중하나만 참이어야함)
		System.out.println("----------------");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("----------------");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("----------------");
		System.out.println(!false);
		System.out.println(!true);
		// 비트연산자 &, |, ^(xor), ~(not), <<, >>, >>>, 8자리
		byte bitNum1 = 15;
		byte bitNum2 = 20;
		System.out.println(bitNum1 & bitNum2); // 2진수로 변경후 비교함 2의 제곱만 1,1로 일치. 그 자리수를 다 더한값을 출력 4
		System.out.println(bitNum1 | bitNum2); // 모든 자리수가 1이므로 합은 31
		System.out.println(~bitNum2); // 부호까지 바뀜, 보수개념 0 -127 <-> -1 - -128
		System.out.println(bitNum2 << 1);
		System.out.println(bitNum2 >> 1);
		System.out.println(bitNum2 >>> 1); // 반대는 없음, 부호 없다고 판단.음수안씀
		System.out.println(bitNum1 ^ bitNum2);
	}

}