//变量表示内存中的一个存储区域，类型不同，占用的空间大小不同
//int 4个字节，double 8个字节
//

public class VarDetail {
	//编写main主方法
	public static void main(String[] args) {

		//变量必须先声明后使用
		int a = 20;
		System.out.println(a);

		//变量可以在同一个类型范围内不断变化
		// a = "jack";//错误 不兼容的类型
		a = 50;
		System.out.println(a);

		//变量在同一个作用域内不能重名
		// int a = 1;//错误

	}
}


//变量在不同的作用域可以重名
class Dog {
	//编写main主方法
	public static void main(String[] args) {
		int a = 3;//正确
		System.out.println(a);
	}
}