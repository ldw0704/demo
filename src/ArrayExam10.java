
public class ArrayExam10 {

	public static void main(String[] args) {

		int[] i = new int[2];
		int[] j = null;
		j = i; // j 도 i가 만든 배열주소를 따라간다, 같은 배열주소를 가진다.
		i[0] = 1;
		j[0] = 2; //j도 i가 만든 배열에 관여할수 잇음.
		i = null; // 기존주소 지우고 null 입력
		System.gc(); // 쓰레기값(null)을 처리한다.
//		System.out.println(i[0]);
		System.out.println(j[0]);
	}
}