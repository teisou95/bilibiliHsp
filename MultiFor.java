// ����Ƕ��ѭ��
// ����ɨ����
import java.util.Scanner;

public class MultiFor {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		//��ʾ����
		System.out.println("");

		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("��" + ++count + "�����");
				System.out.println("\ti = " + i + "\tj = " + j);
			}
		}
    }
}