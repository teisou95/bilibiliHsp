//应用案例
//参加歌手比赛,如果初赛成绩大于8.0进入决赛,否则提示淘汰.
//根据性别提示进入男子组或女子组
//输入成绩和性别,进行判断和输出信息

//导入扫描器
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		//创建扫描对象
		Scanner scan = new Scanner(System.in);

		//提示输入
		System.out.println("请输入成绩:");
		double score = scan.nextDouble();

		System.out.println("请输入性别:");
		// String gender = scan.next();
		// char genderChar = gender.charAt(0);
		char genderChar = scan.next().charAt(0);//一句写完

		//判断成绩是否大于8.0
		if (score > 8.0) {
			System.out.print("进入决赛:");
			//判断性别和组别
			if (genderChar == '男') {
				System.out.println("男子组");
			}
			else if (genderChar == '女') {
				System.out.println("女子组");
			}
			else {
				System.out.println("性别输入错误");
			}
		}
		else {
			System.out.println("未进入决赛");
		}

		scan.close();
	}
}