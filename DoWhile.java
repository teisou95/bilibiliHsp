// do while循环
// 先执行后判断,也就是一定会至少执行一次
//
// 导入扫描器
//
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 输出十句你好 do while
		int i = 0;
		do {
			System.out.println("do while你好" + i);
			i++;
		}while (i < 10);
		System.out.println("此时i = " + i);

		// while
		i = 0;
		while (i < 10) {
			System.out.println("while你好" + i);
			i++;
		}
		System.out.println("此时i = " + i);

		// for
		for (i = 0; i < 10; i++) {
			System.out.println("for你好" + i);
		}
		System.out.println("此时i = " + i);
		
    }
}