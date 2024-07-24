// 成员方法 细节
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
	// 同一个类中的方法可以直接调用
	//

	public void print(int n) {
		System.out.println("这是print方法, n = " + n);
	}

	public void sayOk() { // 在这里调用print,属于同一类的方法调用,不需要创建对象
		print(10);
	}

}


class B {
	// 跨类的方法调用,需要创建对象,通过对象名调用
	// 跨类的方法调用,和方法的访问修饰符有关
	public void sayHello() {
		A a = new A();
		a.print(2);
	}
}