//������+�ŵ�ʹ��
//���Ҷ�����ֵ��ʱ�����ӷ�����
//����������һ��Ϊ�ַ�������ƴ������

public class Plus {
	//��дmain������
	public static void main(String[] args) {

		System.out.println(100 + 98);//���198
		System.out.println("100" + 98);//���10098

		//����˳�������
		System.out.println(100 + 3 + "hello");//���103hello
		System.out.println("hello" + 100 + 3);//���hello1003

		//char���Զ�ת��Ϊint ��������
		System.out.println('h' + 100 + 3);//���207
		int n1 = 'h';//char���Ը�ֵ��int ���Զ�ת������
		System.out.println(n1);//���104
	}
}