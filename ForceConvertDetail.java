//ǿ��ת������ֻ���������Ĳ�������Ч������ʹ��С�����������ȼ�
//char���Ϳ��Ա���int �ĳ���ֵ�������ܱ���int �ı���ֵ����Ҫת��
//byte ��short ���ͽ�������ʱ������int ����


public class ForceConvertDetail {
	//main������
	public static void main(String[] args) {

		// int x = (int)10 * 3.5 + 6 * 1.5;//������������double
		int y = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println("y = " + y);

		char c1 = 120;//ok
		System.out.println(c1);
		int m = 100;
		// char c2 = m;//����
		char c3 = (char)m;//ok
		System.out.println("c3 = " + c3);
 	}
}