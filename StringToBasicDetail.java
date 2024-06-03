//String -> Basic 时，要确保能够形成有效的数据，"123"可以转为整数，但是"hello"无法转为整数
//格式不正确，就会抛出异常，程序就会终止

/**
 * 演示字符串转基本数据类型的细节
 * 
 */

public class StringToBasicDetail {
	//main主方法
	public static void main(String[] args) {

		String str1 = "123";
		int n1 = Integer.parseInt(str1);
		System.out.println("n1 = " + n1);

		String str2 = "Hello";
		int n2 = Integer.parseInt(str2);//编译没有错，执行抛出异常

 	}
}