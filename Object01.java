// ����Сè
// ����[����(��Ա����/field/�ֶ�),��Ϊ]
// è��(Cat)-��������,��������(name,age,color...),��Ϊ(run,cry,eat...)
// ������Զ����һ����������
// ������������Ӧ�ľ�������
// 100 �� int ��һ������
// è����(����һֻè)����è������Ӧ��һ�������ʵ��
// ���ൽ����:������һ������/ʵ����һ������/����ʵ����
// java �����ص�����������
// 
// ���ǳ���� �����,����һ������,����è��/����...��һ����������
// �����Ǿ���� ʵ�ʵ�,����һ����������,��ʵ��
// ���Ƕ����ģ��,���������һ�� ����,��Ӧһ��ʵ��
//
import java.util.Scanner;

public class Object01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// �û�����è������,��ʾ����/����/��ɫ

		// // ����Сè��Ϣ
		// // ���������ݹ��� Ч�ʵ�
		// String[] names = {"С��", "С��"};
		// int[] ages = {3, 100};
		// String[] colors = {"��ɫ", "��ɫ"};

		// // ��ʾ����
		// System.out.println("������Сè����:");
		// String name = myScanner.next();
		// boolean matched = false;
		// //
		// for (int i = 0; i < names.length; i++) {
		// 	if (name.equals(names[i])) {
		// 		System.out.println("����\t����\t��ɫ");
		// 		System.out.println(names[i] + "\t" + ages[i] + "\t" + colors[i]);
		// 		matched = true;
		// 	}
		// }
		// if(!matched) {
		// 	System.out.println("û����ֻè");
		// }


		// ʹ��OOP(�������)���
		// ʵ����һֻè(����è����)
		// 1. new Cat() ����һֻè
		// 2. �Ѵ�����һֻè��ֵ�� cat1
		// 3. cat1 �� Cat ���һ��ʵ��������
		// һ���������������
		//
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;
		//
		// �����ڶ�ֻè����ֵ�� cat2
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 12.3;

		// ��ô���ʶ��������
		System.out.println("������Ҫ���ҵ�Сè����:");
		String name = myScanner.next();
		if (name.equals(cat1.name)) {
			System.out.println("�ҵ���è��Ϣ����:" + cat1.name + 
							" " + cat1.age + "�� " + cat1.color);
		} else if (name.equals(cat2.name)) {
			System.out.println("�ҵ���è��Ϣ����:" + cat2.name + 
							" " + cat2.age + "�� " + cat2.color);
		} else {
			System.out.println("û����ֻè");
		}

		myScanner.close();
    }
}

// ʹ���������ķ�ʽ�������
// 
// ����һ��è�� Cat -> �Զ������������
class Cat {
	// ����
	String name; // ����
	int age; // ����
	String color; // ��ɫ
	double weight;
}