// ��Ա���� : �� ����Ϊ
// �� ���� ��Ա����(����) �� ��Ա����(����)
// ������ִ�е�����ʱ,���ڿ���һ��������ջ�ռ�
// ����ִ�����,����ִ�е� return ���ʱ,�ͻ᷵��
// ���ص����÷�����λ��
// ���غ����ִ�з�������Ĵ���
// main ����ִ����Ϻ�,���������˳�
//
import java.util.Scanner;
public class Method01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");
		// ����ʹ��
		// 1. ����д�ú�,���û���κε���,����ִ��
		// 2. �ȴ���һ������,Ȼ������䷽��
		Person p1 = new Person();
		p1.speak(); // ����speak ����
		p1.cal01(); // ����cal01 ����
		p1.cal02(2000); // ����cal02 ����,ͬʱ��n�����β�
		p1.cal02(3000); // �������Զ�ε���
		int returnRes = p1.getSum(12, 25); // ��getSum�������ص�ֵ����returnRes
		System.out.println("getSum�����ķ���ֵΪ " + returnRes);

		myScanner.close();

    }
}

class Person {
	String name;
	int age;
	// ��Ա����
	// public ��ʾ�����ǹ�����
	// void ��ʾ����û�з���ֵ
	// speak �� ������,() �� �β��б�,��ǰû���κ�ֵ,Ŀǰ�ǿ�
	// {} �� ������,����дִ�д���
	// System... ; ��ʾ�����������һ�仰

	public void speak() {
		System.out.println("������ Person�� �еĳ�Ա���� speak");
	}

	public void cal01() {
		// ����1 + ... + 1000�Ľ��
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("������Person �ĳ�Ա���� cal01,��������" + res);
	}

	public void cal02(int n) { 
		// (int n) ���β��б�,��ʾ��ǰ���Դ���һ���β�,���Խ����û�����
		// ����һ����n, ����1~n�ĺ�
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("������ cal02 ����,�������β�" + n + ",��������" + res);
	}

	// int ��ʾ����ִ�к�,����һ�� int 
	// return ��ʾ�� sum ��ֵ����
	public int getSum(int n1, int n2) {
		// �����������ĺ�
		int sum = n1 + n2;
		return sum;
		// System.out.println("������getSum����,�������β�"
		// 					 + n1 + "��" + n2 + ",����" + sum);
	}
}