// 导入扫描器
import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 使用while循环完成for 的题目
		// 输出10句你好
		int i = 0;// 循环变量初始化
		while (i < 10) {// 循环条件
			System.out.println("你好" + i);// 执行语句
			i++;// 变量迭代
		}
    }
}