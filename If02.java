//��֧���� if-else
//˫��֧ʾ��:
//���ʵ��,���������˵�����,�������18��,�����"���ѳ���",�������"��δ����"
//
//�����ı�ɨ����
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		//����Scanner����
		Scanner scanner = new Scanner(System.in);

		//��ʾ����
		System.out.print("����������:");
		int age = scanner.nextInt();
		scanner.close();

		//if-else�ж�,��Ӧ������
		if (age >= 18) {
			System.out.println("���ѳ���");
		} else {
			System.out.println("��δ����");
		}

		System.out.println("�������...");
	}
}