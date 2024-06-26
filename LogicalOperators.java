/**
 * 逻辑运算符：用于连接多个条件（多个关系表达式），结果也是一个boolean值
 * 短路与	&&		都true ->true	有flase ->false
 * 短路或	||		有true ->true	都flase ->flase
 * 取反		！		true ->flase	false ->true
 * 逻辑与	&		都true ->true	有flase ->false
 * 逻辑或	|		有true ->true	都flase ->flase
 * 逻辑异或	^		不同 ->true		相同 ->false
 * 逻辑与或	程序运行到最后
 * 短路与或	能判断真假即停止程序，后续语句不再执行
*/

//演示逻辑运算符的使用

public class LogicalOperators {
	//main方法
	public static void main(String[] args) {
		//&& 和 & 的案例演示
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		}

		if (age > 20 & age < 90) {
			System.out.println("ok200");
		}

		//区别
		int a = 4;
		int b = 9;
		// if (a < 1 && ++b < 50) {
		// 	System.out.println("ok300");
		// }
		// System.out.println(b);// a < 1 已经为假，++b不执行，输出9

		if (a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(b);// a < 1 为假，++b 仍然继续执行，输出10
	}
}