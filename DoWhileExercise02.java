//
// 导入扫描器
import java.util.Scanner;

public class DoWhileExercise02 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		char koutae = ' ';
		int i = 1;
		do {
			System.out.println("还钱吗? 选择输入y或n:");
			koutae = scanner.nextLine().charAt(0);
			
			if (koutae != 'y') {
				System.out.println("殴打" + i);
			}
			i++;
		} while (koutae != 'y');
    }
}