// break ���Ų���
// ����ɨ����
import java.util.Scanner;

public class Break01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		for (int i = 0; i < 10; i++) {
			if (i == 3) { break; }	// break ��ǰ����ѭ�������
			System.out.println("i = " + i);
		}
		System.out.println("�˳��� for ѭ��,�������...");
	
    }
}