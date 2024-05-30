//每一种数据都定义了明确的数据类型，在内存中分配了不同大小的内存空间（字节）
//java数据类型：
//基本数据类型
//数值型/整数类型：byte(1) short(2) int(4) long(8)
//数值型/浮点型：float(4) double(8)
//字符型：char(2) 存放单个字符 'a'
//布尔型：boolean(1)，存放 true/false

//引用数据类型
//类 class
//接口 interface
//数组 []

//String实际上是一个类

//整数类型使用，用于存放整数值，比如12 30 25489 -95 0 
//整数类型分类范围
//byte[字节]			1字节	-128 ~ 127		-2^7 ~ 2^7-1
//short[短整型]		2字节	-32768~32767	-2^15 ~ 2^15-1
//int[整型]			4字节	-2^31 ~ 2^31-1
//long[长整型]		8字节	-2^63 ~ 2^63-1

//java各整数类型有固定的范围和字段长度，不受具体操作系统的影响，以保证java程序的可移植性
//java程序中常量一般声明为int，除非不够用
//bit是计算机的最小存储单位
//byte[字节]是计算机的基本存储单元
//1byte == 8bit

public class IntDetail {
	//编写main主方法
	public static void main(String[] args) {

		//java的整型常量（具体的值）默认为int 类型，声明long类型常量必须加 l 或 L
		int n1 = 1;//4个字节
		// int n2 = 1L;//把long类型赋给了int,错误
		long n3 = 1L;//此处不加L也可以
		System.out.println(n1 + "\n" + n3);
	
	}
}