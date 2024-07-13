// for 循环细节
// 循环条件一定是返回一个布尔值的表达式
//
// 导入扫描器
import java.util.Scanner;

public class ForDetail {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// for (变量初始化; 循环条件; 变量迭代){}
		// 初始化和变量迭代可以写在其他地方,但是分号不能省略
		// 在循环中定义的变量作用域只在循环中,循环结束后不能使用
		// 循环变量初始化,写在外面在for循环结束后能继续使用变量i
		int i1 = 0;
		for (; i1 < 10; ) {
			System.out.println("你好" + i1);
			i1++;
		}
		System.out.println("i1 = " + i1);

		// int j = 0;
		// for (;;) {// 表示一个无限循环,死循环,ctrl + c退出死循环
		// 	System.out.println("j = " + j);
		// 	j++;
		// }

		// 循环初始值可以有多条初始化语句,但要求类型一样,中间用逗号隔开
		// 变量迭代也可以有多条
		int count = 3;
		for (int i = 0, j = 0; i < count; i++,j += 2) {
			System.out.println("i = " + i + "\tj = " + j);
		}
    }
}