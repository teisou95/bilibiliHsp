// 
// 导入扫描器
import java.util.Scanner;

public class ContinueDetail {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		label1:
		for (int j = 0; j < 4; j++) {
			label2:
			for (int i = 0; i < 10; i++) {
				if (i == 2) {
					// continue; // 等同于continue label2;
					continue label1; // 跳到label1 进行下一次循环
				}
				System.out.println("i = " + i);
			}
		}

		// 关闭扫描器
		scanner.close();
    }
}