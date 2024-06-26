//关系运算符的结果都是boolean型，要么是true，要么是false
//关系运算符经常用在if结构的条件或循环结构的条件语句中
// == != < > <= >= instanceof(检查是否属于类的对象)
// "hdas" instanceof String -> true
public class RelationalOperators {
	//main方法
	public static void main(String[] args) {
		//instanceof 使用
		String s = "yasumi";
		boolean b1 = s instanceof String;
		boolean b2 = "大撒" instanceof String;
		System.out.println(b1);
		System.out.println(b2);

		//关系运算符案例演示
		int a = 9;
		int b = 8;
		//关系运算符组成的表达式，成为关系表达式：如 a > b 
		//关系表达式的结果是一个boolean值

		System.out.println("\n");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		boolean flag = a > b;
		System.out.println("flag = " + flag);
	}
}