//进制转换

//导入文本扫描器
import java.util.Scanner;

public class BaseConversion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		//四位二进制数字转换为十进制数字
		//提示输入四位数的二进制数字
		System.out.println("请输入一个四位数的二进制数字(从左到右依次输入)");
		System.out.println("请输入第一个数字:");
		int num1 = myScanner.nextInt();

		System.out.println("请输入第二个数字:");
		int num2 = myScanner.nextInt();

		System.out.println("请输入第三个数字:");
		int num3 = myScanner.nextInt();

		System.out.println("请输入第四个数字:");
		int num4 = myScanner.nextInt();

		myScanner.close();

		//计算转换为十进制数字
		int result = num4 * 1 + num3 * 2 + num2 * 4 + num1 * 8;

		//输出对应十进制数字
		System.out.println("你所输入的四位数二进制数字" 
			+ num1 + num2 + num3 + num4 + "转换为十进制数字是" + result); 

	}
}