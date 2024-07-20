// 练习2

public class ArrayExercise02 {
	public static void main(String[] args) {
		// 求出一个数组 int[] {4, -1, 9, 10, 23} 的最大值,并得到对应的下标

		int[] arrs = {4, -1, 23, 10, 23, 885, 466};
		int max = arrs[0];
		int maxIndex = 0;
		for (int i = 1; i < arrs.length; i++) { // 因为有初始化,可以少比较一次
			if (max < arrs[i]) {
				max = arrs[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值是" + max);
		// System.out.println("第一个出现的最大值对应下标是" + maxIndex);
		// 上述最大值下标方法不能得到多个最大值的情况
		for (int i = 0; i < arrs.length; i++) {
			if (max == arrs[i]) {
				System.out.println("最大值对应下标是" + i);
			}
		}

    }
}