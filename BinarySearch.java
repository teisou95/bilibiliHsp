// 二分查找
// 导入扫描器
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// 对一个有序数组进行二分查找{1,8,10,89,1000,1234}

		// 创建扫描对象
		Scanner myScanner = new Scanner(System.in);

		// 初始化数组
		int[] arr = {1, 8, 10, 89, 1000, 1234};
		int left = 0; // 左侧界限
		int right = arr.length - 1; // 右侧界限

		// 提示输入
		System.out.println("请输入一个整数:");
		int numInput = myScanner.nextInt();
		boolean found = false;
		// 二分判断
		do {
			int mid = (right + left) / 2;
			if (numInput == arr[mid]) {
				System.out.println("找到了,下标为" + mid);
				found = true;
				break;
			} 
			else if (numInput >arr[mid]) {
				left = mid + 1; // 目标在右半部分
			}
			else {
				right = mid - 1; // 目标在左半部分
			}
		} while (left <= right);
		if (!found) {
			System.out.println("没有这个数");
		}
		

		// 关闭扫描器
		myScanner.close();
    }
}