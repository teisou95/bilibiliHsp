// break 入门测试
// 导入扫描器
import java.util.Scanner;

public class Break01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		for (int i = 0; i < 10; i++) {
			if (i == 3) { break; }	// break 提前结束循环代码块
			System.out.println("i = " + i);
		}
		System.out.println("退出了 for 循环,程序继续...");
	
    }
}