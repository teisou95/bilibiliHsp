//char�������õ������������ĵ����ַ� 'a' '9' '��'
//ת���ַ�'\'�������ַ�ת��Ϊ�������ַ����� '\n' '\t'
//java��char�ı�����һ��������Ĭ���������unicode��Ӧ���ַ���


public class CharDetail {
	//main������
	public static void main(String[] args) {

		char c1 = '5';
		char c2 = 49;
		//ʹ��ǿ��ת�����Եõ�char�ַ���Ӧ������
		int n1 = (int) c2;

		System.out.println("c1 = " + c1 + "\nc2 = " + c2 + "\nn1 = " +n1);

		char c3 = '��';
		int n2 = (int) c3;
		char c4 = 22823;
		System.out.println("c3 = " + c3 + "\nn2 = " + n2 + "\nc4 = " + c4);

		//char�����ǿ�������ģ��൱��һ������
		char c5 = 'a';
		System.out.println(c5 + 10);
		System.out.println('b' + 10);

		//����
		char c6 = 'b' + 1;//'b'��98����������99
		System.out.println((int)c6);//���99
		System.out.println(c6);//���c--ASCII�����
	}
}