// ��ҵ5 �Ķ���������
// ��ҵ6
//
public class HomeworkP014706 {
	public static void main(String[] args) {
		// ���1-100֮�䲻�ܱ�5��������,ÿ5����һ��
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
    }
}