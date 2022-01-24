/**
 * 문자열 String 클래스
 * 
 * @author smart19
 *
 */
public class StringExam {

	public static void main(String[] args) {
//원래 참조형은 new가 필요함. 안쓸수도 있음.	""사용.
//new가 없으면 새로 만들지않고 기존에 있는 문자열을 가리키게 된다.
//문자열 + 문자열은 새로운 문자열+문자열을 만들게 된다. 기존의 문자열에 추가하는 개념이 아님.
//		 StringBuilder 비동기
//		StringBuffer 동기 - 메소드 관련 ex)StringBuffer sb =null; 문법은 String과 같음. append등 사용
		// 긴문장. 미리 공간을 마련해두고 그곳에 문자열을 입력함.
		String str = new String("abc");
		String str2 = new String("abc");
		System.out.println(str == str2); // 주소가 다르기 때문에 false, 참조클래스는 논리연산자 '==' 사용하지않는다.
		System.out.println(str.equals(str2)); //equal 함수, 문자 하나하나 비교한후 t/f출
		System.out.println(str);
		System.out.println(str2);
	}

}
