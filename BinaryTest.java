//整数的四种表示方式:
//二进制:0,1,满2进1,用0b或0B开头表示
//十进制:0-9,满10进1
//八进制:0-7,满8进1,用数字0开头表示
//十六进制:0-9及A-F(或a-f),满16进1,用0x或0X开头表示

public class BinaryTest {
	public static void main(String[] args) {
		int n1 = 0b1010;//二进制
		int n2 = 1010;//十进制
		int n3 = 01010;//八进制
		int n4 = 0x1010;//十六进制
		int n5 = 0xf0d;//十六进制

		//数据在内存中都是二进制形式
		//输出时都是十进制
		System.out.println(n1);//10
		System.out.println(n2);//1010
		System.out.println(n3);//520
		System.out.println(n4);//4112
		System.out.println(n5);//3583
	}
}