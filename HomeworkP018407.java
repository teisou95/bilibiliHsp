// ��ҵ7
// 
public class HomeworkP018407 {
	public static void main(String[] args) {
		// ð������
		// 
		int[] arr = new int[20];
		// ����1~100�����������������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// ѭ�������ֵ�����������
		for (int i = 0; i < arr.length - 1; i++) { // ��ѭ�� 9 ��
			boolean swapped = false; // ����Ƿ����˽���
			for (int j = 0; j < arr.length - 1 - i; j++) { 
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break; // �����Ѿ�����,��ǰ�˳�����
			}
		}

		// ��ӡ��������
		System.out.println("====�����������������====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}