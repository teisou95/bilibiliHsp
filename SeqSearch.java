// ˳�����
// ����ɨ����
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		// ��������������һ������,�ж��������Ƿ����������
		// ����ҵ���,����ʾ�ҵ�,�������±�ֵ

		// ����ɨ�����
		Scanner myScanner = new Scanner(System.in);

		// ��ʼ������
		String[] names = {"��ëӥ��", "��ëʨ��", "��������", "��������"};

		// ��ʾ����
		System.out.println("������һ������:");
		String nameInput = myScanner.next();
		boolean found = false;

		for (int i = 0; i < names.length; i++) {
			if (nameInput.equals(names[i])) {
				System.out.println("�ҵ���,�±�Ϊ" + i);
				found = true; // ����ҵ���
				break;
			}
			
		}
		if (!found) {
			System.out.println("��������û�ҵ�");
		}

		// �ر�ɨ����
		myScanner.close();
    }
}