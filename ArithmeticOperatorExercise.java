public class ArithmeticOperatorExercise {
	//main����
	public static void main(String[] args) {
		//ǰ׺�����Լ��ͺ�׺�����Լ�
		//��׺�����Լ�java�����ʹ����ʱ����
		//
		int i = 1;
		i = i++;
		//��java����ʹ����ʱ������
		//int temp = i;
		//i++;
		//i = temp;
		System.out.println(i);//1

		int j = 1;
		j = ++j;
		System.out.println(j);//2

		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;
		System.out.println("i3 = " + i3);//10
		System.out.println("ii = " + i1);//11
		i3 = --i2;
		System.out.println("i3 = " + i3);//19
		System.out.println("i2 = " + i2);//19

		//���绹��59��٣��ʺ϶��ٸ������������
		int yasumi = 129;
		int weeks = yasumi / 7;
		int days = yasumi % 7;
		System.out.println(yasumi + "��ٺ�" + weeks + "��������" + days + "��");

		//����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��
		//5/9*�������¶�-100������������¶�234.5��Ӧ�������¶�
		double Fahrenheit = 234.5;
		double degreesCelsius = 5.0 / 9 * (Fahrenheit - 100.0);
		System.out.println("�����¶�" + Fahrenheit + 
			"��Ӧ�������¶���" + degreesCelsius);
	}
}