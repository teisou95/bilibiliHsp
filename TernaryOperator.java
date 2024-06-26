//三元运算符
//条件表达式?表达式1:表达式2
//条件表达式为true，返回表达式1
//为false返回表达式2
//另一个表达式不执行

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;//false 返回b--，且a++不执行
		System.out.println("result = " + result);//99
		System.out.println("a = " + a);//10
		System.out.println("b = " + b);//98
	}
}