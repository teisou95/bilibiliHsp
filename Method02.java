// ��Ա����
// 
// 
import java.util.Scanner;
public class Method02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");

		// ����һ����ά����,����������Ԫ��ֵ
		// �����ͬ����,��������ظ�,�����޸�����
		// ֱ�Ӷ���һ���� MyTools ,дһ����Ա������������
		
		// ����˴���ĸ�����
		// ���Խ�ʵ�ֵ�ϸ�ڷ�װ����,�������û����ü���
		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
		Mytools t1 = new Mytools();
		t1.printArray(map, 3);
		t1.printArray(map, 1);

		myScanner.close();

    }
}

class Mytools {
	// ���� ����һ����ά����
	/*	���ʿ��Ʒ� ������������ ������(�β��б�) { //������
			ִ�����;
			return ����ֵ;}
	 */ 
	public void printArray(int[][] map, int n) {
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}