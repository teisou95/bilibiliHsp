//��Ʊϵͳ:���ݵ��������·ݺ�����,��ӡƱ��
//
//����ɨ����
import java.util.Scanner;

public class HomeworkIf {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);

		//��ʾ����
		System.out.println("�������·�(1-12):");
		int gatsu = scan.nextInt();
		System.out.println("����������(����):");
		int age = scan.nextInt();

		//�жϲ������Ϣ
		if (gatsu >3 && gatsu < 11) {
			System.out.print("����");
			if (age >17 && age <61) {
				System.out.println("����Ʊ��60Ԫ");
			}else if (age >60) {
				System.out.println("����Ʊ��20Ԫ");
			}else if (age < 18) {
				System.out.println("��ͯƱ��30Ԫ");
			}
		}else {
			System.out.print("����");
			if (age >17 && age <61) {
				System.out.println("����Ʊ��40Ԫ");
			}else {
				System.out.println("��ͯ������Ʊ��20Ԫ");
			}
		}
	}
}