// 成员方法
// 
// 
import java.util.Scanner;
public class Method02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("");

		// 遍历一个二维数组,输出数组各个元素值
		// 多次相同需求,代码会多次重复,代码修改困难
		// 直接定义一个类 MyTools ,写一个成员方法遍历数组
		
		// 提高了代码的复用性
		// 可以将实现的细节封装起来,供其他用户调用即可
		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
		Mytools t1 = new Mytools();
		t1.printArray(map, 3);
		t1.printArray(map, 1);

		myScanner.close();

    }
}

class Mytools {
	// 方法 接收一个二维数组
	/*	访问控制符 返回数据类型 方法名(形参列表) { //方法体
			执行语句;
			return 返回值;}
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