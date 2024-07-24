// 查找小猫
// 对象[属性(成员变量/field/字段),行为]
// 猫类(Cat)-数据类型,包含属性(name,age,color...),行为(run,cry,eat...)
// 类就是自定义的一种数据类型
// 对象是类所对应的具体数据
// 100 是 int 的一个对象
// 猫对象(具体一只猫)就是猫类所对应的一个具体的实例
// 从类到对象:创建了一个对象/实例化一个对象/把类实例化
// java 最大的特点就是面向对象
// 
// 类是抽象的 概念的,代表一类事物,比如猫类/人类...是一种数据类型
// 对象是具体的 实际的,代表一个具体事物,是实例
// 类是对象的模板,对象是类的一个 个体,对应一个实例
//
import java.util.Scanner;

public class Object01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// 用户输入猫的名字,显示名字/年龄/颜色

		// // 定义小猫信息
		// // 不利于数据管理 效率低
		// String[] names = {"小白", "小花"};
		// int[] ages = {3, 100};
		// String[] colors = {"白色", "花色"};

		// // 提示输入
		// System.out.println("请输入小猫名字:");
		// String name = myScanner.next();
		// boolean matched = false;
		// //
		// for (int i = 0; i < names.length; i++) {
		// 	if (name.equals(names[i])) {
		// 		System.out.println("名字\t年龄\t颜色");
		// 		System.out.println(names[i] + "\t" + ages[i] + "\t" + colors[i]);
		// 		matched = true;
		// 	}
		// }
		// if(!matched) {
		// 	System.out.println("没有这只猫");
		// }


		// 使用OOP(面向对象)解决
		// 实例化一只猫(创建猫对象)
		// 1. new Cat() 创建一只猫
		// 2. 把创建的一只猫赋值给 cat1
		// 3. cat1 是 Cat 类的一个实例化对象
		// 一个对象管理多个属性
		//
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
		//
		// 创建第二只猫并赋值给 cat2
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 12.3;

		// 怎么访问对象的属性
		System.out.println("请输入要查找的小猫名字:");
		String name = myScanner.next();
		if (name.equals(cat1.name)) {
			System.out.println("找到此猫信息如下:" + cat1.name + 
							" " + cat1.age + "岁 " + cat1.color);
		} else if (name.equals(cat2.name)) {
			System.out.println("找到此猫信息如下:" + cat2.name + 
							" " + cat2.age + "岁 " + cat2.color);
		} else {
			System.out.println("没有这只猫");
		}

		myScanner.close();
    }
}

// 使用面向对象的方式解决问题
// 
// 定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	// 属性
	String name; // 名字
	int age; // 年龄
	String color; // 颜色
	double weight;
}