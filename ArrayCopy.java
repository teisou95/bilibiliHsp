// ��д���� ʵ�����鿽��(���ݸ���)
// ������ջ/Ԫ�������ڶ�
public class ArrayCopy {
	public static void main(String[] args) {
		// ��int[] arr1 = {10, 20, 30};������ arr2 ����
		// Ҫ�����ݿռ��໥����

		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length]; // ����һ���µ����ݿռ�
		for (int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100; // �޸�arr2 ������Ӱ��arr1

		System.out.print("arr1 = ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " "); // 10 20 30
		}
		System.out.print("\narr2 = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " "); // 100 20 30
		}
		
    }
}