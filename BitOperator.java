//��ʾλ������

//����ɨ����
import java.util.Scanner;

public class BitOperator {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		//��ʾ����
		System.out.println("�����뱻������:");
		int num1 = myScanner.nextInt();
		System.out.println("�������������ƴ���:");
		int time1 = myScanner.nextInt();
		int result1 = num1 >> time1;
		System.out.println(num1 + ">>" + time1 + "=" + result1);
		System.out.println(num1 + "/" + 2 + "=" + num1 / 2);

		// -17��ԭ�� 10010001,����11101110,����11101111
		// -17 >> 1 ����11110111,����11110110,ԭ��10001001,����-9



	}
}