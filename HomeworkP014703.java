// ��ҵ3
// ����ɨ����
import java.util.Scanner;

public class HomeworkP014703 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// �ж�һ������Ƿ�Ϊ����
		// ����ı�׼:
		// (1)�����4�ı���,�Ҳ���100�ı���(��ͨ����)
		// (2)�������100�ı���,��ͬʱ��400�ı���(��������)

		// ��ʾ����
		System.out.println("���������:");
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
			System.out.println(year + "��������");
		} else {
			System.out.println(year + "�겻������");
		}

		// �ر�ɨ����
		scanner.close();
    }
}