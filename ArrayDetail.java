// 
// ����ɨ����
import java.util.Scanner;

public class ArrayDetail {
	public static void main(String[] args) {
		// �����е�Ԫ�ؿ������κ���������,�����������ͺ���������,���ǲ��ܻ���
		int[] arr1 = {1, 2, 3};
		double[] arr2 = {2, 100, 1.0}; // �Զ�����ת��

		String[] arr3 = {"����","fha","\n"};

		// ���鴴����,���û�и�ֵ,����Ĭ��ֵ
		// int short byte long Ĭ�� 0
		// float double Ĭ�� 0.0
		// char Ĭ�� \u0000
		// boolean Ĭ�� false
		// String Ĭ�� null
		boolean[] arr4 = new boolean[6];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		// �����±������ָ����Χ��ʹ��,����:�±�Խ���쳣
		// �������±�/���� ��С0,��� ���鳤��-1
		int[] arr5 = new int[5];
		// System.out.println(arr5[5]); // ����Խ��

		// ��������������,�����������Ƕ���(object)
    }
}