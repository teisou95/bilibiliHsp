//运算符介绍
//特殊的符号，用于表示数据的运算、赋值和比较等
/*
	算术运算符
	赋值运算符
	关系运算符/比较运算符
	逻辑运算符
	位运算符（二进制）
	三元运算符
*/
//算术运算符：对数值类型的变量进行运算	+ - + - * / %（取模）++ -- +
public class ArithmeticOperator {
	//main方法
	public static void main(String[] args) {
		//除号 /
		// 10 / 4 == 2
		// 10 / 4.0 == 2.5
		int num1 = 10 / 4;
		double d1 = 10 / 4;
		double d2 = 10.0 / 4;
		double d3 = 10 / 4.0;
		System.out.println(num1);	//2
		System.out.println(d1);		//2.0
		System.out.println(d2);		//2.5
		System.out.println(d3);		//2.5

		//取模（取余） %
		//java中 % 的本质： a % b == a - a / b * b
		//可以理解为取模结果的正负，只和前数的正负相关
		System.out.println("\n");
		System.out.println(10 % 3);		//10 - 9 == 1
		System.out.println(-10 % 3);	//-10 - -9 == -1
		System.out.println(10 % -3);	//10 - 9 == 1
		System.out.println(-10 % -3);	//-10 - -9 ==-1

		// 自增 ++ 
		//
		System.out.println("\n");
		int i = 10;
		i++;//作为独立语句使用，与 ++i; 完全一样，等价于 i = i + 1;
		++i;
		System.out.println("i = " + i);
		/*
		作为表达式使用
		前++： ++i 先自增后赋值
		后++： i++ 先赋值后自增
		*/
		int j = 8;
		int k = ++j;//等价于 j = j + 1; int k = j;
		System.out.println("j = " + j);//9
		System.out.println("k = " + k);//9

		int j1 = 8;
		int k1 = j1++;//等价于 int k1 = j1; j1 = j1 + 1;
		System.out.println("j1 = " + j1);//9
		System.out.println("k1 = " + k1);//8

	}
}