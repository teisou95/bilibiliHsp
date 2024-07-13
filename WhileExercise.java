// 导入扫描器
import java.util.Scanner;

public class WhileExercise {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 练习1.打印1-100之间所有能被3整除的数
		// 思路分析:打印1-100/过滤结果/变量化
		int i = 1;
		int end = 100;
		int t = 3;
		while (i <= end) {
			if (i % t == 0) {
				System.out.println(i);
			}
			i++;
		}

		// 练习2.打印40-200之间所有的偶数
		// 思路分析:打印40-200/过滤结果/变量化
		int j = 40;
		int end1 = 200;
		while (j <= end1){
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
    }
}