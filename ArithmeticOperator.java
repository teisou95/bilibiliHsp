//���������
//����ķ��ţ����ڱ�ʾ���ݵ����㡢��ֵ�ͱȽϵ�
/*
	���������
	��ֵ�����
	��ϵ�����/�Ƚ������
	�߼������
	λ������������ƣ�
	��Ԫ�����
*/
//���������������ֵ���͵ı�����������	+ - + - * / %��ȡģ��++ -- +
public class ArithmeticOperator {
	//main����
	public static void main(String[] args) {
		//���� /
		// 10 / 4 == 2
		// 10 / 4.0 == 2.5
		int num1 = 10 / 4;
		double d1 = 10 / 4;
		double d2 = 10.0 / 4;
		double d3 = 10 / 4.0;
		System.out.println(num1);	//2
		System.out.println(d1);		//2.0
		System.out.println(d2);		//2.5
		System.out.println(d3);		//2.5

		//ȡģ��ȡ�ࣩ %
		//java�� % �ı��ʣ� a % b == a - a / b * b
		//�������Ϊȡģ�����������ֻ��ǰ�����������
		System.out.println("\n");
		System.out.println(10 % 3);		//10 - 9 == 1
		System.out.println(-10 % 3);	//-10 - -9 == -1
		System.out.println(10 % -3);	//10 - 9 == 1
		System.out.println(-10 % -3);	//-10 - -9 ==-1

		// ���� ++ 
		//
		System.out.println("\n");
		int i = 10;
		i++;//��Ϊ�������ʹ�ã��� ++i; ��ȫһ�����ȼ��� i = i + 1;
		++i;
		System.out.println("i = " + i);
		/*
		��Ϊ���ʽʹ��
		ǰ++�� ++i ��������ֵ
		��++�� i++ �ȸ�ֵ������
		*/
		int j = 8;
		int k = ++j;//�ȼ��� j = j + 1; int k = j;
		System.out.println("j = " + j);//9
		System.out.println("k = " + k);//9

		int j1 = 8;
		int k1 = j1++;//�ȼ��� int k1 = j1; j1 = j1 + 1;
		System.out.println("j1 = " + j1);//9
		System.out.println("k1 = " + k1);//8

	}
}