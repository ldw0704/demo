
public class Variable6 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		// start
		int c = i;
		i = j;
		j = c;
		// end
		/* i값은 20, j 값은 10 */
		System.out.println("i값은" + i);
		System.out.println("j값은" + j);

	}
}