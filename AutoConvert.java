//java程序进行赋值和运算时，精度小的类型自动转换为精度大的类型：自动类型转换
//char => int
//byte => short => int
//int => long => float => double
public class AutoConvert {
	//main主方法
	public static void main(String[] args) {
		//char => int
		int num1 = 'c';//ok
		//int => double
		double d1 = 80;//ok
		System.out.println("num1 = " + num1 + "\nd1 = " + d1);

 	}
}