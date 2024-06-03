//char字符类型，表示单个字符，2个字节（可以存放汉字）
//字符在存储空间的本质是数字
//多个字符使用String

public class Char01 {
	//main主方法
	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = '\n';
		char c3 = '防';
		char c4 = 97;//字符类型可以直接存放数字

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);//输出时会输出97这个数字表示的字符--编码

		System.out.println(c1 + "\t" + c2 + "\t" +  c3 + "\t" +  c4);

		int n1 = (int) '\n';
		System.out.println("n1 = " + n1);
	}
}