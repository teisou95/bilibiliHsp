// 打印金字塔,使用while 循环
// 导入扫描器
import java.util.Scanner;

public class StarsWhile {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 编写程序实现:可以接收一个整数,表示层数(totalLevel),打印出金字塔
		/**
		 * 打印矩形
*****
*****
*****
*****
*****

		 * 半边金字塔
*		1
**		2
***		3
****	4
*****	5
		
		 * 整个金字塔
*			1
***			3
*****		5
*******		7
*********	9
		
		 * 调整形状
    *		4	1
   ***		3 	3
  *****		2	5
 *******	1 	7
*********	0 	9
		
		 * 变成空心
    *		4	1
   * *		3 	3
  *   *		2	5
 *     *	1 	7
*********	0 	9
		
		 * 先死后活
		 */

		// 使用 while 实现
		System.out.println("请输入金字塔层数:");
		int totalLevel = scanner.nextInt();
		int i = 1;
		while (i <= totalLevel) {
			int k = 1;
			while (k <= (totalLevel - i)) {
				System.out.print(" ");
				k++;
			}
			int j = 1;
			while (j <= (2 * i - 1)) {
				if (j == 1 || j == (2 * i - 1) || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}

    }
}