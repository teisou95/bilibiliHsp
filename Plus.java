//程序中+号的使用
//左右都是数值型时，做加法运算
//左右两边有一方为字符串，做拼接运算

public class Plus {
	//编写main主方法
	public static void main(String[] args) {

		System.out.println(100 + 98);//输出198
		System.out.println("100" + 98);//输出10098

		//运算顺序从左到右
		System.out.println(100 + 3 + "hello");//输出103hello
		System.out.println("hello" + 100 + 3);//输出hello1003

		//char会自动转换为int 参与运算
		System.out.println('h' + 100 + 3);//输出207
		int n1 = 'h';//char可以赋值给int ，自动转换类型
		System.out.println(n1);//输出104
	}
}