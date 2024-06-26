//取反(非操作) !
//逻辑异或 ^
//逻辑运算符练习
public class InverseOperators {
	public static void main(String[] args) {
		boolean b = 60 > 20;
		System.out.println(!b);//false
		System.out.println(b);//true

		boolean b1 = (10 > 1) ^ (3 < 5);
		System.out.println(b1);//false

		System.out.println(b ^ b1);//true

		//练习1

		// int x = 5;
		// int y = 5;
		// if (x++ == 6 & ++y == 6) {	//逻辑与，两个条件都会判断
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//6，6

		// int x = 5;
		// int y = 5;
		// if (x++ == 6 && ++y == 6) {	//短路与，x++ == 6 为假，后句不执行
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//6，5

		// int x = 5;
		// int y = 5;
		// if (x++ == 5 | ++y == 5) {	//逻辑或，两个条件都会判断
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//11，6

		// int x = 5;
		// int y = 5;
		// if (x++ == 5 || ++y == 5) {	//短路或，x++ == 5 为真，后句不执行
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//11，5

		//练习2

		boolean x = true;
		boolean y = false;
		short z = 46;
		if ((z++ == 46) && (y = true)) { //y = true 是赋值，不是判断
			z++;
		}
		System.out.println("z = " + z);//48

		if ((x = false) || (++z == 49)) {
			z++;
		}
		System.out.println("z = " + z);//50

		int num = 100;
		int num1 = (num = 3)*4;
		// 赋值操作 (num = 3) 本身是一个表达式，它返回被赋值的值
		System.out.println(num);//3
		System.out.println(num1);//12
	}
}