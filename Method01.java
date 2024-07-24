// 成员方法 : 类 的行为
// 类 包括 成员变量(属性) 和 成员方法(方法)
// 主程序执行到方法时,就在开辟一个独立的栈空间
// 方法执行完毕,或者执行到 return 语句时,就会返回
// 返回到调用方法的位置
// 返回后继续执行方法后面的代码
// main 方法执行完毕后,整个程序退出
//
import java.util.Scanner;
public class Method01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");
		// 方法使用
		// 1. 方法写好后,如果没有任何调用,不会执行
		// 2. 先创建一个对象,然后调用其方法
		Person p1 = new Person();
		p1.speak(); // 调用speak 方法
		p1.cal01(); // 调用cal01 方法
		p1.cal02(2000); // 调用cal02 方法,同时给n传入形参
		p1.cal02(3000); // 方法可以多次调用
		int returnRes = p1.getSum(12, 25); // 把getSum方法返回的值赋给returnRes
		System.out.println("getSum方法的返回值为 " + returnRes);

		myScanner.close();

    }
}

class Person {
	String name;
	int age;
	// 成员方法
	// public 表示方法是公开的
	// void 表示方法没有返回值
	// speak 是 方法名,() 是 形参列表,当前没有任何值,目前是空
	// {} 是 方法体,可以写执行代码
	// System... ; 表示方法就是输出一句话

	public void speak() {
		System.out.println("调用了 Person类 中的成员方法 speak");
	}

	public void cal01() {
		// 计算1 + ... + 1000的结果
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("调用了Person 的成员方法 cal01,计算结果是" + res);
	}

	public void cal02(int n) { 
		// (int n) 是形参列表,表示当前可以传入一个形参,可以接受用户输入
		// 接收一个数n, 计算1~n的和
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("调用了 cal02 方法,传入了形参" + n + ",计算结果是" + res);
	}

	// int 表示方法执行后,返回一个 int 
	// return 表示把 sum 的值返回
	public int getSum(int n1, int n2) {
		// 计算两个数的和
		int sum = n1 + n2;
		return sum;
		// System.out.println("调用了getSum方法,传入了形参"
		// 					 + n1 + "和" + n2 + ",和是" + sum);
	}
}