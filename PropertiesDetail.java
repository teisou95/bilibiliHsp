// ���� ϸ��
// ���Զ���: �������η� �������� ������
// �������η�,�������Եķ��ʷ�Χ: public protected Ĭ�� private
// ���ԵĶ������Ϳ�������������
// �����������ֵ,����Ĭ��ֵ,������һ��
// 
public class PropertiesDetail {
	public static void main(String[] args) {
		// ����Person ����, ��ֵ��p1
		// p1 �Ƕ�������/������
		// new Person() �����Ķ���ռ�(����), ���������Ķ���
		Person p1 = new Person();

		// ���������Ĭ��ֵ,����������� 
		// ������������Ĭ��ֵ�� null
		// char Ĭ��ֵ�ǿ��ַ� \u0000

		System.out.println("��ǰ�˵���Ϣ:");
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