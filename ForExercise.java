// ����ɨ����
import java.util.Scanner;

public class ForExercise {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ϰ1.��ӡ1-100֮��������9�ı���������,ͳ�Ƹ������ܺ�
		// ����Ϊ��:�����ӵ�������Ϊ�򵥵�����,�����
		// �������:�ȿ��ǹ̶���ֵ,Ȼ��ת�ɿ������仯��ֵ
		// ����Ϊ��:
		// (1)���1-100��ֵ
		// (2)����Ĺ�����,���й���,ֻ���9�ı���,ʹ��if
		// (3)ͳ�Ƹ���,�������int count = 0,��������ʱcount++;
		// (4)�ܺ�,�������int sum = 0,��������ʱ�ۻ�sum += i;
		// �������:
		// (1)Ϊ����Ӧ���õ�����,�ѷ�Χ�Ŀ�ʼֵ�ͽ���ֵ,���ɱ���
		// (2)�����Ը���һ��,��9Ҳ���ɱ���
		int start = 1;
		int end = 100;
		int t = 9;
		int sum = 0;
		int count = 0;
		System.out.println(start + "-" + end + "֮��" + t + "�ı�������������:");
		for (int i = start; i <= end; i++) {
			if (i % t == 0) {
				System.out.println(i);
				count++;//����
				sum += i;//�ۻ�
			}
			
		}
		System.out.println("��Щ����" + count + "��,���ܺ�Ϊ" + sum);


		// ��ϰ2.��ɱ��ʽ���
		int result = 10;
		for (int i = 0; i <= result; i++) {
			System.out.println(i + "+" + (result - i) + "=" + result);
		}

    }
}