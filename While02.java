// ������һ����Χ�ڵ�����
// ����ɨ����
import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ˼·�ֽ�:���ȫ������/����ĳ�����ı���/�����������ı���/������
		long i = 10000000000000L;
		long end = 10000000001000L;
		while (i < end) {
			long j = 2L;
			boolean isPrime = true;
			while (j * j < i) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				j++;
			}
			if (isPrime) {
				System.out.println(i);
			}
			i++;
		}
    }
}