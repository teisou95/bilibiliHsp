// ��ҵ4
// ����ɨ����
import java.util.Scanner;

public class HomeworkP014704 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// �ж�һ�������Ƿ���ˮ�ɻ���,ˮ�ɻ�����ָһ��3λ��,�����λ�����ֵ������͵����䱾��
		// ���� 153 = 1*1*1 + 5*5*5 + 3*3*3

		// ��ʾ����
		System.out.println("������һ��3λ������:");
		int num = scanner.nextInt();
		int num1 = num / 100; // ȡ����λ��
		int num2 = (num % 100) /10; // ȡ��ʮλ��
		int num3 = num % 10; // ȡ����λ��
		// ����������
		int sumOfCubes = (int)(Math.pow(num1,3) + Math.pow(num2,3) + Math.pow(num3,3));

		// �ж������Ƿ����
		if (num == sumOfCubes) {
			System.out.println(num + "��ˮ�ɻ���");
		} else {
			System.out.println(num + "����ˮ�ɻ���");
		}

		// Ѱ��ȫ����ˮ�ɻ���
		for (int i = 100; i < 1000; i++) {
			num1 = i / 100; // ȡ����λ��
			num2 = (i % 100) /10; // ȡ��ʮλ��
			num3 = i % 10; // ȡ����λ��
			// ����������
			sumOfCubes = (int)(Math.pow(num1,3) + Math.pow(num2,3) + Math.pow(num3,3));

			// �ж������Ƿ����
			if (i == sumOfCubes) {
				System.out.println(i + "��ˮ�ɻ���");
			} 
		}


		// �ر�ɨ����
		scanner.close();
    }
}