// 
// 导入扫描器
import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 提示输入
		System.out.println("请输入希望生成的数字(整数):");
		int targetNum = scanner.nextInt();		
		System.out.println("请输入随即范围下限(整数):");
		int randomMin = scanner.nextInt();		
		System.out.println("请输入随即范围上限(整数):");
		int randomMax = scanner.nextInt();
		// 随机生成randomMin-randomMax中的一个整数,直到生成了targetNum这个数,统计生成次数
		int sum = 0;
		int randomNum;
		do {
			randomNum = (int)(Math.random() * (randomMax - randomMin + 1)) + randomMin;
			sum++;
		} while (randomNum != targetNum);
		System.out.println("生成次数是" + sum);
		System.out.println("生成的数是" + targetNum);
		

    }
}