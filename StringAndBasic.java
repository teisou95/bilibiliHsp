//基本数据类型和String类型的转换
//基本数据类型 -> String:加""即可
//String -> 基本数据类型，通过基本类型的包装类调用parseXX方法

public class StringAndBasic {
	//main主方法
	public static void main(String[] args) {

		//Basic -> String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;

		String str1 = n1 + "";
		String str2 = f1 + "";
		String str3 = d1 + "";
		String str4 = b1 + "";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);


		//String -> Basic
		String str100 = "25";
		String str200 = "21.25";
		String str300 = "421.51";
		String str400 = "\n545ds";//除了"true"之外所有的字符都会提取为false

		//使用基本数据类型对应的包装类的相应方法得到基本数据类型
		int n100 = Integer.parseInt(str100);
		float f100 = Float.parseFloat(str200);
		double d100 = Double.parseDouble(str300);
		boolean b100 = Boolean.parseBoolean(str400);

		System.out.println(n100 + "\n" + f100 + "\n" + d100 + "\n" + b100);

		System.out.println("=======================");
		System.out.println(str100 + 1);//拼接
		System.out.println(n100 + 1);//相加运算

		//String -> char 只能得到String 的其中一个字符
		System.out.println(str400.charAt(4));//索引从0开始

 	}
}