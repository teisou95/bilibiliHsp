//��ϰ
//
//����ɨ����
import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);
		
		//1.ʹ��switch��Сд���͵�charתΪ��д.ֻת��a b c d r,������� other
		//��ʾ����
		System.out.println("�����뵥��Сд��ĸ:");
		char c = scan.nextLine().charAt(0);

		switch (c) {
			case 'a' :
				System.out.println('A');
				break;
			case 'b' :
				System.out.println('B');
				break;
			case 'c' :
				System.out.println('C');
				break;
			case 'd' :
				System.out.println('D');
				break;
			case 'e' :
				System.out.println('E');
				break;
			default :
				System.out.println("other");
				break;
		}

		//2.��ѧ���ɼ�����60�ֵ�,����ϸ�.����60�ֵ�,������ϸ�.��ʾ �ɼ�/60
		//��ʾ����
		System.out.println("������ѧ���ɼ�(0-100):");
		double seiseki = scan.nextDouble();

		//ʹ��if-else��֤����ɼ���Ч
		if (seiseki >=0 && seiseki <=100) {
			switch ((int)(seiseki / 60)) {
				case 0 :
					System.out.println("�ɼ����ϸ�");
					break;
				case 1 :
					System.out.println("�ɼ��ϸ�");
					break;
				// ��if-else���Ƶ�����¿��Բ�дdefault��
				// default :
				// 	System.out.println("��������");
				// 	break;
			}
		} else {
			System.out.println("��������");
		}


		//3.��������ָ���·�,��ӡ���·������ļ���.3 4 5����,6 7 8�ļ�,
		//9 10 11�＾,12 1 2����.��ʾ ʹ��case��͸
		//��ʾ����
		System.out.println("�������·�(1-12������):");
		int gatsu = scan.nextInt();

		switch (gatsu) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("����");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("�ļ�");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("�＾");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("����");
				break;
			default :
				System.out.println("�������");
				break;
		}
	}
}