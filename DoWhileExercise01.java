// 导入扫描器
import java.util.Scanner;

public class DoWhileExercise01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 练习1:打印1-10
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 100);

		// 练习2:打印1-100的和
		int j = 1;
		int sum = 0;
		do {
			sum += j;
			j++;
		} while (j <= 100);
		System.out.println("sum = " + sum);

		// 练习3:统计1-200之间能被5整除但不能被3整除的数的个数
		int k = 1;
		int count = 0;
		do {
			if (k % 5 == 0 && k % 3 !=0) {
				count++;
			}
			k++;
		} while (k <= 200);
		System.out.println("count = " + count);
    }
}