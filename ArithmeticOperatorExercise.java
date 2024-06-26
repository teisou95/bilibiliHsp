public class ArithmeticOperatorExercise {
	//main方法
	public static void main(String[] args) {
		//前缀自增自减和后缀自增自减
		//后缀自增自减java程序会使用临时变量
		//
		int i = 1;
		i = i++;
		//按java规则使用临时变量：
		//int temp = i;
		//i++;
		//i = temp;
		System.out.println(i);//1

		int j = 1;
		j = ++j;
		System.out.println(j);//2

		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;
		System.out.println("i3 = " + i3);//10
		System.out.println("ii = " + i1);//11
		i3 = --i2;
		System.out.println("i3 = " + i3);//19
		System.out.println("i2 = " + i2);//19

		//假如还有59天假，问合多少个星期零多少天
		int yasumi = 129;
		int weeks = yasumi / 7;
		int days = yasumi % 7;
		System.out.println(yasumi + "天假合" + weeks + "个星期零" + days + "天");

		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：
		//5/9*（华氏温度-100），求出华氏温度234.5对应的摄氏温度
		double Fahrenheit = 234.5;
		double degreesCelsius = 5.0 / 9 * (Fahrenheit - 100.0);
		System.out.println("华氏温度" + Fahrenheit + 
			"对应的摄氏温度是" + degreesCelsius);
	}
}