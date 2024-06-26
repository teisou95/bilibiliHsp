//标识符:对各种变量,方法和类等命名时使用的字符序列
//凡是可以自己起名字的都叫标识符
//标识符的命名规则:
//字母大小写,0-9数字,_或$组成
//数字不可以开头
//不能使用关键字(public class static 等)和保留字,但是可以包含关键字和保留字
//java中严格区分字母大小写,长度无限制
//标识符不能包含空格
//java保留字:byValue cast futrue generic inner operator outer rest var goto const

//命名规范:
//包名:多单词构成时,所有字母小写:aaa.bbb.ccc 比如 com.sjda.crm
//类名 接口名 ,所有单词首字母大写:XxxYyyZzz TankShotGame(大驼峰)
//变量名 方法名:第一个字母小写,第二个单词开始每个单词首字母大写:xxxYyyZzz tankShotGame(小驼峰,简称驼峰法)
//常量名:所有字母大写,多单词时用下划线连接:XXX_YYY_ZZZ  TAX_RATE

public class Identifier {
	public static void main(String[] args) {
		int public1 = 1;
		double u$da8 = 2.55;
		
	}
}