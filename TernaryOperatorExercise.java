//ʵ�������������ֵ

public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//�������
		double num1 = 3.2;
		int num2 = 950;
		double num3 = .125;

		//�����м�����������������
		double tempMax;
		double max;

		//ÿ�������Ƚ�,�������ֵ
		tempMax = num1 > num2 ? num1 : num2;//�Ƚ�ʱ,int���Զ�����Ϊdouble(��ʱ)
		System.out.println("num2��������: " 
			+ ((Object)num2).getClass().getSimpleName());

		max = num3 > tempMax ? num3 : tempMax;

		//���
		System.out.println("�������" + max);

		//����ʹ��һ�����ʵ��
		max = (num1 > num2 ? num1 : num2) > num3 ?
		 (num1 > num2 ? num1 : num2) : num3;
		System.out.println("�������" + max);

		//�ֲ����������,������Ч�ʸ���
	}
}