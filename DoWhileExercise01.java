// ����ɨ����
import java.util.Scanner;

public class DoWhileExercise01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ϰ1:��ӡ1-10
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 100);

		// ��ϰ2:��ӡ1-100�ĺ�
		int j = 1;
		int sum = 0;
		do {
			sum += j;
			j++;
		} while (j <= 100);
		System.out.println("sum = " + sum);

		// ��ϰ3:ͳ��1-200֮���ܱ�5���������ܱ�3���������ĸ���
		int k = 1;
		int count = 0;
		do {
			if (k % 5 == 0 && k % 3 !=0) {
				count++;
			}
			k++;
		} while (k <= 200);
		System.out.println("count = " + count);
    }
}