// ��ϰ1 2
// 
import java.util.Scanner;
public class MethodExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// ��д��AA,��һ������:�ж�һ��������������ż��,����boolean
		// ������,��,�ַ� ��ӡ��Ӧ�������������ַ�
		AA a1 = new AA();
		int num = 311;
		if (a1.isOdd(num)) {
			System.out.println(num + "������");
		} else {
			System.out.println(num + "��ż��");
		}

		// ��ʾ����
		System.out.println("����������:");
		int cow = myScanner.nextInt();
		System.out.println("����������:");
		int col = myScanner.nextInt();
		System.out.println("������Ҫ��ӡ���ַ�:");
		char c = myScanner.next().charAt(0);

		// ��ӡ
		a1.printChar(cow, col, c);

		myScanner.close();

    }
}

class AA {
	public boolean isOdd(int n) {
		// boolean isOdd = false;
		// switch (n % 2) {
		// case 0:
		// 	isOdd = false;
		// 	break;
		// case 1:
		// 	isOdd = true;
		// 	break;
		// }
		// return isOdd;

		// ��Ԫ�����һ���㶨
		// return n % 2 != 0 ? true : false;

		// ����
		return n % 2 != 0;
	}

	public void printChar(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c + " ");
			} // ��ӡһ��
			System.out.println(); // ����
		}
	}
}