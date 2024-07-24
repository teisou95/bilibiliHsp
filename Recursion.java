// 方法递归调用
// 递归就是方法自己调用自己,每次调用时传入不同的变量
// 执行一个方法时,就创建一个新的受保守的独立空间(栈空间)
// 方法的局部变量时独立的,不会相互影响
// 如果方法中使用的是引用类型变量(数组/对象),就会共享改引用类型的数据
// 递归必须向推出递归的条件逼近,否则局势无限递归,出现 StackOverFlowError
// 当一个方法执行完毕,或者遇到 return 就会返回,遵守谁调用,就将结果返回给谁
// 当该方法执行完毕或遇到 return,该方法也就执行完毕
// 
import java.util.Scanner;
public class Recursion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");
		T t = new T();
		t.test(5);
		/*
			递归分析
			test(5)
			n = 5
			5 > 2
				test(4)
				n = 4
				4 > 2
					test(3)
					n = 3
					3 > 2
						test(2)
						2 不大于 2
						打印 n = 2
					打印 n = 3
				打印 n = 4
			打印 n = 5

		 */

		int num = 5;
		System.out.println(num + " 的阶乘是 " + t.factorial(num));
		/*
			求f(5)
			n = 5
			return f(4)*5
				求f(4)
				n = 4
				return f(3)*4
					求f(3)
					n = 3
					return f(2)*3
						求f(2)
						n = 2
						return f(1)*2
							求f(1)
							n = 1
							return 1
						f(2)==1*2
					f(3)==1*2*3
				f(4)==1*2*3*4
			f(5)==1*2*3*4*5
		 */

		myScanner.close();

    }
}

class T {
	// 从2 开始输出
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	// 阶乘
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}