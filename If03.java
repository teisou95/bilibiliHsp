//��֧�������ֻ����һ��ִ�����
//���֧����û��else ,�������if��������,��ôһ��ִ����ڶ�û��
//
//����ɨ����
import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);

		//��ʾ�������÷�
		System.out.println("���������÷�(����1-100):");
		int tennsu = scan.nextInt();

		//����������ݽ��з�Χ����Ч�ж�1-100,������ʾ�������
		if (tennsu >=1 && tennsu <= 100) {
			//�жϷ������䲢�����Ϣ
			if (tennsu == 100) {
				System.out.println("���ü���");
			}
			else if (tennsu > 80 && tennsu <= 99) {
				System.out.println("��������");
			}
			else if (tennsu >= 60 && tennsu <= 80) {
				System.out.println("����һ��");
			}
			else {
				System.out.println("���ò�����");
			}
		}
		else {
			System.out.println("�������ݲ���1-100��Χ,����������:");
		}


	}
}