// �ö�ά���� ��ӡ�������
// 
public class YangHui {
	public static void main(String[] args) {
		/*
			�������
			1
			1	1
			1	2	1
			1	3	3	1
			1	4	6 	4 	1
			1	5	10	10	5	1
			...

			00
			10	11
			20	21	22
			30	31	32	33
			40	41	42	43	44
			50	51	52	53	54	55
			...
		 */
		// �����ά����,������ȷ��
		int[][] arr = new int[10][];

		// // ������ά����,���ռ�,��ʼ��ǰ������
		// for (int i = 0; i < arr.length; i++) {
		// 	arr[i] = new int[i+1];
		// 	arr[i][0] = 1;
		// 	arr[i][i] = 1;
		// }

		// // ��������,�����ɸ�ֵ
		// for (int i = 2; i < arr.length; i++) {
		// 	for (int j = 1; j < arr[i].length - 1; j++) {
		// 		arr[i][j] = arr[i-1][j-1] + arr[i-1][j]; 
		// 	}
		// }

		// Ƕ��ʹ��for if,һ�θ㶨��ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}

		// �������� ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

    }
}