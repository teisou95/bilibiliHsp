//
// ����ɨ����
import java.util.Scanner;

public class DoWhileExercise02 {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		char koutae = ' ';
		int i = 1;
		do {
			System.out.println("��Ǯ��? ѡ������y��n:");
			koutae = scanner.nextLine().charAt(0);
			
			if (koutae != 'y') {
				System.out.println("Ź��" + i);
			}
			i++;
		} while (koutae != 'y');
    }
}