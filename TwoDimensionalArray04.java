// 二维数组 案例
// 
import java.util.Scanner;

public class TwoDimensionalArray04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// 遍历二维数组求和
		int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}}; // 静态初始化
		int sum = 0;

		// 遍历求和
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println("sum = " + sum);

		myScanner.close();
    }
}