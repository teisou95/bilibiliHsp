// ��ά����,һά�����ÿ��Ԫ��Ҳ��һ������
// 
public class TwoDimensionalArray01 {
	public static void main(String[] args) {

		// �ö�ά�������ͼ��
		// int[][] ��ʾ��άint ����
		// ���:ԭ��һά�����ÿ��Ԫ����һά����,���ɶ�ά����

		int[][] arr = {	{0, 0, 0, 0, 0, 0},
						{0, 0, 1, 0, 0, 0},
						{0, 2, 0, 3, 0, 0},
						{0, 0, 0, 0, 0, 0}	};

		// arr[i] ��ʾ��ά����ĵ� i + 1 ��Ԫ��
		// arr[i][j]��ʾ��ά����ĵ� i + 1 ��Ԫ��(һά����)�ĵ� j + 1 ��Ԫ��
		for (int i = 0; i < arr.length; i++) { // ������ά�����ÿ��Ԫ��
			for (int j = 0; j < arr[i].length; j++) { //������Ӧ��һά����
				System.out.print(arr[i][j] + " "); // ���һά����
			} 
			System.out.println();
		}
    }
}