//�����������
//ʹ��ɨ����(����),����Scanner  Scanner��һ����,���ڴ�������,������������
//������Ҫ����������ڵİ�:	import java.util.Scanner;
//Ȼ�󴴽��������(��������)
//�ٵ�������Ĺ���

//����:�ӿ���̨�����û���Ϣ

import java.util.Scanner;//��java.util�������Scanner�ർ��
public class Input {
	public static void main(String[] args) {
		//1.����Scanner�����ڵİ�
		//2.����Scanner�Ķ���ʵ��
		//myScanner����Scanner��Ķ���

		Scanner myScanner = new Scanner(System.in);

		//3.��ʾ����,ʹ����صķ���
		System.out.println("����������:");
		String name = myScanner.next();
		//next��һ������,�����û������һ�������ַ���,�����ո��س�������
		//Ҳ����ʹ�� .nextLine ������һ�����û�����������
		//����ִ�е�next������,��ȴ��û�����

		System.out.println("����������:");
		int age = myScanner.nextInt();//���������int
		System.out.println("����������:");
		double salary = myScanner.nextDouble();//���������double

		//�������
		System.out.println("�˵���Ϣ����:");
		System.out.println("����\t����\t����\n" + name + "\t" + age + "\t" + salary);
	}
}