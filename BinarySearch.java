// ���ֲ���
// ����ɨ����
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// ��һ������������ж��ֲ���{1,8,10,89,1000,1234}

		// ����ɨ�����
		Scanner myScanner = new Scanner(System.in);

		// ��ʼ������
		int[] arr = {1, 8, 10, 89, 1000, 1234};
		int left = 0; // ������
		int right = arr.length - 1; // �Ҳ����

		// ��ʾ����
		System.out.println("������һ������:");
		int numInput = myScanner.nextInt();
		boolean found = false;
		// �����ж�
		do {
			int mid = (right + left) / 2;
			if (numInput == arr[mid]) {
				System.out.println("�ҵ���,�±�Ϊ" + mid);
				found = true;
				break;
			} 
			else if (numInput >arr[mid]) {
				left = mid + 1; // Ŀ�����Ұ벿��
			}
			else {
				right = mid - 1; // Ŀ������벿��
			}
		} while (left <= right);
		if (!found) {
			System.out.println("û�������");
		}
		

		// �ر�ɨ����
		myScanner.close();
    }
}