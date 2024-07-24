// 汉诺塔
// 
public class HanoiTower {
	public static void main(String[] args) {
		T t = new T(); 
		int n = 3;
		t.move(n, 'A', 'B', 'C');
		
    }
}

class T {
	// 完成汉诺塔
	// 实现n个盘子从 a 移动到 c
	public void move(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println(a + " => " + c);
		// } else if (n == 2) {
		// 	System.out.println(a + " => " + b);
		// 	System.out.println(a + " => " + c);
		// 	System.out.println(b + " => " + c);
		} else {
			move(n - 1, a, c, b); // 实现 n -1 个盘子从 a 移动到 b
			System.out.println(a + " => " + c);
			move(n - 1, b, a, c); // 实现 n - 1 个盘子从 b 移动到c
		}
	} 
}
