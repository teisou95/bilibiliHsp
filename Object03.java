// 类和对象的内存分配机制
// 地址拷贝/地址传递

// java 内存的结构分析
// 1. 栈:一般存放基本数据类型(局部变量)
// 2. 堆:存放对象(包括数组)
// 3. 方法区:常量池(常量,比如字符串),类加载信息
//
// java 创建对象的流程分析
// 1. 先加载类信息(属性和方法信息,只会加载一次)
// 2. 在堆中分配空间,进行默认初始化
// 3. 把对象在堆中的地址赋给对象引用(对象名)
// 4. 进行指定初始化(修改默认值)
//
public class Object03 {
	public static void main(String[] args) {
		// 类加载-创建对象空间-默认初始化-对象引用-指定初始化
		Person a = new Person();
		a.age = 10;
		a.name = "小明";
		Person b;
		b = a;
		System.out.println(b.name); // 小明
		b.age = 200;
		b = null; // b 的地址置空 --> 让b 不再指向任何对象,但是a 保持不变
		System.out.println(a.age); // 200
		// System.out.println(b.age); // 抛出异常


    }
}

class Person {
	String name;
	int age;
}