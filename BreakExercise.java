// ������ϰ
// ����ɨ����
import java.util.Scanner;

public class BreakExercise {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("");

		// 1-100���ڵ������,�� �� ��һ�δ���20�ĵ�ǰ��
		int currentNum = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				currentNum = i;
				break;
			}
		}
		System.out.println("currentNum = " + currentNum);
		System.out.println("sum = "+ sum);


		// ʵ�ֵ�¼��֤,��3�λ���,����û���Ϊ"����",����"666"��ʾ��¼�ɹ�
		// ������ʾ���м��λ���
		for (int i = 1; i <= 3; i++) {

			// ��ȡ�û�����
			System.out.println("�������û���:");
			String name = scanner.next();			
			System.out.println("����������:");
			String passWord = scanner.next();

			// �ж�������ȷ��
			// �ַ����ıȽ��� equals ����
			if ("����".equals(name) && "666".equals(passWord)) {
				System.out.println("��¼�ɹ�");
				break; // ��¼�ɹ����˳�ѭ��
			} 
			System.out.println("��¼ʧ��,�㻹��" + (3 - i) + "���������");
		}

		// �ر�ɨ����
		scanner.close();
    }
}