//��ʾ | || ��ʹ��
public class LogicalOperators01 {
	public static void main(String[] args) {
		//��ʾ��·�� || �߼��� ||
		int age = 50;
		if (age > 20 || age < 30) {
			System.out.println("ok100");
		}		

		if (age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//��������
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