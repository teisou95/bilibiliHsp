// 导入扫描器
import java.util.Scanner;

public class ForExercise {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 练习1.打印1-100之间所有是9的倍数的整数,统计个数及总和
		// 化繁为简:将复杂的需求拆解为简单的需求,逐步完成
		// 先死后活:先考虑固定的值,然后转成可以灵活变化的值
		// 化繁为简:
		// (1)输出1-100的值
		// (2)输出的过程中,进行过滤,只输出9的倍数,使用if
		// (3)统计个数,定义变量int count = 0,条件满足时count++;
		// (4)总和,定义变量int sum = 0,条件满足时累积sum += i;
		// 先死后活:
		// (1)为了适应更好的需求,把范围的开始值和结束值,做成变量
		// (2)还可以更进一步,将9也做成变量
		int start = 1;
		int end = 100;
		int t = 9;
		int sum = 0;
		int count = 0;
		System.out.println(start + "-" + end + "之间" + t + "的倍数的整数如下:");
		for (int i = start; i <= end; i++) {
			if (i % t == 0) {
				System.out.println(i);
				count++;//计数
				sum += i;//累积
			}
			
		}
		System.out.println("这些数有" + count + "个,其总和为" + sum);


		// 练习2.完成表达式输出
		int result = 10;
		for (int i = 0; i <= result; i++) {
			System.out.println(i + "+" + (result - i) + "=" + result);
		}

    }
}