// 作业3
// 导入扫描器
import java.util.Scanner;

public class HomeworkP014703 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 判断一个年份是否为闰年
		// 闰年的标准:
		// (1)年份是4的倍数,且不是100的倍数(普通闰年)
		// (2)或年份是100的倍数,且同时是400的倍数(世纪闰年)

		// 提示输入
		System.out.println("请输入年份:");
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}

		// 关闭扫描器
		scanner.close();
    }
}