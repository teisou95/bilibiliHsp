//ȡ��(�ǲ���) !
//�߼���� ^
//�߼��������ϰ
public class InverseOperators {
	public static void main(String[] args) {
		boolean b = 60 > 20;
		System.out.println(!b);//false
		System.out.println(b);//true

		boolean b1 = (10 > 1) ^ (3 < 5);
		System.out.println(b1);//false

		System.out.println(b ^ b1);//true

		//��ϰ1

		// int x = 5;
		// int y = 5;
		// if (x++ == 6 & ++y == 6) {	//�߼��룬�������������ж�
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//6��6

		// int x = 5;
		// int y = 5;
		// if (x++ == 6 && ++y == 6) {	//��·�룬x++ == 6 Ϊ�٣���䲻ִ��
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//6��5

		// int x = 5;
		// int y = 5;
		// if (x++ == 5 | ++y == 5) {	//�߼����������������ж�
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//11��6

		// int x = 5;
		// int y = 5;
		// if (x++ == 5 || ++y == 5) {	//��·��x++ == 5 Ϊ�棬��䲻ִ��
		// 	x = 11;
		// }
		// System.out.println("x = " + x + "\ny = " + y);//11��5

		//��ϰ2

		boolean x = true;
		boolean y = false;
		short z = 46;
		if ((z++ == 46) && (y = true)) { //y = true �Ǹ�ֵ�������ж�
			z++;
		}
		System.out.println("z = " + z);//48

		if ((x = false) || (++z == 49)) {
			z++;
		}
		System.out.println("z = " + z);//50

		int num = 100;
		int num1 = (num = 3)*4;
		// ��ֵ���� (num = 3) ������һ�����ʽ�������ر���ֵ��ֵ
		System.out.println(num);//3
		System.out.println(num1);//12
	}
}