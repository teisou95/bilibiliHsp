// ��Ա���� ϸ��
//
import java.util.Scanner;
public class MethodDetail02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");

		A a1 = new A();
		a1.sayOk();

		B b1 = new B();
		b1.sayHello();

		myScanner.close();

    }
}

class A {
	// ͬһ�����еķ�������ֱ�ӵ���
	//

	public void print(int n) {
		System.out.println("����print����, n = " + n);
	}

	public void sayOk() { // ���������print,����ͬһ��ķ�������,����Ҫ��������
		print(10);
	}

}


class B {
	// ����ķ�������,��Ҫ��������,ͨ������������
	// ����ķ�������,�ͷ����ķ������η��й�
	public void sayHello() {
		A a = new A();
		a.print(2);
	}
}