//��Ԫ�����
//���ʽ1��2��Ҫ���ܹ�����������ֵ,������Զ�ת����������ǿ��ת��

public class TernaryOperatorDetail {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		double res = a > b ? 1.1 : 3;
		// int res1 = a > b ? 1.1 : 3.4;//����
		int res1 = (int)(a > b ? 1.1 : 3.4);
		System.out.println("res = " + res);//3.0
		System.out.println("res1 = " + res1);//3

		//��Ԫ����� �ײ㱾���� if else���
		// boolean result = a == b ? true : false;
		// System.out.println("result = " + result); 
		boolean result;
		if(a == b){
			result = true;
		}
		else{
			result = false;
		}


	}
}