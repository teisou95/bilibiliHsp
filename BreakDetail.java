// break 细节
// 导入扫描器
import java.util.Scanner;

public class BreakDetail {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("");

		// break 语句出现在多层嵌套的语句块时,可以通过标签指明要终止的是哪一层语句块
		// 如果没有指定 break label;默认退出最近的循环体

		abc1:
		for (int j = 0; j < 4; j++) {
			abc2:
			for (int i = 0; i < 10; i++) {
				if (i == 2) {
					// break; // 等价于 break abc2;
					break abc1;
				}
				System.out.println("i = " + i);
			}
		}
    }
}