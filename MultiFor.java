// 多重嵌套循环
// 导入扫描器
import java.util.Scanner;

public class MultiFor {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		//提示输入
		System.out.println("");

		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("第" + ++count + "次输出");
				System.out.println("\ti = " + i + "\tj = " + j);
			}
		}
    }
}