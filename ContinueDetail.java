// 
// ����ɨ����
import java.util.Scanner;

public class ContinueDetail {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		label1:
		for (int j = 0; j < 4; j++) {
			label2:
			for (int i = 0; i < 10; i++) {
				if (i == 2) {
					// continue; // ��ͬ��continue label2;
					continue label1; // ����label1 ������һ��ѭ��
				}
				System.out.println("i = " + i);
			}
		}

		// �ر�ɨ����
		scanner.close();
    }
}