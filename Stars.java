// ��ӡ������,ʹ��for ѭ��
// ����ɨ���� 0136
import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��д����ʵ��:���Խ���һ������,��ʾ����(totalLevel),��ӡ��������
		/**
		 * ��ӡ����
*****
*****
*****
*****
*****

		 * ��߽�����
*		1
**		2
***		3
****	4
*****	5
		
		 * ����������
*			1
***			3
*****		5
*******		7
*********	9
		
		 * ������״
    *		4	1
   ***		3 	3
  *****		2	5
 *******	1 	7
*********	0 	9
		
		 * ��ɿ���
    *		4	1
   * *		3 	3
  *   *		2	5
 *     *	1 	7
*********	0 	9
		
		 * �������
		 */

		//��ʾ����
		System.out.println("���������������:");
		int totalLevel = scanner.nextInt();
		for (int i = 1; i <= totalLevel; i++) {
			for (int k = 1; k <= (totalLevel - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

    }
}