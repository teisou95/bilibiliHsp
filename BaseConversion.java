//����ת��

//�����ı�ɨ����
import java.util.Scanner;

public class BaseConversion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		//��λ����������ת��Ϊʮ��������
		//��ʾ������λ���Ķ���������
		System.out.println("������һ����λ���Ķ���������(��������������)");
		System.out.println("�������һ������:");
		int num1 = myScanner.nextInt();

		System.out.println("������ڶ�������:");
		int num2 = myScanner.nextInt();

		System.out.println("���������������:");
		int num3 = myScanner.nextInt();

		System.out.println("��������ĸ�����:");
		int num4 = myScanner.nextInt();

		myScanner.close();

		//����ת��Ϊʮ��������
		int result = num4 * 1 + num3 * 2 + num2 * 4 + num1 * 8;

		//�����Ӧʮ��������
		System.out.println("�����������λ������������" 
			+ num1 + num2 + num3 + num4 + "ת��Ϊʮ����������" + result); 

	}
}