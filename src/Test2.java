import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			HashSet<Integer> hs = new HashSet<Integer>(); // 중복허용 x
			while (true) {
				hs.add((int) (Math.random() * 45) + 1);
				if (hs.size() == 6) { // hs가 6개 찰때까지 반복
					break;// 반복문 탈출
				}
			}
			System.out.println(hs);
		}

	} // 2022 로또 6개 추첨

}
