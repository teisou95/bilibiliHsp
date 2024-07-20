// 数组赋值机制
// 值拷贝/传值  和 引用传递/地址传递
// jvm的内存中分为:栈/堆/方法区
public class ArrayAssign {
	public static void main(String[] args) {
		// 基本数据类型赋值方式:值拷贝
		// n2 的变化不会影响n1 的值
		int n1 = 10;
		int n2 = n1;
		n2 = 50;
		System.out.println("n1 = " + n1); // 10
		System.out.println("n2 = " + n2); // 50

		// 数组默认情况下是引用赋值,附的值是地址
		// 地址拷贝/引用传递
		// arr2变化会影响到 arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		// arr2 = {1, 1, 2}; //错误写法,重新初始化需要new
		arr2[0] = 10;
		System.out.println("arr1[0] = " + arr1[0]); // 10
		System.out.println("arr2[0] = " + arr2[0]); // 10
			
		

    }
}