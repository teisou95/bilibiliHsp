//Ӧ�ð���
//�μӸ��ֱ���,��������ɼ�����8.0�������,������ʾ��̭.
//�����Ա���ʾ�����������Ů����
//����ɼ����Ա�,�����жϺ������Ϣ

//����ɨ����
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);

		//��ʾ����
		System.out.println("������ɼ�:");
		double score = scan.nextDouble();

		System.out.println("�������Ա�:");
		// String gender = scan.next();
		// char genderChar = gender.charAt(0);
		char genderChar = scan.next().charAt(0);//һ��д��

		//�жϳɼ��Ƿ����8.0
		if (score > 8.0) {
			System.out.print("�������:");
			//�ж��Ա�����
			if (genderChar == '��') {
				System.out.println("������");
			}
			else if (genderChar == 'Ů') {
				System.out.println("Ů����");
			}
			else {
				System.out.println("�Ա��������");
			}
		}
		else {
			System.out.println("δ�������");
		}

		scan.close();
	}
}