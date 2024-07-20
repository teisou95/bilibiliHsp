// 作业6
// 
public class HomeworkP018406 {
	public static void main(String[] args) {
		// 测试代码
		char[] arr1 = {'a', 'z', 'b', 'c'};
		char[] arr2 = arr1;
		arr1[2] = '王';

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + "," + arr2[i]);
		}

		/*
			打印结果为:
			a,a
			z,z
			王,王
			c,c
		 */

    }
}