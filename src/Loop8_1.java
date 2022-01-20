/**
 * 
 * @author smart19
 *
 */
public class Loop8_1 {

	public static void main(String[] args) {
		int c = 0; // 전역변수 주의
		int j = 1;
		int d = 0;
		while (j < 11) {
			if (j % 2 == 0) { // toggle breakpoint(멈추는곳) -> 상단 디버그(벌레모양) 클릭.
				c = c + j; // 더 진행하면 변화한값 색 변경
			} else {
				d = d + j;
			} // 반복문내 변수 사라지는것 주의
			j++;
		}
		System.out.println(c + d);
		System.out.println(c);
		System.out.println(d);
	}
}
