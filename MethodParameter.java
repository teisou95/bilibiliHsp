// ��Ա�������λ���
// 
import java.util.Scanner;
public class MethodParameter {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");

		AA a = new AA();
		int n1 = 50;
		int n2 = 32;
		a.swap(n1, n2);
		// �����������Ͱ�ֵ����,ֵ����,�βε��κθı䲻��Ӱ�쵽ʵ��
		// swap ������ a b ��Ȼ������,��n1 n2 ��ֵ������ı�
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		int[] n3 = {50, 32};
		a.swapArr(n3);
		// ����Ͷ��������ô���,���ݵ��ǵ�ַ,����ͨ���β�Ӱ��ʵ��
		// ͨ��swapArr���� �ı���n3��Ԫ��˳��

		System.out.println("n3[0] = " + n3[0]);
		System.out.println("n3[1] = " + n3[1]);

		// ����
		Person p = new Person();
		p.age = 20;
		p.sal = 1.0;
		a.test200(p);
		System.out.println("p.age = " + p.age);
		System.out.println("p.sal = " + p.sal);

		// �ַ���
		// �ַ����ǲ��ɸı����,�޸ĺ�ᴴ��һ���µ�String����
		String str = "ԭ����";
		a.test100(str);
		System.out.println(str);
		myScanner.close();

    }
}

class AA {
	public void swap(int a, int b) {
		//�����������
		int temp = a;
		a = b;
		b = temp;
	}

	public void swapArr(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	public void test100(String s1) {
		s1 = "����";
	}

	public void test200(Person p1) {
		p1 = new Person(); // �¿�һ��Person ����
		p1.age = 30;
		p1.sal = 2.5;
		// p1 = null; // �� test200 �����н� p1 �����õ�ַ�ÿ�

	}
}

class Person {
	int age;
	double sal;
}