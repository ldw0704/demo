
public class Variable2 {

	public static void main(String[] args) {
		byte b = 127;// 1byte
		short s = 1;// 2byte
		int i = 10;// 4byte
		long l = 10l;// int와 구분하기위해 L기입, 8byte
		double d = 10.0;
		double d2 = 0.0;// 소수점 꼭 찍어야함. -> 0., .0, 8byte 정수를 입력해도 사용가능(작은데서 큰데는 문제없기때문)
		char c = 'A';// 아스키코드, 자바는 한글도 가능
		float f = .0f;// double과 구분하기위해 F기입함. 4byte
		boolean sw = true;
		boolean sw2 = false;
		System.out.println("글\t자");// 탭만큼 띄우기
		System.out.println("글\n자");// 줄바꿈
		System.out.println("글\"자");// '"'넣기
		System.out.println("글\\자");// '/' 넣기
	}

}
