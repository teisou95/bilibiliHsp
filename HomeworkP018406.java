// ��ҵ6
// 
public class HomeworkP018406 {
	public static void main(String[] args) {
		// ���Դ���
		char[] arr1 = {'a', 'z', 'b', 'c'};
		char[] arr2 = arr1;
		arr1[2] = '��';

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + "," + arr2[i]);
		}

		/*
			��ӡ���Ϊ:
			a,a
			z,z
			��,��
			c,c
		 */

    }
}