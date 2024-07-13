//分支控制最多只能有一个执行入口
//多分支可以没有else ,如果所有if都不成立,那么一个执行入口都没有
//
//导入扫描器
import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);

		//提示输入信用分
		System.out.println("请输入信用分(整数1-100):");
		int tennsu = scan.nextInt();

		//对输入的数据进行范围的有效判断1-100,否则提示输入错误
		if (tennsu >=1 && tennsu <= 100) {
			//判断分数区间并输出信息
			if (tennsu == 100) {
				System.out.println("信用极好");
			}
			else if (tennsu > 80 && tennsu <= 99) {
				System.out.println("信用优秀");
			}
			else if (tennsu >= 60 && tennsu <= 80) {
				System.out.println("信用一般");
			}
			else {
				System.out.println("信用不及格");
			}
		}
		else {
			System.out.println("输入数据不在1-100范围,请重新输入:");
		}


	}
}