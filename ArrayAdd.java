// �������/��������
// ʵ�ֶ�̬�ĸ��������Ԫ�ص�Ч��,ʵ�ֶ���������
// 
import java.util.Scanner;
public class ArrayAdd {
	public static void main(String[] args) {
		/*
			ԭʼ����ʹ�þ�̬����
			���ӵ�Ԫ��,ֱ�ӷ�����������
			�û�����ȷ���Ƿ�������
		 */
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2 ,3};
		char c1 = 'y';
		while (true) {
			System.out.println("�Ƿ����Ԫ��:y/n");
			c1 = myScanner.nextLine().charAt(0); 
			// �������ֱ�ӻس����ᱨ��
			// ���ַ���������charAt(0)
			if (c1 != 'y') {
				break;
			}
			int[] arrNew = new int[arr.length + 1];
			System.out.println("������Ҫ��ӵ�Ԫ��(����):");
			arrNew[arrNew.length - 1] = myScanner.nextInt();
			// �˴���Ҫ���ĵ�����Ļ��з�
			myScanner.nextLine();
			for (int i = 0; i < arrNew.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
		} 
		System.out.print("���յ�arr = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}