// ��������
// ����ɨ����
import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner myScanner = new Scanner(System.in);

		/*
			��ʼ��һ������{1,2,3,4,5},���Խ��������������,��ʾ�û��Ƿ��������,
			ÿ����������Ǹ�Ԫ��,��ֻʣ�����һ��Ԫ��ʱ,��ʾ����������
		 */
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("======ԭʼ������=====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		do {
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arrNew.length; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			System.out.println("\n==========�������������=========");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			if (arr.length == 1) {
				System.out.println("\n�����ʣ���һ��Ԫ��,����������.");
				break;
			}

			System.out.println("\n�Ƿ��������(y/n):");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				break;
			}
		} while (true);

		System.out.println("�˳���������...");

		// �ر�ɨ����
		myScanner.close();
    }
}