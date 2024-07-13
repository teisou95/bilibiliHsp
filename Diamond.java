// 
// 导入扫描器
import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		/*
			打印空心菱形
			空格 	星星数	层数
    *		4		1		1	
   * *		3		3		2
  *   *		2		5		3
 *     *	1		7		4
*       *	0		9		5
 *     *	1		7		6
  *   *		2		5		7
   * *		3		3		8
    *		4		1		9

		*/
		// 提示输入
		System.out.println("请输入菱形的层数(奇数):");
		int totalLevel = scanner.nextInt();
		// 校验奇数
		while (totalLevel % 2 == 0) {
			System.out.println("输入错误,请输入一个奇数:");
			totalLevel = scanner.nextInt();
		}

		int level = (totalLevel + 1) / 2;

		for (int i = 1; i <= totalLevel; i++) {
			// 打印前面的空格
			for (int j = 1; j <= Math.abs(level - i); j++) {
				System.out.print(" ");
			}

			// 打印中间部分
			for (int k = 1; k <= (totalLevel - 2 * Math.abs(level - i)); k++) {
				// 打印星星
				if (k == 1 || k == (totalLevel - 2 * Math.abs(level - i))) {
					System.out.print("*");
				} else { // 打印空心空格
					System.out.print(" ");
				}
			}
			System.out.println();

		}
    }
}