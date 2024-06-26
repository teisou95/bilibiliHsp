//三元运算符
//表达式1和2需要是能够赋给变量的值,或可以自动转换，或者做强制转换

public class TernaryOperatorDetail {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		double res = a > b ? 1.1 : 3;
		// int res1 = a > b ? 1.1 : 3.4;//错误
		int res1 = (int)(a > b ? 1.1 : 3.4);
		System.out.println("res = " + res);//3.0
		System.out.println("res1 = " + res1);//3

		//三元运算符 底层本质是 if else语句
		// boolean result = a == b ? true : false;
		// System.out.println("result = " + result); 
		boolean result;
		if(a == b){
			result = true;
		}
		else{
			result = false;
		}


	}
}