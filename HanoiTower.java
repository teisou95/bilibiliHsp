// ��ŵ��
// 
public class HanoiTower {
	public static void main(String[] args) {
		T t = new T(); 
		int n = 3;
		t.move(n, 'A', 'B', 'C');
		
    }
}

class T {
	// ��ɺ�ŵ��
	// ʵ��n�����Ӵ� a �ƶ��� c
	public void move(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println(a + " => " + c);
		// } else if (n == 2) {
		// 	System.out.println(a + " => " + b);
		// 	System.out.println(a + " => " + c);
		// 	System.out.println(b + " => " + c);
		} else {
			move(n - 1, a, c, b); // ʵ�� n -1 �����Ӵ� a �ƶ��� b
			System.out.println(a + " => " + c);
			move(n - 1, b, a, c); // ʵ�� n - 1 �����Ӵ� b �ƶ���c
		}
	} 
}
