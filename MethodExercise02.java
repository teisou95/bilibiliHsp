// ��¡���󷽷�
// 
public class MethodExercise02 {
	public static void main(String[] args) {
		Mytools a = new Mytools();

		int[][] array = {{1,2},{1,2,3},{1,2,3,4}};
		a.printArr(array);

		Person p = new Person();
		p.name = "jack";
		p.age = 20;
		// ��¡һ��p1 = p,�������������Ķ���
		Person p1 = a.copyPerson(p);
		// �����֤
		System.out.println("p.name = " + p.name);
		System.out.println("p.age = " + p.age);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
		// ����ͨ���������� hashcode ���Ƿ���ͬһ������
		System.out.println("p ��hashcode = " + p.hashCode());
		System.out.println("p1 ��hashcode = " + p1.hashCode());
		// ����ͨ��"=="�ȽϹ۲�
		System.out.println(p == p1); // false
		// �޸�p1 ����֤
		p1.name = "tom";
		p1.age = 30;
		System.out.println("�޸�p1 ֮��ԭ����p ����:");
		System.out.println("p.name = " + p.name);
		System.out.println("p.age = " + p.age);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);

    }
}

// ��д�� MyTools

class Mytools {
	// ��ӡ��ά���鷽��
	public void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// ��¡Person ���󷽷�
	public Person copyPerson(Person p) {
		Person temp = new Person();
		temp.name = p.name;
		temp.age = p.age;
		return temp;
	}
}

// ��Person
class Person {
	String name;
	int age;
}