//键盘输入语句
//使用扫描器(对象),就是Scanner  Scanner是一个类,用于创建对象,接收输入数据
//首先需要导入该类所在的包:	import java.util.Scanner;
//然后创建该类对象(声明变量)
//再调用里面的功能

//案例:从控制台接收用户信息

import java.util.Scanner;//把java.util包下面的Scanner类导入
public class Input {
	public static void main(String[] args) {
		//1.导入Scanner类所在的包
		//2.创建Scanner的对象实例
		//myScanner就是Scanner类的对象

		Scanner myScanner = new Scanner(System.in);

		//3.提示输入,使用相关的方法
		System.out.println("请输入名字:");
		String name = myScanner.next();
		//next是一个方法,接收用户输入的一个完整字符串,遇到空格或回车将结束
		//也可以使用 .nextLine 将接收一整行用户的输入数据
		//程序执行到next方法是,会等待用户输入

		System.out.println("请输入年龄:");
		int age = myScanner.nextInt();//接收输入的int
		System.out.println("请输入收入:");
		double salary = myScanner.nextDouble();//接收输入的double

		//整理输出
		System.out.println("人的信息如下:");
		System.out.println("名字\t年龄\t收入\n" + name + "\t" + age + "\t" + salary);
	}
}