//实现三个数的最大值

public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//定义变量
		double num1 = 3.2;
		int num2 = 950;
		double num3 = .125;

		//定义中间变量和最终输出变量
		double tempMax;
		double max;

		//每两个数比较,赋得最大值
		tempMax = num1 > num2 ? num1 : num2;//比较时,int被自动提升为double(临时)
		System.out.println("num2的类型是: " 
			+ ((Object)num2).getClass().getSimpleName());

		max = num3 > tempMax ? num3 : tempMax;

		//输出
		System.out.println("最大数是" + max);

		//尝试使用一条语句实现
		max = (num1 > num2 ? num1 : num2) > num3 ?
		 (num1 > num2 ? num1 : num2) : num3;
		System.out.println("最大数是" + max);

		//分部运算更清晰,且运算效率更高
	}
}