// 二维数组,一维数组的每个元素也是一个数组
// 
public class TwoDimensionalArray01 {
	public static void main(String[] args) {

		// 用二维数组输出图形
		// int[][] 表示二维int 数组
		// 理解:原本一维数组的每个元素是一维数组,构成二维数组

		int[][] arr = {	{0, 0, 0, 0, 0, 0},
						{0, 0, 1, 0, 0, 0},
						{0, 2, 0, 3, 0, 0},
						{0, 0, 0, 0, 0, 0}	};

		// arr[i] 表示二维数组的第 i + 1 个元素
		// arr[i][j]表示二维数组的第 i + 1 个元素(一维数组)的第 j + 1 个元素
		for (int i = 0; i < arr.length; i++) { // 遍历二维数组的每个元素
			for (int j = 0; j < arr[i].length; j++) { //遍历对应的一维数组
				System.out.print(arr[i][j] + " "); // 输出一维数组
			} 
			System.out.println();
		}
    }
}