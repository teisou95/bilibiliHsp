// ��ά���鶯̬��ʼ�� - ������ȷ��
// ���������һά�����Ԫ���������Բ���ȫ��ͬ
import java.util.Scanner;

public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[][] arr = new int[8][]; // ������ȷ��
		// arr[0] = new int[] {1};
		// arr[1] = new int[] {2, 2};
		// arr[2] = new int[] {3, 3, 3};

		// ���� arr ��ÿ��һά���鿪�ռ�,����ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}


		// ���� arr ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		myScanner.close();
    }
}