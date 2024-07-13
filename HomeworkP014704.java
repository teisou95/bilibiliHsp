// 作业4
// 导入扫描器
import java.util.Scanner;

public class HomeworkP014704 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 判断一个整数是否是水仙花数,水仙花数是指一个3位数,其各个位上数字的立方和等于其本身
		// 例如 153 = 1*1*1 + 5*5*5 + 3*3*3

		// 提示输入
		System.out.println("请输入一个3位正整数:");
		int num = scanner.nextInt();
		int num1 = num / 100; // 取出百位数
		int num2 = (num % 100) /10; // 取出十位数
		int num3 = num % 10; // 取出个位数
		// 计算立方和
		int sumOfCubes = (int)(Math.pow(num1,3) + Math.pow(num2,3) + Math.pow(num3,3));

		// 判断条件是否符合
		if (num == sumOfCubes) {
			System.out.println(num + "是水仙花数");
		} else {
			System.out.println(num + "不是水仙花数");
		}

		// 寻找全部的水仙花数
		for (int i = 100; i < 1000; i++) {
			num1 = i / 100; // 取出百位数
			num2 = (i % 100) /10; // 取出十位数
			num3 = i % 10; // 取出个位数
			// 计算立方和
			sumOfCubes = (int)(Math.pow(num1,3) + Math.pow(num2,3) + Math.pow(num3,3));

			// 判断条件是否符合
			if (i == sumOfCubes) {
				System.out.println(i + "是水仙花数");
			} 
		}


		// 关闭扫描器
		scanner.close();
    }
}