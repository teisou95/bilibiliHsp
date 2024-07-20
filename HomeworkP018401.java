// 作业1
// 
import java.util.Scanner;

public class HomeworkP018401 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// 数组定义判断正误
		// String strs1[] = {'a', 'b', 'c'}; // 错误 char -> String
		// String[] strs2 = {"a", "b", "c"}; // 正确
		// String[] strs3 = new String{"a", "b", "c"}; // 错误 应为new String[]{}
		// String strs4[] = new String[]{"a", "b", "c"}; // 正确 
		// String[] strs5 = new String[3]{"a", "b", "c"}; // 错误 重叠操作		

		// 修正后
		String strs1[] = {"a", "b", "c"};
		String[] strs2 = {"a", "b", "c"};
		String[] strs3 = new String[]{"a", "b", "c"};
		String strs4[] = new String[]{"a", "b", "c"};
		String[] strs5 = new String[]{"a", "b", "c"}; // 或如下分两步

		String[] strs6 = new String[3];
		strs6[0] = "a";
		strs6[1] = "b";
		strs6[2] = "c";

		System.out.println("");

		myScanner.close();
    }
}