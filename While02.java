// 尝试求一定范围内的质数
// 导入扫描器
import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		// 创建扫描对象
		Scanner scanner = new Scanner(System.in);

		// 思路分解:输出全部数字/过滤某个数的倍数/过滤所有数的倍数/变量化
		long i = 10000000000000L;
		long end = 10000000001000L;
		while (i < end) {
			long j = 2L;
			boolean isPrime = true;
			while (j * j < i) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				j++;
			}
			if (isPrime) {
				System.out.println(i);
			}
			i++;
		}
    }
}