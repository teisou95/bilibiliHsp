//��֧���� if-else
//����֧ʾ��:
//���ʵ��,���������˵�����,�������18��,�����"���ѳ���"
//
//�����ı�ɨ����
import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		//����Scanner����
		Scanner scanner = new Scanner(System.in);

		//��ʾ�û���������,��������
		System.out.print("����������(����):");
		int age = scanner.nextInt();
		scanner.close();

		//�ж������Ƿ����18��,�����Ӧ���
		if (age >= 18) {
			System.out.println("���ѳ���");
		} 

		System.out.println("�������...");
	}
}