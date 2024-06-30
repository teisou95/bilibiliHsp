//章节作业
public class HomeworkP102 {
	public static void main(String[] args) {
		//练习1
		System.out.println(10 / 3);//3
		System.out.println(10 / 5);//2
		System.out.println(10 % 2);//0
		System.out.println(-10.4 % 3);//-1.4的近似值
		//a % b 当a是小数时,公式 = a - (int)a / b * b
		System.out.println(-10 % 3);//-1
		System.out.println(10 % 3);//1

		//练习2
		int i = 66;
		System.out.println(++i + i);//134 67+67
		System.out.println(i++ +i);//135  67+68

		//练习3
		// int num1 = (int)"18";//错,改正如下
		int num1 = Integer.parseInt("18");

		// int num2 = 18.0;//错,改正如下
		double num2 = 18.0;

		double num3 = 3d;//对
		double num4 = 8;//对

		int num5 = 48;//对
		// char ch = num5 + 1;//错,改正如下
		char ch = 48 + 1;
		System.out.println("ch = " + ch);

		byte b = 19;//对
		// short s = b + 2;//错,改正如下
		short s = (short)(b + 2);

		//练习4
		String s1 = "2225.612";
		double d1 = Double.parseDouble(s1);
		char c1 = 'G';
		String s2 = c1 + ""; 
		System.out.println("s1 = " + s1);
		System.out.println("d1 = " + d1);
		System.out.println("c1 = " + c1);
		System.out.println("s2 = " + s2);

	}
}
