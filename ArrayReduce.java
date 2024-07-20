// 数组缩减
// 导入扫描器
import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner myScanner = new Scanner(System.in);

		/*
			初始化一个数组{1,2,3,4,5},可以将该数组进行缩减,提示用户是否继续缩减,
			每次缩减最后那个元素,当只剩下最后一个元素时,提示不能再缩减
		 */
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("======原始数组是=====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		do {
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arrNew.length; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			System.out.println("\n==========缩减后的数组是=========");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			if (arr.length == 1) {
				System.out.println("\n数组仅剩最后一个元素,不可再缩减.");
				break;
			}

			System.out.println("\n是否继续缩减(y/n):");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				break;
			}
		} while (true);

		System.out.println("退出数组缩减...");

		// 关闭扫描器
		myScanner.close();
    }
}