// ��ҵ2
// ����ɨ����
import java.util.Scanner;

public class HomeworkP014702 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ʵ���ж�һ���������ĸ���Χ:����0 С��0 ����0 

		// ��ʾ����
		System.out.println("������һ����:");
		double num = scanner.nextDouble();
		if (num > 0) {
			System.out.println(num + "����0");
		} else if (num < 0) {
			System.out.println(num + "С��0");
		} else {
			System.out.println(num + "����0");
		}

		// �ر�ɨ����
		scanner.close();
    }
}