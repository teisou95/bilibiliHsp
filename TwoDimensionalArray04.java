// ��ά���� ����
// 
import java.util.Scanner;

public class TwoDimensionalArray04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// ������ά�������
		int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}}; // ��̬��ʼ��
		int sum = 0;

		// �������
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println("sum = " + sum);

		myScanner.close();
    }
}