// 作业8
// 作业9
// 
public class HomeworkP014708 {
	public static void main(String[] args) {
		// 求出1-1/2+1/3-1/4.....1/100的和
		double sum = 0;
		int max = 100;
		for (int i = 1; i <= max; i++) {
			// 分奇偶数处理
			if (i % 2 != 0) {
				sum += 1.0 / i;
			} else {
				sum -= 1.0 / i;
			}
		}
		System.out.println("sum = " + sum);


		// 求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)的结果
		int sum1 = 0;
		int max1 = 100;
		for (int i = 1; i <= max1; i++) {
			for (int j = 1; j <= i; j++) {
				sum1 += j;
			}
		}
		System.out.println("sum1 = " + sum1);
    }
}