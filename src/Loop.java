/**
 * for문 1부터 10까지 출력
 * 
 * @author smart19
 *
 */
public class Loop {

	public static void main(String[] args) {
//for 초기값, 조건문, 증감식 수행문 >이후 조건문부터 수행문 반복후 false시 탈출
		// 증감식 미기입시 무한반복(증감식이 없기때문에 증감이 안일어남)
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		} // i가 0부터 시작하는건 배열관련 그리고 조건문횟수도 직관적이게 된다.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
