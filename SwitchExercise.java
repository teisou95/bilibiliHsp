//练习
//
//导入扫描器
import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);
		
		//1.使用switch把小写类型的char转为大写.只转换a b c d r,其他输出 other
		//提示输入
		System.out.println("请输入单个小写字母:");
		char c = scan.nextLine().charAt(0);

		switch (c) {
			case 'a' :
				System.out.println('A');
				break;
			case 'b' :
				System.out.println('B');
				break;
			case 'c' :
				System.out.println('C');
				break;
			case 'd' :
				System.out.println('D');
				break;
			case 'e' :
				System.out.println('E');
				break;
			default :
				System.out.println("other");
				break;
		}

		//2.对学生成绩大于60分的,输出合格.低于60分的,输出不合格.提示 成绩/60
		//提示输入
		System.out.println("请输入学生成绩(0-100):");
		double seiseki = scan.nextDouble();

		//使用if-else保证输入成绩有效
		if (seiseki >=0 && seiseki <=100) {
			switch ((int)(seiseki / 60)) {
				case 0 :
					System.out.println("成绩不合格");
					break;
				case 1 :
					System.out.println("成绩合格");
					break;
				// 有if-else控制的情况下可以不写default了
				// default :
				// 	System.out.println("输入有误");
				// 	break;
			}
		} else {
			System.out.println("输入有误");
		}


		//3.根据用于指定月份,打印该月份所属的季节.3 4 5春季,6 7 8夏季,
		//9 10 11秋季,12 1 2冬季.提示 使用case穿透
		//提示输入
		System.out.println("请输入月份(1-12的整数):");
		int gatsu = scan.nextInt();

		switch (gatsu) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春季");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏季");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋季");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬季");
				break;
			default :
				System.out.println("输入错误");
				break;
		}
	}
}