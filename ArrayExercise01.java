// 
// 导入扫描器
import java.util.Scanner;

public class ArrayExercise01 {
	public static void main(String[] args) {
		// 创建一个char 类型的26个元素的数组,分别放置'A' - 'Z',循环打印

		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		char[] arr = new char[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = (char)('A' + i);
			System.out.print(arr[i] + " ");
		}

		// 关闭扫描器
		scanner.close();
    }
}