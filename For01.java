// ѭ������
// ����ɨ����
//
import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scan = new Scanner(System.in);

		// ��ʾ����
		System.out.println("��������Ҫѭ���Ĵ���");
		int num = scan.nextInt();

		// for ѭ��,һֱִ�е�ѭ�������ж�Ϊ��,����ѭ��,�������
		for ( int i = 0; i < num; i++) {
			System.out.println("���" + i);
		}
	}
}