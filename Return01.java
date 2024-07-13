// return 使用在方法,表示跳出所在的方法
// 注意:如果 return 写在 main 方法,会退出程序
// 导入扫描器
import java.util.Scanner;

public class Return01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("i = " + i);
				// return; // 跳出main 方法
				// continue; // 结束本次循环,开始下一次循环
				break; // 结束循环
			}
			System.out.println("Hello" + i);
		}
		System.out.println("go on...");

		// 关闭扫描器
		scanner.close();
    }
}