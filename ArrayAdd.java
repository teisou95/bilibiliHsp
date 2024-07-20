// 数组添加/数组扩容
// 实现动态的给数组添加元素的效果,实现对数组扩容
// 
import java.util.Scanner;
public class ArrayAdd {
	public static void main(String[] args) {
		/*
			原始数组使用静态分配
			增加的元素,直接放在数组的最后
			用户输入确定是否继续添加
		 */
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2 ,3};
		char c1 = 'y';
		while (true) {
			System.out.println("是否添加元素:y/n");
			c1 = myScanner.nextLine().charAt(0); 
			// 如果输入直接回车将会报错
			// 空字符串不能做charAt(0)
			if (c1 != 'y') {
				break;
			}
			int[] arrNew = new int[arr.length + 1];
			System.out.println("请输入要添加的元素(整数):");
			arrNew[arrNew.length - 1] = myScanner.nextInt();
			// 此处需要消耗掉多余的换行符
			myScanner.nextLine();
			for (int i = 0; i < arrNew.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
		} 
		System.out.print("最终的arr = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}