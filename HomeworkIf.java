//出票系统:根据淡旺季的月份和年龄,打印票价
//
//导入扫描器
import java.util.Scanner;

public class HomeworkIf {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);

		//提示输入
		System.out.println("请输入月份(1-12):");
		int gatsu = scan.nextInt();
		System.out.println("请输入年龄(整数):");
		int age = scan.nextInt();

		//判断并输出信息
		if (gatsu >3 && gatsu < 11) {
			System.out.print("旺季");
			if (age >17 && age <61) {
				System.out.println("成人票价60元");
			}else if (age >60) {
				System.out.println("老人票价20元");
			}else if (age < 18) {
				System.out.println("儿童票价30元");
			}
		}else {
			System.out.print("淡季");
			if (age >17 && age <61) {
				System.out.println("成人票价40元");
			}else {
				System.out.println("儿童或老人票价20元");
			}
		}
	}
}