// break ϸ��
// ����ɨ����
import java.util.Scanner;

public class BreakDetail {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		// break �������ڶ��Ƕ�׵�����ʱ,����ͨ����ǩָ��Ҫ��ֹ������һ������
		// ���û��ָ�� break label;Ĭ���˳������ѭ����

		abc1:
		for (int j = 0; j < 4; j++) {
			abc2:
			for (int i = 0; i < 10; i++) {
				if (i == 2) {
					// break; // �ȼ��� break abc2;
					break abc1;
				}
				System.out.println("i = " + i);
			}
		}
    }
}