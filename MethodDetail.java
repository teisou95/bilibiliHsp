// ��Ա���� ϸ��
// �������η�(����): public protected Ĭ�� private

// 
import java.util.Scanner;
public class MethodDetail {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		AA a1 = new AA();
		int[] res = a1.getSumAndSub(10, 60);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		

		myScanner.close();

    }
}

class AA {

	// 1. ������������:һ���������ֻ����һ������ֵ,�����Է�������õ����ֵ

	public int[] getSumAndSub(int n1, int n2) {
		// int[] resArr = new int[2];
		// resArr[0] = n1 + n2;
		// resArr[1] = n1 - n2;
		// return resArr;
		return new int[]{n1 + n2, n1 - n2}; // һ�仰д��
	}

	// 2. �������Ϳ�������������,���������������ͺ���������(���������)
	// 3. �������Ҫ���з�����������,�򷽷���������ִ��������Ϊ return ���;
	// 		����Ҫ�󷵻�ֵ���ͱ���� return ��ֵ����һ�»����

	public int f1() {
		// return 100.0; // ����ֵdouble �� int ,����
		char c1 = 'b';
		return c1; // char ����ʽת��Ϊint ����,����

	}

	// 4. ��������� void ,���Բ�д return ,����ֻд return �����������ֵ
	// 5. ������,ʹ���շ�������,Ҫ�к���,����֪��
	// 6. �β��б�,����β���", "���,��������������,���ô������ķ���ʱ,
	//		һ����Ӧ�����б�����ͬ��������͵Ĳ���
	// 7. ��������ʱ�Ĳ����� ��ʽ����,��������ʱ����Ĳ����� ʵ�ʲ���,
	//		ʵ�δ����β�ʱ,��������һ�»����,������˳�����һ��
	// 8. �����ڲ���Ƕ�׶��巽��
}