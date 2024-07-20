// 作业4
// 
import java.util.Scanner;

public class HomeworkP018404 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// 已知一个升序的数组,要求插入一个元素后,该数组依然是升序
		// 比如:{10,12,45,90},添加23后,数组为{10,12,23,45,90}

		int[] arr = {10, 12, 45, 90};
		while (true) {
			System.out.println("请输入要添加的整数:");
			int numAdd = myScanner.nextInt();
			int numIndexLeft = -1;

			// 先判断,再添加
			// 判断输入数据在新有序数组中的位置
			for (int i = 0; i < arr.length; i++) {
				if (numAdd > arr[i]) {
					numIndexLeft = i; // 输入数据左侧元素索引
				}
			}

			// 新有序数组赋值
			int[] newArr = new int[arr.length + 1];
			// for (int i = 0; i < newArr.length; i++) {
			// 	if (i <= numIndexLeft) {
			// 		newArr[i] = arr[i];
			// 	} else if (i == numIndexLeft + 1) {
			// 		newArr[i] = numAdd;
			// 	} else {
			// 		newArr[i] = arr[i - 1];
			// 	}
			// }

			// 使用双指针循环跳过插入位置
			// i 用于遍历 newArr ,j 用于遍历 arr
			for (int i = 0, j = 0; i < newArr.length; i++) {
				if (i != (numIndexLeft + 1)) {
					newArr[i] = arr[j];
					j++;
				} else { // 到达插入位置后,j++跳过一次,导致j = i- 1
					newArr[i] = numAdd;
				}
			}

			// 更新原数组并打印
			arr = newArr;
			System.out.println("=====更新后的有序数组如下=====");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			// 继续添加
			System.out.println("\n是否继续添加元素(y/n):");
			char key = myScanner.next().charAt(0);
			if (key != 'y') {
				break;
			}
		}

		myScanner.close();
    }
}