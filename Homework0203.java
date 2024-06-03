//保存两本书名，用 + 拼接看效果。
//保存两个性别，用 + 拼接看效果。
//保存两本书价格，用 + 拼接看效果

public class Homework0203 {
	//main主方法
	public static void main(String[] args) {

		String book1 = "三国演义";
		String book2 = "红楼梦";
		System.out.println(book1 + book2);//直接拼接

		//性别应该用char保存
		char gender1 = '男';
		char gender2 = '女';
		System.out.println(gender1 + gender2);//char 变量对应的码值相加运算结果为int

		double nedann1 = 123.56;
		double nedann2 = 100.11;
		System.out.println(nedann1 + nedann2);//double 两个数直接相加
		//注意小数运算输出将出现近似值

 	}
}