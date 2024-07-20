// 二维数组动态初始化 - 列数不确定
// 即其包含的一维数组的元素数量可以不完全相同
import java.util.Scanner;

public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int[][] arr = new int[8][]; // 列数不确定
		// arr[0] = new int[] {1};
		// arr[1] = new int[] {2, 2};
		// arr[2] = new int[] {3, 3, 3};

		// 遍历 arr 给每个一维数组开空间,并赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}


		// 遍历 arr 输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		myScanner.close();
    }
}