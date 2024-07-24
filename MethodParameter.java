// 成员方法传参机制
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
		// 基本数据类型按值传递,值拷贝,形参的任何改变不会影响到实参
		// swap 方法中 a b 虽然交换了,但n1 n2 的值本身不会改变
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		int[] n3 = {50, 32};
		a.swapArr(n3);
		// 数组和对象是引用传递,传递的是地址,可以通过形参影响实参
		// 通过swapArr方法 改变了n3的元素顺序

		System.out.println("n3[0] = " + n3[0]);
		System.out.println("n3[1] = " + n3[1]);

		// 对象
		Person p = new Person();
		p.age = 20;
		p.sal = 1.0;
		a.test200(p);
		System.out.println("p.age = " + p.age);
		System.out.println("p.sal = " + p.sal);

		// 字符串
		// 字符串是不可改变对象,修改后会创建一个新的String对象
		String str = "原来的";
		a.test100(str);
		System.out.println(str);
		myScanner.close();

    }
}

class AA {
	public void swap(int a, int b) {
		//完成两数交换
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
		s1 = "改了";
	}

	public void test200(Person p1) {
		p1 = new Person(); // 新开一个Person 对象
		p1.age = 30;
		p1.sal = 2.5;
		// p1 = null; // 在 test200 方法中将 p1 的引用地址置空

	}
}

class Person {
	int age;
	double sal;
}