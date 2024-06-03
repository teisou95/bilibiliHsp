//多种类型数据混合运算的时候，自动将所有数据转换为容量最大的那种类型，然后再进行运算
//byte short 和char之间不会相关自动转换
//byte short 和char 三者可以计算，计算时全部转换为int 类型(包括同一类型之间的运算)
//boolean不参与转换

//自动类型转换细节
public class AutoConvertDetail {
	//main主方法
	public static void main(String[] args) {

		int n1 = 10;
		float d1 = n1 + 1.1F;
		double d2 = n1 + 1.1;

		int n2 = (int)-1.1;
		System.out.println(n2);

		byte b1 = 10;
		//常量10是int类型，但是当把一个具体的数字赋值给byte short时
		//先判断是否在byte short范围内，如果是就可以
		// char c1 = b1;//错误 byte不会自动转换为char
		int n3 = 1;
		// byte b2 = n3;//错误 按变量赋值，首先判断类型

		byte b3 = 1;
		short s1 = 1;
		byte b4 = 1;
		// short s2 = b3 + s1;//错误，运算结果是int
		int n4 = b3 + s1;
		// byte b5 = b3 + b4;//错误，运算结果是int
		int n5 = b3 + b4;

		boolean pass = true;
		// int num100 = pass;//错误

		//自动提升原则：表达式结果的类型自动提升为操作数中的最大类型

		byte b5 = 1;
		short s2 = 100;
		int num200 = 1;
		double d3 = 1.1;

		double d4 = b5 + s2 + num200 + d3;//运算结果是double
 	}
}