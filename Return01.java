// return ʹ���ڷ���,��ʾ�������ڵķ���
// ע��:��� return д�� main ����,���˳�����
// ����ɨ����
import java.util.Scanner;

public class Return01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("i = " + i);
				// return; // ����main ����
				// continue; // ��������ѭ��,��ʼ��һ��ѭ��
				break; // ����ѭ��
			}
			System.out.println("Hello" + i);
		}
		System.out.println("go on...");

		// �ر�ɨ����
		scanner.close();
    }
}