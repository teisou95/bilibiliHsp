// ����ѭ��Ӧ��ʵ��
// ����ɨ����
import java.util.Scanner;

public class MultiForExercise01 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// 1.ͳ��3����ɼ����,ÿ����5��ͬѧ,����������ƽ���ֺ����а༶��ƽ����
		// 2.ͳ��3���༰������,ÿ����5��ͬѧ
		// 3.��ӡ�žų˷���

		//�ȴ�ӡ�žų˷���
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}

		double allSum = 0;
		int allCount = 0;
		int classNum = 3;
		int stuNum = 5;
		for (int i = 1; i <= classNum; i++) {
			double sum = 0;
			double count = 0;
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("������" + i + "���" + j + "��ͬѧ�ĳɼ�(0-100):");
				double score = scanner.nextDouble();
				sum += score;
				if (score >= 60) {
					count++;
				}
			}
			System.out.println(i + "��ƽ������" + (sum / stuNum));
			System.out.println(i + "����" + count + "λ����");
			allSum += sum;
			allCount += count;
		}
		System.out.println("ȫ���༶��ƽ������" + (allSum /= (stuNum * classNum)));
		System.out.println("ȫ��ͬѧ����" + allCount + "λ����");

    }
}