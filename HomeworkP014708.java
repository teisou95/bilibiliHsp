// ��ҵ8
// ��ҵ9
// 
public class HomeworkP014708 {
	public static void main(String[] args) {
		// ���1-1/2+1/3-1/4.....1/100�ĺ�
		double sum = 0;
		int max = 100;
		for (int i = 1; i <= max; i++) {
			// ����ż������
			if (i % 2 != 0) {
				sum += 1.0 / i;
			} else {
				sum -= 1.0 / i;
			}
		}
		System.out.println("sum = " + sum);


		// ��1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)�Ľ��
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