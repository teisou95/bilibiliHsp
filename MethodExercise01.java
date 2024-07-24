// 练习1 2
// 
import java.util.Scanner;
public class MethodExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// 编写类AA,有一个方法:判断一个数是奇数还是偶数,返回boolean
		// 根据行,列,字符 打印对应行数和列数的字符
		AA a1 = new AA();
		int num = 311;
		if (a1.isOdd(num)) {
			System.out.println(num + "是奇数");
		} else {
			System.out.println(num + "是偶数");
		}

		// 提示输入
		System.out.println("请输入行数:");
		int cow = myScanner.nextInt();
		System.out.println("请输入列数:");
		int col = myScanner.nextInt();
		System.out.println("请输入要打印的字符:");
		char c = myScanner.next().charAt(0);

		// 打印
		a1.printChar(cow, col, c);

		myScanner.close();

    }
}

class AA {
	public boolean isOdd(int n) {
		// boolean isOdd = false;
		// switch (n % 2) {
		// case 0:
		// 	isOdd = false;
		// 	break;
		// case 1:
		// 	isOdd = true;
		// 	break;
		// }
		// return isOdd;

		// 三元运算符一步搞定
		// return n % 2 != 0 ? true : false;

		// 更简化
		return n % 2 != 0;
	}

	public void printChar(int row, int col, char c) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c + " ");
			} // 打印一行
			System.out.println(); // 换行
		}
	}
}