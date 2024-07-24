// 对象 细节
// 属性定义: 访问修饰符 属性类型 属性名
// 访问修饰符,控制属性的访问范围: public protected 默认 private
// 属性的定义类型可以是任意类型
// 属性如果不赋值,会有默认值,和数组一样
// 
public class PropertiesDetail {
	public static void main(String[] args) {
		// 创建Person 对象, 赋值给p1
		// p1 是对象引用/对象名
		// new Person() 创建的对象空间(数据), 才是真正的对象
		Person p1 = new Person();

		// 对象的属性默认值,遵守数组规则 
		// 引用数据类型默认值是 null
		// char 默认值是空字符 \u0000

		System.out.println("当前人的信息:");
		System.out.println("age =" + p1.age + " gender = " + p1.gender + 
			" name = " + p1.name + " salary = " + p1.salary + 
			" isPass = " + p1.isPass + "\nkimoqi = " + p1.isGood);

    }
}

class Person {
	int age;
	char gender;
	String name;
	double salary;
	boolean isPass;
	Kimoqi isGood;
}

class Kimoqi {
	char tennki;
	String name;
	int tenn;
}