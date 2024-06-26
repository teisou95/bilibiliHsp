//基本赋值运算符 =
//复合赋值运算符 += -= *= /= %=
//复合赋值运算符会进行类型转换

public class AssignmentOperator{
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		a += b;//等价于 a = a + b
		System.out.println("a = " + a);
		a -= b;//等价于 a = a - b
		System.out.println("a = " + a);
		a %= 3;//a = a % 3
		System.out.println("a = " + a);

		int n1 = 10;
		n1 += 4;//n1 = n1 + 4
		System.out.println("n1 = " + n1);
		n1 /= 3;//n1 = n1 / 3
		System.out.println("n1 = " + n1);

		byte b1 = 2;
		// b1 = b1 + 3;//错误写法，int类型赋值给byte
		b1 += 3;//等价于 b1 = (byte)(b1 + 3),自动进行了强制类型转换
		b1 = (byte)(b1 + 6);
		b1++;//等价于 b1 = (byte)(b1 +1)
		System.out.println("b1 = " + b1);


	}
}