//演示 | || 的使用
public class LogicalOperators01 {
	public static void main(String[] args) {
		//演示短路或 || 逻辑或 ||
		int age = 50;
		if (age > 20 || age < 30) {
			System.out.println("ok100");
		}		

		if (age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//看看区别
		int a = 4;
		int b = 9;
		// if (a > 1 || ++b > 4 ) {
		// 	System.out.println("ok300");
		// }
		// System.out.println(b);//9		

		if (a > 1 | ++b > 4 ) {
			System.out.println("ok300");
		}
		System.out.println(b);//10

	}
}