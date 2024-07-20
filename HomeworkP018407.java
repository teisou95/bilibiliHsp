// 作业7
// 
public class HomeworkP018407 {
	public static void main(String[] args) {
		// 冒泡排序
		// 
		int[] arr = new int[20];
		// 生成1~100随机数并保存至数组
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// 循环找最大值交换顶置最后
		for (int i = 0; i < arr.length - 1; i++) { // 外循环 9 次
			boolean swapped = false; // 标记是否发生了交换
			for (int j = 0; j < arr.length - 1 - i; j++) { 
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break; // 数组已经有序,提前退出排序
			}
		}

		// 打印有序数组
		System.out.println("====生成数组排序后如下====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}