//浮点类型 表示小数
//单精度float	4字节	范围 -3.403E38~3.403E38
//双精度double	8字节	范围 -1.798E308~1.798E308
//浮点数在机器中存放形式：浮点数=符号位+指数位+尾数位
//尾数位可能丢失，造成精度损失（小数都是近似值）。


public class FloatDetail {
	//main主方法
	public static void main(String[] args) {

		//浮点型常量（具体值）默认为double类型，声明float类型要后加f或F
		// float num1 = 1.1;//错误，1.1是double类型
		float num2 = 1.1F;//声明为float类型
		double num3 = 1.1;
		double num4 = 1.1F;//输出了1.100000023...近似值

		//浮点型常量分为十进制（5.12 5.12F .512）和科学计数法(5.12e2 5.12e-2)
		double num5 = .512;//等价0.512
		double num6 = 5.12e-2;
		double num7 = -5.12E2;
		double num8 = -5.12e-2;
		double num9 = 512.12E5;
		double num10 = -.12E-2;
		double num11 = -985548.203;
		double num12 = 565584995985548.2036543465;

		//通常情况下使用double
		double num13 = 2.131251515155124;
		float num14 = 2.131251515155124F;

		//浮点数使用陷阱：2.7 和 8.1 / 3 比较
		double num15 = 2.7;
		double num16 = 8.1 / 3;//3是int类型，计算中被自动转换为double参与运算
		double num17 = 8.1 / 3.0;//仍然返回近似值
		//不要直接对运算结果是小数的计算式进行比较
		//应该以两个数的差值的绝对值，在某个精度范围内进行判断
		// if(num15 == num16) {
		// 	System.out.println("相等");
		// }else{
		// 	System.out.println("不相等");
		// }//输出不相等

		if(Math.abs(num15 - num16) < 0.000000001) {
			System.out.println("差值极小，认为相等");
		}else{
			System.out.println("不相等");
		}//正确的写法,输出相等

		//Math类的abs方法，可以在java的API里面查看
		System.out.println(Math.abs(num15 - num16));//输出了一个极小的小数


		// if(num17 == num16) {
		// 	System.out.println("相等");
		// }else{
		// 	System.out.println("不相等");
		// }//输出相等

		//输出语句
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		System.out.println(num11);
		System.out.println(num12);
		System.out.println(num13);
		System.out.println(num14);
		System.out.println(num15);
		System.out.println(num16);
		System.out.println(num17);
	}
}