// ����ɨ����
import java.util.Scanner;

public class WhileExercise {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ϰ1.��ӡ1-100֮�������ܱ�3��������
		// ˼·����:��ӡ1-100/���˽��/������
		int i = 1;
		int end = 100;
		int t = 3;
		while (i <= end) {
			if (i % t == 0) {
				System.out.println(i);
			}
			i++;
		}

		// ��ϰ2.��ӡ40-200֮�����е�ż��
		// ˼·����:��ӡ40-200/���˽��/������
		int j = 40;
		int end1 = 200;
		while (j <= end1){
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
    }
}