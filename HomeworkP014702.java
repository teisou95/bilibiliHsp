// 作业2
// 导入扫描器
import java.util.Scanner;

public class HomeworkP014702 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 实现判断一个数属于哪个范围:大于0 小于0 等于0 

		// 提示输入
		System.out.println("请输入一个数:");
		double num = scanner.nextDouble();
		if (num > 0) {
			System.out.println(num + "大于0");
		} else if (num < 0) {
			System.out.println(num + "小于0");
		} else {
			System.out.println(num + "等于0");
		}

		// 关闭扫描器
		scanner.close();
    }
}