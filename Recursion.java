// �����ݹ����
// �ݹ���Ƿ����Լ������Լ�,ÿ�ε���ʱ���벻ͬ�ı���
// ִ��һ������ʱ,�ʹ���һ���µ��ܱ��صĶ����ռ�(ջ�ռ�)
// �����ľֲ�����ʱ������,�����໥Ӱ��
// ���������ʹ�õ����������ͱ���(����/����),�ͻṲ����������͵�����
// �ݹ�������Ƴ��ݹ�������ƽ�,����������޵ݹ�,���� StackOverFlowError
// ��һ������ִ�����,�������� return �ͻ᷵��,����˭����,�ͽ�������ظ�˭
// ���÷���ִ����ϻ����� return,�÷���Ҳ��ִ�����
// 
import java.util.Scanner;
public class Recursion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");
		T t = new T();
		t.test(5);
		/*
			�ݹ����
			test(5)
			n = 5
			5 > 2
				test(4)
				n = 4
				4 > 2
					test(3)
					n = 3
					3 > 2
						test(2)
						2 ������ 2
						��ӡ n = 2
					��ӡ n = 3
				��ӡ n = 4
			��ӡ n = 5

		 */

		int num = 5;
		System.out.println(num + " �Ľ׳��� " + t.factorial(num));
		/*
			��f(5)
			n = 5
			return f(4)*5
				��f(4)
				n = 4
				return f(3)*4
					��f(3)
					n = 3
					return f(2)*3
						��f(2)
						n = 2
						return f(1)*2
							��f(1)
							n = 1
							return 1
						f(2)==1*2
					f(3)==1*2*3
				f(4)==1*2*3*4
			f(5)==1*2*3*4*5
		 */

		myScanner.close();

    }
}

class T {
	// ��2 ��ʼ���
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	// �׳�
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}