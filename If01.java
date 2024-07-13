//分支控制 if-else
//单分支示例:
//编程实现,可以输入人的年龄,如果大于18岁,则输出"你已成年"
//
//导入文本扫描器
import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		//创建Scanner对象
		Scanner scanner = new Scanner(System.in);

		//提示用户输入年龄,接收数据
		System.out.print("请输入年龄(整数):");
		int age = scanner.nextInt();
		scanner.close();

		//判断年龄是否大于18岁,输出对应语句
		if (age >= 18) {
			System.out.println("你已成年");
		} 

		System.out.println("程序继续...");
	}
}