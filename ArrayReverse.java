// 数组元素内容反转
// 
public class ArrayReverse {
	public static void main(String[] args) {
		// 逆序赋值
		// int[] arr1 = {11, 22, 33, 44, 55, 66};
		// int[] arr2 = new int[arr1.length];
		// for (int i = 0; i < arr1.length; i++) {
		//  	arr2[i] = arr1[arr1.length - i - 1];
		//  } 
		//  arr1 = arr2; // 此时原本的arr1数据空间没有变量引用,会被垃圾回收,销毁
		//  System.out.print("arr1 = ");
		//  for (int i = 0; i < arr1.length; i++) {
		//  	System.out.print(arr1[i] + " ");
		//  }

		 // 前后元素交换
		 int[] arr1 = {11, 22, 33, 44, 55, 66};
		 for (int i = 0; i < arr1.length / 2; i++) {
		 	int temp = arr1[i];
		 	arr1[i] = arr1[arr1.length - i - 1];
		 	arr1[arr1.length - i - 1] = temp;
		 }
		 System.out.print("arr1 = ");
		 for (int i = 0; i < arr1.length; i++) {
		 	System.out.print(arr1[i] + " ");
		 }
    }
}