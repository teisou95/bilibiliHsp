//�����������ݻ�������ʱ���Զ�����������ת��Ϊ���������������ͣ�Ȼ���ٽ�������
//byte short ��char֮�䲻������Զ�ת��
//byte short ��char ���߿��Լ��㣬����ʱȫ��ת��Ϊint ����(����ͬһ����֮�������)
//boolean������ת��

//�Զ�����ת��ϸ��
public class AutoConvertDetail {
	//main������
	public static void main(String[] args) {

		int n1 = 10;
		float d1 = n1 + 1.1F;
		double d2 = n1 + 1.1;

		int n2 = (int)-1.1;
		System.out.println(n2);

		byte b1 = 10;
		//����10��int���ͣ����ǵ���һ����������ָ�ֵ��byte shortʱ
		//���ж��Ƿ���byte short��Χ�ڣ�����ǾͿ���
		// char c1 = b1;//���� byte�����Զ�ת��Ϊchar
		int n3 = 1;
		// byte b2 = n3;//���� ��������ֵ�������ж�����

		byte b3 = 1;
		short s1 = 1;
		byte b4 = 1;
		// short s2 = b3 + s1;//������������int
		int n4 = b3 + s1;
		// byte b5 = b3 + b4;//������������int
		int n5 = b3 + b4;

		boolean pass = true;
		// int num100 = pass;//����

		//�Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ�������е��������

		byte b5 = 1;
		short s2 = 100;
		int num200 = 1;
		double d3 = 1.1;

		double d4 = b5 + s2 + num200 + d3;//��������double
 	}
}