// for ѭ��ϸ��
// ѭ������һ���Ƿ���һ������ֵ�ı��ʽ
//
// ����ɨ����
import java.util.Scanner;

public class ForDetail {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// for (������ʼ��; ѭ������; ��������){}
		// ��ʼ���ͱ�����������д�������ط�,���ǷֺŲ���ʡ��
		// ��ѭ���ж���ı���������ֻ��ѭ����,ѭ����������ʹ��
		// ѭ��������ʼ��,д��������forѭ���������ܼ���ʹ�ñ���i
		int i1 = 0;
		for (; i1 < 10; ) {
			System.out.println("���" + i1);
			i1++;
		}
		System.out.println("i1 = " + i1);

		// int j = 0;
		// for (;;) {// ��ʾһ������ѭ��,��ѭ��,ctrl + c�˳���ѭ��
		// 	System.out.println("j = " + j);
		// 	j++;
		// }

		// ѭ����ʼֵ�����ж�����ʼ�����,��Ҫ������һ��,�м��ö��Ÿ���
		// ��������Ҳ�����ж���
		int count = 3;
		for (int i = 0, j = 0; i < count; i++,j += 2) {
			System.out.println("i = " + i + "\tj = " + j);
		}
    }
}