// ����
// 

public class Array01 {
	public static void main(String[] args) {


		// // ��ͳ˼·���
		// double weight1 = 3.0;
		// double weight2 = 5.0;
		// double weight3 = 1.0;
		// double weight4 = 3.4;
		// double weight5 = 2.0;
		// double weight6 = 50.0;

		// double sum = weight1 + weight2 + weight3 + weight4 + weight5 + weight6;
		// double average = sum / 6.0;

		// System.out.println("sum = " + sum + "\naverage = " + average);

		// ��ͳʵ�ֵ�����,����������������ʵ��,�����ظ�����
		// �����µļ���:����,����һ������
		// ������Դ�Ŷ��ͬһ���͵�����
		// ���鱾��Ҳ��һ����������,����������

		// ����������������

		//1.����һ������:double[] ��ʾ��double���͵�����,
		// 	��������hens,{}�ڲ��������ֵ(Ԫ��)
		double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8,88.8,3 ,4};
		// ����д�� double hens[] ��һ����
		double sum = 0;

		// 2.��������õ����������Ԫ�صĺ�,ʹ��for
		// ͨ�� hens[�±�] �����������Ԫ��,��0��ʼ���
		// ͨ��for ����ѭ�����������Ԫ��
		// ����ͨ�� ������.length �õ�����Ĵ�С(����)
		System.out.println("����ĳ�����" + hens.length);
		for (int i = 0; i < hens.length; i++) {
			System.out.println("hens" + "[" + i + "] = " + hens[i]);
			sum += hens[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("average = " + sum / hens.length);
    }
}