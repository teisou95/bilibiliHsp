//�½���ҵ
public class HomeworkP102 {
	public static void main(String[] args) {
		//��ϰ1
		System.out.println(10 / 3);//3
		System.out.println(10 / 5);//2
		System.out.println(10 % 2);//0
		System.out.println(-10.4 % 3);//-1.4�Ľ���ֵ
		//a % b ��a��С��ʱ,��ʽ = a - (int)a / b * b
		System.out.println(-10 % 3);//-1
		System.out.println(10 % 3);//1

		//��ϰ2
		int i = 66;
		System.out.println(++i + i);//134 67+67
		System.out.println(i++ +i);//135  67+68

		//��ϰ3
		// int num1 = (int)"18";//��,��������
		int num1 = Integer.parseInt("18");

		// int num2 = 18.0;//��,��������
		double num2 = 18.0;

		double num3 = 3d;//��
		double num4 = 8;//��

		int num5 = 48;//��
		// char ch = num5 + 1;//��,��������
		char ch = 48 + 1;
		System.out.println("ch = " + ch);

		byte b = 19;//��
		// short s = b + 2;//��,��������
		short s = (short)(b + 2);

		//��ϰ4
		String s1 = "2225.612";
		double d1 = Double.parseDouble(s1);
		char c1 = 'G';
		String s2 = c1 + ""; 
		System.out.println("s1 = " + s1);
		System.out.println("d1 = " + d1);
		System.out.println("c1 = " + c1);
		System.out.println("s2 = " + s2);

	}
}
