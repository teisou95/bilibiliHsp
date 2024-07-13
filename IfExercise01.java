// 单分支和双分支练习
// 
// 导入扫描器
import java.util.Scanner;

public class IfExercise01 {
	public static void main(String[] args) {
		// 创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);


		// 练习1
		System.out.println("练习1:");
		int x = 7;
		int y = 4;
		if (x > 5) {
			if (y > 5) {
				System.out.println("x > 5 且 y > 5");
			}
			System.out.println("x > 5");
		} else {
			System.out.println("x < 5");
		}
		// 输出的内容是"x > 5"


		// 练习2
		System.out.println("\n练习2:");
		// 编写程序,声明2个double类型变量
		// 判断第一个数大于10.0,且第二个数小于20.0,打印两数之和
		System.out.print("请输入第一个数:");
		double d1 = scanner.nextDouble();
		System.out.print("请输入第二个数:");
		double d2 = scanner.nextDouble();

		// if (d1 > 10.0) {
		// 	if (d2 < 20.0) {
		// 		System.out.println("符合条件,两数之和是:" + (d1 + d2));
		// 	}
		// } else {
		// 	System.out.println("不符合条件");	
		// }

		// 避免if嵌套,采用逻辑判断更好
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println("符合条件,两数之和是:" + (d1 + d2));
		} else {
			System.out.println("不符合条件");
		}


		// 练习3
		System.out.println("\n练习3:");
		// 定义两个变量int,判断二者的和,是否能被3又能被5整除,打印提示信息
		System.out.print("请输入第一个整数:");
		int num1 = scanner.nextInt();
		System.out.print("请输入第二个整数:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;

		// if (sum % 3 == 0) {
		// 	if (sum % 5 == 0) {
		// 		System.out.println("两数之和能同时被3和5整除");
		// 	}
		// } else {
		// 	System.out.println("不符合条件");
		// }

		//避免if嵌套,采用逻辑判断更好
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("两数之和能同时被3和5整除");
		} else {
			System.out.println("不符合条件");
		}


		// 练习4
		System.out.println("\n练习4");
		// 判断一个年份是否是闰年,闰年的条件是符合下面二者之一:
		// (1)年份能被4整除,但不能被100整除
		// (2)能被400整除
		System.out.print("请输入一个年份(整数):");
		int year = scanner.nextInt();

		// if (year % 4 == 0) {
		// 	if (year % 100 != 0) {
		// 		System.out.println("是闰年");
		// 	} else if (year % 400 == 0) {
		// 		System.out.println("是闰年");
		// 	} else {
		// 		System.out.println("不是闰年");
		// 	}
		// } else {
		// 	System.out.println("不是闰年");
		// }

		// 避免if 嵌套,采用逻辑判断更好
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}
}