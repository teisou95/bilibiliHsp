//����ɨ����
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);

		//��ʾ����,�����ַ�
		System.out.println("��������ĸa-g:");
		char charInput = scan.next().charAt(0);

		//ƥ�����
		switch (charInput) {
			case 'a':
				System.out.println("����һ");
				break;
			case 'b':
				System.out.println("���ڶ�");
				break;		
			case 'c':
				System.out.println("������");
				break;		
			case 'd':
				System.out.println("������");
				break;		
			case 'e':
				System.out.println("������");
				break;		
			case 'f':
				System.out.println("������");
				break;		
			case 'g':
				System.out.println("������");
				break;
			default:
				System.out.println("�޷�ƥ��");
				break;
		}

		System.out.println("�˳���switch,�������...");
	}
}