// ð������
// 
public class BubbleSort {
	public static void main(String[] args) {
		// ��һ����������,ʹ��ð�������ų�һ����С�������������
		// ð��������ص�:
		// 1.һ������ length - 1 ������,�� n ��������Ե� n �������λ��
		// 2.�������򼴽���
		// 3.ÿһ�ֵıȽϴ����ڼ���
		// 4.�� n ��������Ҫ�Ƚ� length - n ��

		// ��ʼ��һ����������
		int[] arr = {24, 69, 80, 57, 13, 100,21 , 01, 250, -9, 250, 3, 69};

		// ð������
		for (int i = 0; i < arr.length - 1; i++) { // ���ѭ��
			boolean key = false; // ����Ƿ����˽���
			for (int j = 0; j < arr.length - 1 - i ; j++) { // �ڲ�ѭ��
				if (arr[j] > arr[j + 1]) { // ������򽻻�
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					key = true;	// ��Ƿ����˽���
				}
			}
			if (!key) { // �������û�з�������,˵�������Ѿ�����,��ǰ�˳�ѭ��
				break;
			}
		}

		// �������������
		System.out.println("=====����С�������������Ϊ=====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

    }
}