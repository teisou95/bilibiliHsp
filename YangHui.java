// 用二维数组 打印杨辉三角
// 
public class YangHui {
	public static void main(String[] args) {
		/*
			杨辉三角
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
		// 定义二维数组,列数不确定
		int[][] arr = new int[10][];

		// // 遍历二维数组,开空间,初始化前后数据
		// for (int i = 0; i < arr.length; i++) {
		// 	arr[i] = new int[i+1];
		// 	arr[i][0] = 1;
		// 	arr[i][i] = 1;
		// }

		// // 遍历数组,按规律赋值
		// for (int i = 2; i < arr.length; i++) {
		// 	for (int j = 1; j < arr[i].length - 1; j++) {
		// 		arr[i][j] = arr[i-1][j-1] + arr[i-1][j]; 
		// 	}
		// }

		// 嵌套使用for if,一次搞定赋值
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

		// 遍历数组 输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

    }
}