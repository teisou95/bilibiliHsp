// ��ӡ������,ʹ��while ѭ��
// ����ɨ����
import java.util.Scanner;

public class StarsWhile {
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

		// ʹ�� while ʵ��
		System.out.println("���������������:");
		int totalLevel = scanner.nextInt();
		int i = 1;
		while (i <= totalLevel) {
			int k = 1;
			while (k <= (totalLevel - i)) {
				System.out.print(" ");
				k++;
			}
			int j = 1;
			while (j <= (2 * i - 1)) {
				if (j == 1 || j == (2 * i - 1) || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}

    }
}