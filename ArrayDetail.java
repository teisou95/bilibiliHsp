// 
// 导入扫描器
import java.util.Scanner;

public class ArrayDetail {
	public static void main(String[] args) {
		// 数组中的元素可以是任何数据类型,包括基本类型和引用类型,但是不能混用
		int[] arr1 = {1, 2, 3};
		double[] arr2 = {2, 100, 1.0}; // 自动类型转换

		String[] arr3 = {"北京","fha","\n"};

		// 数组创建后,如果没有赋值,会有默认值
		// int short byte long 默认 0
		// float double 默认 0.0
		// char 默认 \u0000
		// boolean 默认 false
		// String 默认 null
		boolean[] arr4 = new boolean[6];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		// 数组下标必须在指定范围内使用,否则报:下标越界异常
		// 即数组下标/索引 最小0,最大 数组长度-1
		int[] arr5 = new int[5];
		// System.out.println(arr5[5]); // 数组越界

		// 数组是引用类型,数组型数据是对象(object)
    }
}