// 
// ����ɨ����
import java.util.Scanner;

public class ArrayExercise01 {
	public static void main(String[] args) {
		// ����һ��char ���͵�26��Ԫ�ص�����,�ֱ����'A' - 'Z',ѭ����ӡ

		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		char[] arr = new char[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = (char)('A' + i);
			System.out.print(arr[i] + " ");
		}

		// �ر�ɨ����
		scanner.close();
    }
}