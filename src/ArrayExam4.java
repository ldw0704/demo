/**
 * ������, ����, ��� ����ó�����α׷��� �ۼ��Ͻÿ�
 * 
 * @author smart19
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;

		kor = 50;
		eng = 70;
		math = 85;
		total = kor + eng + math;
		avg = total / 3;
		System.out.printf("����: %d, ����: %d, ����:%d", kor, eng, math);
		System.out.printf("����: %d, ���: %d", total, avg);
	}

}