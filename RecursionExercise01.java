// ��ϰ1: 쳲������� 1 1 2 3 5 8 13...
// ��ϰ2: ���ӳ�������
// 
public class RecursionExercise01 {
	public static void main(String[] args) {
		// ��������
		MathTools tool = new MathTools();
		int num = 7;
		int res = tool.fibonacciNumber(num);
		if (res != -1) {
			System.out.println("��" + num + "��쳲���������"+ res);
		}
		
		/*
			ջ����
			-------
			n = 1
			return 1
			-------
			n = 2
			return 1
			-------
			n = 3
			return f(2) + f(1) = 2
			-------
			n = 4
			return f(3) + f(2)
			-------
			n = 5
			return f(4) + f(3)
			-------
		 */


		int day = 10;
		int peach = tool.monkeyEatingPeach(day);
		System.out.println((day - 1) + "��ǰ�����" + peach + "������");

    }
}

// ������
class MathTools {
	// ��������
	public int fibonacciNumber(int n) {
		if (n > 0) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
				// ��������ջ,�����ݹ��ظ�����,���ܽϲ�
 
				// ʹ�� ���� �� for ѭ�������Ż��������
				// int[] fib = new int[n];
				// fib[0] = 1;
				// fib[1] = 1;
				// for (int i = 2; i < n; i++) {
				// 	fib[i] = fib[i - 1] + fib[i - 2];
				// }
				// return fib[n - 1];

				// ѭ����������
				// int fibNum1 = 1;
				// int fibNum2 = 1;
				// int fibNum = 0;
				// for (int i = 2; i < n; i++) {
				//  	fibNum = fibNum1 + fibNum2;
				//  	fibNum1 = fibNum2;
				//  	fibNum2 = fibNum;
				//  } 
				//  return fibNum;
			}
		} else {
			System.out.println("���ݴ���,���봫��������");
			return -1; // �������ݴ���
		}
	}

	// ��һ������,����ÿ������е�һ��+1��
	// ����ʮ�����ٳ�(����û��)ʱ����ֻ��һ��������
	public int monkeyEatingPeach(int day) {
		if (day == 1) {
			return 1;
		} else {
			// �ݹ鷽��
			return (monkeyEatingPeach(day - 1) + 1) * 2;

			// ���鷽��
			// int[] peach = new int[day];
			// peach[0] = 1;
			// for (int i = 1; i < day; i++) {
			// 	peach[i] = (peach[i - 1] + 1) * 2;
			// }
			// return peach[day - 1];

			// ѭ����������
			// int peachs = 1;
			// for (int i  = 1; i < day; i++) {
			// 	peachs = (peachs + 1) * 2;
			// }
			// return peachs;
		}
	}
}
