// 练习1: 斐波那契数 1 1 2 3 5 8 13...
// 练习2: 猴子吃桃问题
// 
public class RecursionExercise01 {
	public static void main(String[] args) {
		// 创建对象
		MathTools tool = new MathTools();
		int num = 7;
		int res = tool.fibonacciNumber(num);
		if (res != -1) {
			System.out.println("第" + num + "个斐波那契数是"+ res);
		}
		
		/*
			栈分析
			-------
			n = 1
			return 1
			-------
			n = 2
			return 1
			-------
			n = 3
			return f(2) + f(1) = 2
			-------
			n = 4
			return f(3) + f(2)
			-------
			n = 5
			return f(4) + f(3)
			-------
		 */


		int day = 10;
		int peach = tool.monkeyEatingPeach(day);
		System.out.println((day - 1) + "天前最初有" + peach + "个桃子");

    }
}

// 创建类
class MathTools {
	// 创建方法
	public int fibonacciNumber(int n) {
		if (n > 0) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
				// 反复调用栈,大量递归重复计算,性能较差
 
				// 使用 数组 与 for 循环可以优化提高性能
				// int[] fib = new int[n];
				// fib[0] = 1;
				// fib[1] = 1;
				// for (int i = 2; i < n; i++) {
				// 	fib[i] = fib[i - 1] + fib[i - 2];
				// }
				// return fib[n - 1];

				// 循环迭代方法
				// int fibNum1 = 1;
				// int fibNum2 = 1;
				// int fibNum = 0;
				// for (int i = 2; i < n; i++) {
				//  	fibNum = fibNum1 + fibNum2;
				//  	fibNum1 = fibNum2;
				//  	fibNum2 = fibNum;
				//  } 
				//  return fibNum;
			}
		} else {
			System.out.println("数据错误,必须传入正整数");
			return -1; // 代表数据错误
		}
	}

	// 有一堆桃子,猴子每天吃其中的一半+1个
	// 到第十天想再吃(即还没吃)时发现只有一个桃子了
	public int monkeyEatingPeach(int day) {
		if (day == 1) {
			return 1;
		} else {
			// 递归方法
			return (monkeyEatingPeach(day - 1) + 1) * 2;

			// 数组方法
			// int[] peach = new int[day];
			// peach[0] = 1;
			// for (int i = 1; i < day; i++) {
			// 	peach[i] = (peach[i - 1] + 1) * 2;
			// }
			// return peach[day - 1];

			// 循环迭代方法
			// int peachs = 1;
			// for (int i  = 1; i < day; i++) {
			// 	peachs = (peachs + 1) * 2;
			// }
			// return peachs;
		}
	}
}
