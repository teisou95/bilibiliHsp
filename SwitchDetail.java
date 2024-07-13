//导入扫描器
//
import java.util.Scanner;

public class SwitchDetail {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);

		//1.switch表达式数据类型,应和case后的常量类型一致
		//或是可以自动转为能够相互比较的类型
		//比如输入的是char,常量是int

		char c = 'a';
		switch (c) {
			case 'a' :
				System.out.println("ok1");
				break;
			case 98 ://char 可以自动转换为int类型相互比较
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok3");
		}

		//2.switch(表达式),表达式的返回值必须是:
		//byte short int char enum[枚举] String
		//其他类型不匹配:比如double long float

		// double d = 1.1;
		// switch (d) {//错误,double不能用switch
		// 	case 1.1 :
		// 		System.out.println("ok1");
		// 		break;
		// 	case 2.2 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }

		
		//3.case子句中的值必须是常量或者常量表达式(一个具体的值),不能是变量
		//4.default子句是可选的,当没有匹配的case时,执行default
		//连default也没有的时候,一个也不执行
		//5.break语句用来在执行完一个case分支后使程序跳出switch语句块
		//如果没有break,程序会在匹配上case后一直顺序执行到switch结尾,除非遇到break
		//即 case穿透
		int num = 52;
		switch (num) {
			case 52 :
				System.out.println("ok1");
				// break;
			case 51+10 ://计算得出常量也是可以的
				System.out.println("ok2");
				break;
			default ://default可以不写
				System.out.println("ok3");
		}
	}
}