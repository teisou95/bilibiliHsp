// ����Ԫ�����ݷ�ת
// 
public class ArrayReverse {
	public static void main(String[] args) {
		// ����ֵ
		// int[] arr1 = {11, 22, 33, 44, 55, 66};
		// int[] arr2 = new int[arr1.length];
		// for (int i = 0; i < arr1.length; i++) {
		//  	arr2[i] = arr1[arr1.length - i - 1];
		//  } 
		//  arr1 = arr2; // ��ʱԭ����arr1���ݿռ�û�б�������,�ᱻ��������,����
		//  System.out.print("arr1 = ");
		//  for (int i = 0; i < arr1.length; i++) {
		//  	System.out.print(arr1[i] + " ");
		//  }

		 // ǰ��Ԫ�ؽ���
		 int[] arr1 = {11, 22, 33, 44, 55, 66};
		 for (int i = 0; i < arr1.length / 2; i++) {
		 	int temp = arr1[i];
		 	arr1[i] = arr1[arr1.length - i - 1];
		 	arr1[arr1.length - i - 1] = temp;
		 }
		 System.out.print("arr1 = ");
		 for (int i = 0; i < arr1.length; i++) {
		 	System.out.print(arr1[i] + " ");
		 }
    }
}