// 编写代码 实现数组拷贝(内容复制)
// 数组在栈/元素数据在堆
public class ArrayCopy {
	public static void main(String[] args) {
		// 将int[] arr1 = {10, 20, 30};拷贝到 arr2 数组
		// 要求数据空间相互独立

		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length]; // 生成一个新的数据空间
		for (int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100; // 修改arr2 不会再影响arr1

		System.out.print("arr1 = ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " "); // 10 20 30
		}
		System.out.print("\narr2 = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " "); // 100 20 30
		}
		
    }
}