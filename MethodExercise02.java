// 克隆对象方法
// 
public class MethodExercise02 {
	public static void main(String[] args) {
		Mytools a = new Mytools();

		int[][] array = {{1,2},{1,2,3},{1,2,3,4}};
		a.printArr(array);

		Person p = new Person();
		p.name = "jack";
		p.age = 20;
		// 克隆一个p1 = p,但是两个独立的对象
		Person p1 = a.copyPerson(p);
		// 输出验证
		System.out.println("p.name = " + p.name);
		System.out.println("p.age = " + p.age);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
		// 可以通过输出对象的 hashcode 看是否是同一个对象
		System.out.println("p 的hashcode = " + p.hashCode());
		System.out.println("p1 的hashcode = " + p1.hashCode());
		// 可以通过"=="比较观察
		System.out.println(p == p1); // false
		// 修改p1 后验证
		p1.name = "tom";
		p1.age = 30;
		System.out.println("修改p1 之后原来的p 不变:");
		System.out.println("p.name = " + p.name);
		System.out.println("p.age = " + p.age);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);

    }
}

// 编写类 MyTools

class Mytools {
	// 打印二维数组方法
	public void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 克隆Person 对象方法
	public Person copyPerson(Person p) {
		Person temp = new Person();
		temp.name = p.name;
		temp.age = p.age;
		return temp;
	}
}

// 类Person
class Person {
	String name;
	int age;
}