// ��ҵ5
// 
public class HomeworkP018405 {
	public static void main(String[] args) {
		// �������10������(1-100��Χ)���浽����
		// �����ӡ����ƽ��ֵ,�����ֵ�����ֵ���±�,�����������Ƿ���8
		int[] arr = new int[1000];
		// ���������������������
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// �����ӡ
		System.out.println("====������鵹���ӡ����====");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		// ��ƽ��ֵ
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("\nƽ��ֵ�� " + (double)sum / arr.length);
		// ע��ƽ����Ӧ��ΪС��

		// �����ֵ�����ֵ���±�
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("���ֵ�� " + max);
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				System.out.println("���ֵ��Ӧ�±�Ϊ " + i);
			}
		}

		// ���������Ƿ���8
		int findNum = 8;
		int count = 0; // ����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				System.out.println("�ҵ������� " + findNum);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("������û�� " + findNum);
		} else {
			System.out.println("������" + findNum + "���±�����:");
			int[] numIndex = new int[count];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[i] == findNum) {
					numIndex[j++] = i;
				}
			}

			// ��ӡ�±�����
			for (int i = 0; i < numIndex.length; i++) {
				System.out.print(numIndex[i] + " ");
			}
		}

    }
}