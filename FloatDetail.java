//�������� ��ʾС��
//������float	4�ֽ�	��Χ -3.403E38~3.403E38
//˫����double	8�ֽ�	��Χ -1.798E308~1.798E308
//�������ڻ����д����ʽ��������=����λ+ָ��λ+β��λ
//β��λ���ܶ�ʧ����ɾ�����ʧ��С�����ǽ���ֵ����


public class FloatDetail {
	//main������
	public static void main(String[] args) {

		//�����ͳ���������ֵ��Ĭ��Ϊdouble���ͣ�����float����Ҫ���f��F
		// float num1 = 1.1;//����1.1��double����
		float num2 = 1.1F;//����Ϊfloat����
		double num3 = 1.1;
		double num4 = 1.1F;//�����1.100000023...����ֵ

		//�����ͳ�����Ϊʮ���ƣ�5.12 5.12F .512���Ϳ�ѧ������(5.12e2 5.12e-2)
		double num5 = .512;//�ȼ�0.512
		double num6 = 5.12e-2;
		double num7 = -5.12E2;
		double num8 = -5.12e-2;
		double num9 = 512.12E5;
		double num10 = -.12E-2;
		double num11 = -985548.203;
		double num12 = 565584995985548.2036543465;

		//ͨ�������ʹ��double
		double num13 = 2.131251515155124;
		float num14 = 2.131251515155124F;

		//������ʹ�����壺2.7 �� 8.1 / 3 �Ƚ�
		double num15 = 2.7;
		double num16 = 8.1 / 3;//3��int���ͣ������б��Զ�ת��Ϊdouble��������
		double num17 = 8.1 / 3.0;//��Ȼ���ؽ���ֵ
		//��Ҫֱ�Ӷ���������С���ļ���ʽ���бȽ�
		//Ӧ�����������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ�ڽ����ж�
		// if(num15 == num16) {
		// 	System.out.println("���");
		// }else{
		// 	System.out.println("�����");
		// }//��������

		if(Math.abs(num15 - num16) < 0.000000001) {
			System.out.println("��ֵ��С����Ϊ���");
		}else{
			System.out.println("�����");
		}//��ȷ��д��,������

		//Math���abs������������java��API����鿴
		System.out.println(Math.abs(num15 - num16));//�����һ����С��С��


		// if(num17 == num16) {
		// 	System.out.println("���");
		// }else{
		// 	System.out.println("�����");
		// }//������

		//������
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		System.out.println(num11);
		System.out.println(num12);
		System.out.println(num13);
		System.out.println(num14);
		System.out.println(num15);
		System.out.println(num16);
		System.out.println(num17);
	}
}