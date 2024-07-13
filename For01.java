// 循环控制
// 导入扫描器
//
import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scan = new Scanner(System.in);

		// 提示输入
		System.out.println("请输入需要循环的次数");
		int num = scan.nextInt();

		// for 循环,一直执行到循环条件判定为假,跳出循环,程序继续
		for ( int i = 0; i < num; i++) {
			System.out.println("你好" + i);
		}
	}
}