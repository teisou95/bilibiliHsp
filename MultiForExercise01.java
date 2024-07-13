// 多重循环应用实例
// 导入扫描器
import java.util.Scanner;

public class MultiForExercise01 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 1.统计3个班成绩情况,每个班5名同学,求出各个班的平均分和所有班级的平均分
		// 2.统计3个班及格人数,每个班5名同学
		// 3.打印九九乘法表

		//先打印九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}

		double allSum = 0;
		int allCount = 0;
		int classNum = 3;
		int stuNum = 5;
		for (int i = 1; i <= classNum; i++) {
			double sum = 0;
			double count = 0;
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("请输入" + i + "班第" + j + "名同学的成绩(0-100):");
				double score = scanner.nextDouble();
				sum += score;
				if (score >= 60) {
					count++;
				}
			}
			System.out.println(i + "班平均分是" + (sum / stuNum));
			System.out.println(i + "班有" + count + "位及格");
			allSum += sum;
			allCount += count;
		}
		System.out.println("全部班级总平均分是" + (allSum /= (stuNum * classNum)));
		System.out.println("全部同学中有" + allCount + "位及格");

    }
}