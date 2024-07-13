// 
// 导入扫描器
import java.util.Scanner;

public class Continue01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		int i = 1;
		while (i <= 4) {
			i++;
			if (i == 2) {
				continue; // continue结束当前循环,直接开始下一段循环
			}
			System.out.println("i = " + i);
		}

		// 关闭扫描器
		scanner.close();
    }
}