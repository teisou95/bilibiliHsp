//分支控制 if-else
//双分支示例:
//编程实现,可以输入人的年龄,如果大于18岁,则输出"你已成年",否则输出"你未成年"
//
//导入文本扫描器
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner scanner = new Scanner(System.in);

		//提示输入
		System.out.print("请输入年龄:");
		int age = scanner.nextInt();
		scanner.close();

		//if-else判断,对应输出语句
		if (age >= 18) {
			System.out.println("你已成年");
		} else {
			System.out.println("你未成年");
		}

		System.out.println("程序继续...");
	}
}