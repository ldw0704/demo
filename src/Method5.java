
public class Method5 {

	public static void aaa(int i) {
		System.out.println("aaa()함수가 호출되었습니다." + (++i));
		return;
	}

//static은 static이다 (메인이 static이면)
	private static int bbb(int i) { //리턴값 타입에 따라 void를 해당 변수타입으로 바꿔준다. void =리턴되는 값이 없다.
		i += 1;
		i = i + 1;
		i++;
		return i; //해당값을 돌려준다
	}

	public static void main(String[] args) {
		int i = 24;
		 i = bbb(i); // 리턴된 값을 대입해주어야한다.
		 // 밑에 빨간줄 create method 로 만들수 잇음.
		System.out.println(i);
	}

}
