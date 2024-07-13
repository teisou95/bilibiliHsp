// 作业1
// 导入扫描器
import java.util.Scanner;

public class HomeworkP014701 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 某人有100,000元,每经过一次路口,需要缴费,规则如下:
		// (1) 当现金 > 50,000元时,每次交5%
		// (2) 当现金 <= 50,000元时,每次交1000
		// 计算该人可以经过多少次路口,使用 while break 实现

		// 提示输入
		System.out.println("请输入当前现金金额:");
		double balance = scanner.nextDouble();

		// 定义计数器
		int count  = 0;
		while (balance > 0) {
			if (balance > 50000) {
				balance *= 0.95;
				count++;
			} else if (balance >= 1000) {
				balance -=1000;
				count++;
			} else {
				break; // 余额不足,直接退出循环
			}
			System.out.print("已通过" + count + "次路口");
			System.out.println("\t当前余额为" + balance);
		}
		System.out.println("可以通过" + count + "次路口");

		// 关闭扫描器
		scanner.close();
    }
}