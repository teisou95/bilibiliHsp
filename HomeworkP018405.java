// 作业5
// 
public class HomeworkP018405 {
	public static void main(String[] args) {
		// 随机生成10个整数(1-100范围)保存到数组
		// 倒序打印并求平均值,求最大值和最大值的下标,并查找里面是否有8
		int[] arr = new int[1000];
		// 生成随机数并保存至数组
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// 倒序打印
		System.out.println("====随机数组倒序打印如下====");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		// 求平均值
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("\n平均值是 " + (double)sum / arr.length);
		// 注意平均数应该为小数

		// 求最大值和最大值的下标
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值是 " + max);
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				System.out.println("最大值对应下标为 " + i);
			}
		}

		// 查找数组是否有8
		int findNum = 8;
		int count = 0; // 计数
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				System.out.println("找到了数字 " + findNum);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("数组中没有 " + findNum);
		} else {
			System.out.println("数组中" + findNum + "的下标如下:");
			int[] numIndex = new int[count];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[i] == findNum) {
					numIndex[j++] = i;
				}
			}

			// 打印下标数组
			for (int i = 0; i < numIndex.length; i++) {
				System.out.print(numIndex[i] + " ");
			}
		}

    }
}