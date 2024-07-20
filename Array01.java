// 数组
// 

public class Array01 {
	public static void main(String[] args) {


		// // 传统思路解决
		// double weight1 = 3.0;
		// double weight2 = 5.0;
		// double weight3 = 1.0;
		// double weight4 = 3.4;
		// double weight5 = 2.0;
		// double weight6 = 50.0;

		// double sum = weight1 + weight2 + weight3 + weight4 + weight5 + weight6;
		// double average = sum / 6.0;

		// System.out.println("sum = " + sum + "\naverage = " + average);

		// 传统实现的问题,随着数量扩大难以实现,过于重复繁杂
		// 引出新的技术:数组,就是一组数据
		// 数组可以存放多个同一类型的数据
		// 数组本身也是一种数据类型,是引用类型

		// 上述问题用数组解决

		//1.定义一个数组:double[] 表示是double类型的数组,
		// 	数组名是hens,{}内部是数组的值(元素)
		double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8,88.8,3 ,4};
		// 可以写成 double hens[] 是一样的
		double sum = 0;

		// 2.遍历数组得到数组的所有元素的和,使用for
		// 通过 hens[下标] 来访问数组的元素,从0开始编号
		// 通过for 可以循环访问数组的元素
		// 可以通过 数组名.length 得到数组的大小(长度)
		System.out.println("数组的长度是" + hens.length);
		for (int i = 0; i < hens.length; i++) {
			System.out.println("hens" + "[" + i + "] = " + hens[i]);
			sum += hens[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("average = " + sum / hens.length);
    }
}