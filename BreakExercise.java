// 课堂练习
// 导入扫描器
import java.util.Scanner;

public class BreakExercise {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		// 1-100以内的数求和,当 和 第一次大于20的当前数
		int currentNum = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				currentNum = i;
				break;
			}
		}
		System.out.println("currentNum = " + currentNum);
		System.out.println("sum = "+ sum);


		// 实现登录验证,有3次机会,如果用户名为"丁真",密码"666"提示登录成功
		// 否则提示还有几次机会
		for (int i = 1; i <= 3; i++) {

			// 获取用户输入
			System.out.println("请输入用户名:");
			String name = scanner.next();			
			System.out.println("请输入密码:");
			String passWord = scanner.next();

			// 判断输入正确性
			// 字符串的比较用 equals 方法
			if ("丁真".equals(name) && "666".equals(passWord)) {
				System.out.println("登录成功");
				break; // 登录成功后退出循环
			} 
			System.out.println("登录失败,你还有" + (3 - i) + "次输入机会");
		}

		// 关闭扫描器
		scanner.close();
    }
}