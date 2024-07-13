//导入扫描器
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);

		//提示输入,接收字符
		System.out.println("请输入字母a-g:");
		char charInput = scan.next().charAt(0);

		//匹配输出
		switch (charInput) {
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期二");
				break;		
			case 'c':
				System.out.println("星期三");
				break;		
			case 'd':
				System.out.println("星期四");
				break;		
			case 'e':
				System.out.println("星期五");
				break;		
			case 'f':
				System.out.println("星期六");
				break;		
			case 'g':
				System.out.println("星期日");
				break;
			default:
				System.out.println("无法匹配");
				break;
		}

		System.out.println("退出了switch,程序继续...");
	}
}