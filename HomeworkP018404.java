// ��ҵ4
// 
import java.util.Scanner;

public class HomeworkP018404 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// ��֪һ�����������,Ҫ�����һ��Ԫ�غ�,��������Ȼ������
		// ����:{10,12,45,90},���23��,����Ϊ{10,12,23,45,90}

		int[] arr = {10, 12, 45, 90};
		while (true) {
			System.out.println("������Ҫ��ӵ�����:");
			int numAdd = myScanner.nextInt();
			int numIndexLeft = -1;

			// ���ж�,�����
			// �ж����������������������е�λ��
			for (int i = 0; i < arr.length; i++) {
				if (numAdd > arr[i]) {
					numIndexLeft = i; // �����������Ԫ������
				}
			}

			// ���������鸳ֵ
			int[] newArr = new int[arr.length + 1];
			// for (int i = 0; i < newArr.length; i++) {
			// 	if (i <= numIndexLeft) {
			// 		newArr[i] = arr[i];
			// 	} else if (i == numIndexLeft + 1) {
			// 		newArr[i] = numAdd;
			// 	} else {
			// 		newArr[i] = arr[i - 1];
			// 	}
			// }

			// ʹ��˫ָ��ѭ����������λ��
			// i ���ڱ��� newArr ,j ���ڱ��� arr
			for (int i = 0, j = 0; i < newArr.length; i++) {
				if (i != (numIndexLeft + 1)) {
					newArr[i] = arr[j];
					j++;
				} else { // �������λ�ú�,j++����һ��,����j = i- 1
					newArr[i] = numAdd;
				}
			}

			// ����ԭ���鲢��ӡ
			arr = newArr;
			System.out.println("=====���º��������������=====");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			// �������
			System.out.println("\n�Ƿ�������Ԫ��(y/n):");
			char key = myScanner.next().charAt(0);
			if (key != 'y') {
				break;
			}
		}

		myScanner.close();
    }
}