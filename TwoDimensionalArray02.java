// 二维数组的使用
// 二维数组变量在栈,指向一个位于堆的地址,地址空间存放全部一维数组的地址
// 	再由每个一维数组的地址指向具体数据
// 	即双重引用
import java.util.Scanner;

public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// 动态初始化二维数组
		int[][] arr = new int[2][3]; // 包含2个一维数组,每个一维数组有3个元素

		arr[1][1] = 8;
		// 遍历 arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		myScanner.close();
    }
}