// 
// ����ɨ����
import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		/*
			��ӡ��������
			�ո� 	������	����
    *		4		1		1	
   * *		3		3		2
  *   *		2		5		3
 *     *	1		7		4
*       *	0		9		5
 *     *	1		7		6
  *   *		2		5		7
   * *		3		3		8
    *		4		1		9

		*/
		// ��ʾ����
		System.out.println("���������εĲ���(����):");
		int totalLevel = scanner.nextInt();
		// У������
		while (totalLevel % 2 == 0) {
			System.out.println("�������,������һ������:");
			totalLevel = scanner.nextInt();
		}

		int level = (totalLevel + 1) / 2;

		for (int i = 1; i <= totalLevel; i++) {
			// ��ӡǰ��Ŀո�
			for (int j = 1; j <= Math.abs(level - i); j++) {
				System.out.print(" ");
			}

			// ��ӡ�м䲿��
			for (int k = 1; k <= (totalLevel - 2 * Math.abs(level - i)); k++) {
				// ��ӡ����
				if (k == 1 || k == (totalLevel - 2 * Math.abs(level - i))) {
					System.out.print("*");
				} else { // ��ӡ���Ŀո�
					System.out.print(" ");
				}
			}
			System.out.println();

		}
    }
}