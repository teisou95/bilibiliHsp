// ��ϰ2

public class ArrayExercise02 {
	public static void main(String[] args) {
		// ���һ������ int[] {4, -1, 9, 10, 23} �����ֵ,���õ���Ӧ���±�

		int[] arrs = {4, -1, 23, 10, 23, 885, 466};
		int max = arrs[0];
		int maxIndex = 0;
		for (int i = 1; i < arrs.length; i++) { // ��Ϊ�г�ʼ��,�����ٱȽ�һ��
			if (max < arrs[i]) {
				max = arrs[i];
				maxIndex = i;
			}
		}
		System.out.println("���ֵ��" + max);
		// System.out.println("��һ�����ֵ����ֵ��Ӧ�±���" + maxIndex);
		// �������ֵ�±귽�����ܵõ�������ֵ�����
		for (int i = 0; i < arrs.length; i++) {
			if (max == arrs[i]) {
				System.out.println("���ֵ��Ӧ�±���" + i);
			}
		}

    }
}