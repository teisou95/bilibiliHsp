// ��ά�����ʹ��
// ��ά���������ջ,ָ��һ��λ�ڶѵĵ�ַ,��ַ�ռ���ȫ��һά����ĵ�ַ
// 	����ÿ��һά����ĵ�ַָ���������
// 	��˫������
import java.util.Scanner;

public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// ��̬��ʼ����ά����
		int[][] arr = new int[2][3]; // ����2��һά����,ÿ��һά������3��Ԫ��

		arr[1][1] = 8;
		// ���� arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		myScanner.close();
    }
}