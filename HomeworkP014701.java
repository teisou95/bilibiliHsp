// ��ҵ1
// ����ɨ����
import java.util.Scanner;

public class HomeworkP014701 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ĳ����100,000Ԫ,ÿ����һ��·��,��Ҫ�ɷ�,��������:
		// (1) ���ֽ� > 50,000Ԫʱ,ÿ�ν�5%
		// (2) ���ֽ� <= 50,000Ԫʱ,ÿ�ν�1000
		// ������˿��Ծ������ٴ�·��,ʹ�� while break ʵ��

		// ��ʾ����
		System.out.println("�����뵱ǰ�ֽ���:");
		double balance = scanner.nextDouble();

		// ���������
		int count  = 0;
		while (balance > 0) {
			if (balance > 50000) {
				balance *= 0.95;
				count++;
			} else if (balance >= 1000) {
				balance -=1000;
				count++;
			} else {
				break; // ����,ֱ���˳�ѭ��
			}
			System.out.print("��ͨ��" + count + "��·��");
			System.out.println("\t��ǰ���Ϊ" + balance);
		}
		System.out.println("����ͨ��" + count + "��·��");

		// �ر�ɨ����
		scanner.close();
    }
}