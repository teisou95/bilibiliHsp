//这是java的快速入门，演示java的开发步骤
//对代码的相关说明
//1.public class Hello 表示Hello是一个类，是一个public共有的类
//2.Hello{}表示一个类的开始和结束
//3.public static void main(String[] args)表示一个主方法，即我们程序的入口
//4.main(){}表示方法的开始和结束
//5.System.out.println("Hello world");表示输出"Hello world"到屏幕
//6. ;表示语句结束
public class Hello {
	//编写一个main方法
	public static void main(String[] args) {
		//输入hello world
		System.out.println("Hello World");
		// System.out.println("Tei Sou is studying java!");
	}
}

//一个源文件中最多只能有一个public类，但其他类的个数不限
//Dog是一个类
//编译后，每一个类，都对应一个.class文件（可执行文件）
//也可以在非public类中写main方法
//然后指定运行非public类，这样入口就是非public类中的main方法


class Dog{
	public static void main(String[] args){
		System.out.println("这是Dog类");
	}
}

class Tiger{
		public static void main(String[] args){
		System.out.println("这是Tiger类");
	}
}