// ���鸳ֵ����
// ֵ����/��ֵ  �� ���ô���/��ַ����
// jvm���ڴ��з�Ϊ:ջ/��/������
public class ArrayAssign {
	public static void main(String[] args) {
		// �����������͸�ֵ��ʽ:ֵ����
		// n2 �ı仯����Ӱ��n1 ��ֵ
		int n1 = 10;
		int n2 = n1;
		n2 = 50;
		System.out.println("n1 = " + n1); // 10
		System.out.println("n2 = " + n2); // 50

		// ����Ĭ������������ø�ֵ,����ֵ�ǵ�ַ
		// ��ַ����/���ô���
		// arr2�仯��Ӱ�쵽 arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		// arr2 = {1, 1, 2}; //����д��,���³�ʼ����Ҫnew
		arr2[0] = 10;
		System.out.println("arr1[0] = " + arr1[0]); // 10
		System.out.println("arr2[0] = " + arr2[0]); // 10
			
		

    }
}