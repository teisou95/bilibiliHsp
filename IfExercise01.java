// ����֧��˫��֧��ϰ
// 
// ����ɨ����
import java.util.Scanner;

public class IfExercise01 {
	public static void main(String[] args) {
		// ���� Scanner ����
		Scanner scanner = new Scanner(System.in);


		// ��ϰ1
		System.out.println("��ϰ1:");
		int x = 7;
		int y = 4;
		if (x > 5) {
			if (y > 5) {
				System.out.println("x > 5 �� y > 5");
			}
			System.out.println("x > 5");
		} else {
			System.out.println("x < 5");
		}
		// �����������"x > 5"


		// ��ϰ2
		System.out.println("\n��ϰ2:");
		// ��д����,����2��double���ͱ���
		// �жϵ�һ��������10.0,�ҵڶ�����С��20.0,��ӡ����֮��
		System.out.print("�������һ����:");
		double d1 = scanner.nextDouble();
		System.out.print("������ڶ�����:");
		double d2 = scanner.nextDouble();

		// if (d1 > 10.0) {
		// 	if (d2 < 20.0) {
		// 		System.out.println("��������,����֮����:" + (d1 + d2));
		// 	}
		// } else {
		// 	System.out.println("����������");	
		// }

		// ����ifǶ��,�����߼��жϸ���
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println("��������,����֮����:" + (d1 + d2));
		} else {
			System.out.println("����������");
		}


		// ��ϰ3
		System.out.println("\n��ϰ3:");
		// ������������int,�ж϶��ߵĺ�,�Ƿ��ܱ�3���ܱ�5����,��ӡ��ʾ��Ϣ
		System.out.print("�������һ������:");
		int num1 = scanner.nextInt();
		System.out.print("������ڶ�������:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;

		// if (sum % 3 == 0) {
		// 	if (sum % 5 == 0) {
		// 		System.out.println("����֮����ͬʱ��3��5����");
		// 	}
		// } else {
		// 	System.out.println("����������");
		// }

		//����ifǶ��,�����߼��жϸ���
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("����֮����ͬʱ��3��5����");
		} else {
			System.out.println("����������");
		}


		// ��ϰ4
		System.out.println("\n��ϰ4");
		// �ж�һ������Ƿ�������,����������Ƿ����������֮һ:
		// (1)����ܱ�4����,�����ܱ�100����
		// (2)�ܱ�400����
		System.out.print("������һ�����(����):");
		int year = scanner.nextInt();

		// if (year % 4 == 0) {
		// 	if (year % 100 != 0) {
		// 		System.out.println("������");
		// 	} else if (year % 400 == 0) {
		// 		System.out.println("������");
		// 	} else {
		// 		System.out.println("��������");
		// 	}
		// } else {
		// 	System.out.println("��������");
		// }

		// ����if Ƕ��,�����߼��жϸ���
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "��������");
		} else {
			System.out.println(year + "�겻������");
		}
	}
}