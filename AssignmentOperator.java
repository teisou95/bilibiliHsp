//������ֵ����� =
//���ϸ�ֵ����� += -= *= /= %=
//���ϸ�ֵ��������������ת��

public class AssignmentOperator{
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		a += b;//�ȼ��� a = a + b
		System.out.println("a = " + a);
		a -= b;//�ȼ��� a = a - b
		System.out.println("a = " + a);
		a %= 3;//a = a % 3
		System.out.println("a = " + a);

		int n1 = 10;
		n1 += 4;//n1 = n1 + 4
		System.out.println("n1 = " + n1);
		n1 /= 3;//n1 = n1 / 3
		System.out.println("n1 = " + n1);

		byte b1 = 2;
		// b1 = b1 + 3;//����д����int���͸�ֵ��byte
		b1 += 3;//�ȼ��� b1 = (byte)(b1 + 3),�Զ�������ǿ������ת��
		b1 = (byte)(b1 + 6);
		b1++;//�ȼ��� b1 = (byte)(b1 +1)
		System.out.println("b1 = " + b1);


	}
}