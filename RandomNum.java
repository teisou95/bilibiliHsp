// 
// ����ɨ����
import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {
		// ����ɨ�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ����
		System.out.println("������ϣ�����ɵ�����(����):");
		int targetNum = scanner.nextInt();		
		System.out.println("�������漴��Χ����(����):");
		int randomMin = scanner.nextInt();		
		System.out.println("�������漴��Χ����(����):");
		int randomMax = scanner.nextInt();
		// �������randomMin-randomMax�е�һ������,ֱ��������targetNum�����,ͳ�����ɴ���
		int sum = 0;
		int randomNum;
		do {
			randomNum = (int)(Math.random() * (randomMax - randomMin + 1)) + randomMin;
			sum++;
		} while (randomNum != targetNum);
		System.out.println("���ɴ�����" + sum);
		System.out.println("���ɵ�����" + targetNum);
		

    }
}