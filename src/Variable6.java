
public class Variable6 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		// start
		int c = i;
		i = j;
		j = c;
		// end
		/* i���� 20, j ���� 10 */
		System.out.println("i����" + i);
		System.out.println("j����" + j);

	}
}