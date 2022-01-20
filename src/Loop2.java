/**
 * for문 1부터 10 합의 계산과정 출력 합을 출력하시오
 * 
 * @author smart19
 *
 */
public class Loop2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
//			System.out.println(sum);
		} // 내부는 계속 초기화됨 변수 함부러 넣지않도록 주의
		System.out.println(sum);
	}

}
