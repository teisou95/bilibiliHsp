// do whileѭ��
// ��ִ�к��ж�,Ҳ����һ��������ִ��һ��
//
// ����ɨ����
//
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ���ʮ����� do while
		int i = 0;
		do {
			System.out.println("do while���" + i);
			i++;
		}while (i < 10);
		System.out.println("��ʱi = " + i);

		// while
		i = 0;
		while (i < 10) {
			System.out.println("while���" + i);
			i++;
		}
		System.out.println("��ʱi = " + i);

		// for
		for (i = 0; i < 10; i++) {
			System.out.println("for���" + i);
		}
		System.out.println("��ʱi = " + i);
		
    }
}