// 冒泡排序
// 
public class BubbleSort {
	public static void main(String[] args) {
		// 将一个无序数列,使用冒泡排序排成一个从小到大的有序数列
		// 冒泡排序的特点:
		// 1.一共进行 length - 1 轮排序,第 n 轮排序可以第 n 大的数的位置
		// 2.发现逆序即交换
		// 3.每一轮的比较次数在减少
		// 4.第 n 轮排序需要比较 length - n 次

		// 初始化一个无序数组
		int[] arr = {24, 69, 80, 57, 13, 100,21 , 01, 250, -9, 250, 3, 69};

		// 冒泡排序
		for (int i = 0; i < arr.length - 1; i++) { // 外层循环
			boolean key = false; // 标记是否发生了交换
			for (int j = 0; j < arr.length - 1 - i ; j++) { // 内层循环
				if (arr[j] > arr[j + 1]) { // 检查逆序交换
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					key = true;	// 标记发生了交换
				}
			}
			if (!key) { // 如果本轮没有发生交换,说明数组已经有序,提前退出循环
				break;
			}
		}

		// 输出排序后的数组
		System.out.println("=====按从小到大排序后数列为=====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}