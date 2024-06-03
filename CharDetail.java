//char常量：用单引号括起来的单个字符 'a' '9' '大'
//转义字符'\'将其后的字符转变为特殊性字符常量 '\n' '\t'
//java中char的本质是一个整数，默认输出的是unicode对应的字符码


public class CharDetail {
	//main主方法
	public static void main(String[] args) {

		char c1 = '5';
		char c2 = 49;
		//使用强制转换可以得到char字符对应的整数
		int n1 = (int) c2;

		System.out.println("c1 = " + c1 + "\nc2 = " + c2 + "\nn1 = " +n1);

		char c3 = '大';
		int n2 = (int) c3;
		char c4 = 22823;
		System.out.println("c3 = " + c3 + "\nn2 = " + n2 + "\nc4 = " + c4);

		//char类型是可以运算的，相当于一个整数
		char c5 = 'a';
		System.out.println(c5 + 10);
		System.out.println('b' + 10);

		//测试
		char c6 = 'b' + 1;//'b'是98，运算结果是99
		System.out.println((int)c6);//输出99
		System.out.println(c6);//输出c--ASCII编码表
	}
}