// 
// 
public class Object02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "wang";
		System.out.println(car1.name);
    }
}

class Car {
	String name; // ����,��Ա����,�ֶ�,field
	double price;
	String color;
	String[] master; // ���Կ����ǻ�����������,Ҳ��������������(����(�������ʵ��),����)
}