// 数组的动态初始化
// 数组的引用(使用/访问/获取数组元素)
// 数组名(下标/索引/index)
// 导入扫描器
import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {

		// 循环输入 5 个成绩,保存至double数组,并输出

		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// double[] scores = new double[5];
		// 数组创建也可以分开成两步,先声明再创建
		double[] scores; // 声明的时候内存中还没有分配空间
		scores = new double[5]; // 分配了内存空间,可以存放数据,
		// 初始化元素的默认值为0.0

		// scores = new double[] {3, 5, 4, 4, 1}; // 这样写可以通过

		// 提示输入
		System.out.println("请输入5个成绩:");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextDouble();
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i + 1) + "个成绩是" + scores[i]);
		}

		// 关闭扫描器
		scanner.close();
    }
}