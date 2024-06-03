//ASCII 	一个字节表示，一个128个字符
//Unicode 	固定2个字节表示字符，浪费空间，兼容ASCII编码
//utf-8 	对Unicode的改良，大小可变，使用1-6和字节表示字符，字母使用1个字节，汉字使用3个字节-
//gbk 		可以表示汉字，范围广，字母使用一个字节，汉字2个字节
//big5		可以存放繁体中文

//布尔类型 boolean 只允许取值true和false，无null
//boolean占1个字节
//boolean类型适用于逻辑运算，一般用于程序流程控制：
//if 循环
//do-while 循环
//for 循环

public class Boolean01 {
	//main主方法
	public static void main(String[] args) {

		//演示判断成绩是否通过的案例
		//java中不可以用整数代替false和true
		//定义一个布尔变量
		// boolean isPass = true;
		boolean isPass = (3 < 1);//(3 < 1) == false
		if(isPass == true){
			System.out.println("考试通过，恭喜");
		}else {
			System.out.println("考试没有通过，下次努力");
		}
		System.out.println(isPass);
	}
}