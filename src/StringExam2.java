/**
 * 문자열 String 클래스
 * 
 * @author smart19
 *
 */
public class StringExam2 {

	public static void main(String[] args) {

		String str = "ABC"; // 대소문자 구분함. -> 다르기 때문에 새로 메모리값 할당.
		String str2 = "abc";
		System.out.println(str == str2); // new는 무조건 다른 메모리. new 없으면 같은 주소 출력.
		System.out.println(str.equals(str2)); // 위의 문제 때문에 equals사용.
		System.out.println(str);
		System.out.println(str2);
	}

}
