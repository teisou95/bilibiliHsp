// 
// ����ɨ����
import java.util.Scanner;

public class Continue01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		int i = 1;
		while (i <= 4) {
			i++;
			if (i == 2) {
				continue; // continue������ǰѭ��,ֱ�ӿ�ʼ��һ��ѭ��
			}
			System.out.println("i = " + i);
		}

		// �ر�ɨ����
		scanner.close();
    }
}