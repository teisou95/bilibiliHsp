//强制转换符号只针对于最近的操作数有效，往往使用小括号提升优先级
//char类型可以保存int 的常量值，但不能保存int 的变量值，需要转换
//byte 和short 类型进行运算时，当作int 处理


public class ForceConvertDetail {
	//main主方法
	public static void main(String[] args) {

		// int x = (int)10 * 3.5 + 6 * 1.5;//错误，运算结果是double
		int y = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println("y = " + y);

		char c1 = 120;//ok
		System.out.println(c1);
		int m = 100;
		// char c2 = m;//错误
		char c3 = (char)m;//ok
		System.out.println("c3 = " + c3);
 	}
}