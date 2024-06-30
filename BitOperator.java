//演示位移运算

//导入扫描器
import java.util.Scanner;

public class BitOperator {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		//提示输入
		System.out.println("请输入被操作数:");
		int num1 = myScanner.nextInt();
		System.out.println("请输入算术右移次数:");
		int time1 = myScanner.nextInt();
		int result1 = num1 >> time1;
		System.out.println(num1 + ">>" + time1 + "=" + result1);
		System.out.println(num1 + "/" + 2 + "=" + num1 / 2);

		// -17的原码 10010001,反码11101110,补码11101111
		// -17 >> 1 补码11110111,反码11110110,原码10001001,数字-9



	}
}