// ����Ķ�̬��ʼ��
// ���������(ʹ��/����/��ȡ����Ԫ��)
// ������(�±�/����/index)
// ����ɨ����
import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {

		// ѭ������ 5 ���ɼ�,������double����,�����

		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// double[] scores = new double[5];
		// ���鴴��Ҳ���Էֿ�������,�������ٴ���
		double[] scores; // ������ʱ���ڴ��л�û�з���ռ�
		scores = new double[5]; // �������ڴ�ռ�,���Դ������,
		// ��ʼ��Ԫ�ص�Ĭ��ֵΪ0.0

		// scores = new double[] {3, 5, 4, 4, 1}; // ����д����ͨ��

		// ��ʾ����
		System.out.println("������5���ɼ�:");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextDouble();
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.println("��" + (i + 1) + "���ɼ���" + scores[i]);
		}

		// �ر�ɨ����
		scanner.close();
    }
}