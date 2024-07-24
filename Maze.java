// 老鼠出迷宫问题
// 
public class Maze {
	public static void main(String[] args) {
		// 迷宫地图
		/*
			1 1 1 1 1 1 1
			1 0 0 0 0 0 1
			1 0 0 0 0 0 1
			1 1 1 0 0 0 1
			1 0 0 0 0 0 1
			1 0 0 0 0 0 1
			1 0 0 0 0 0 1
			1 1 1 1 1 1 1
		 */
		// int[][] map = new int[8][7]; // 8行7列
		// 定义,数组元素为0代表没有障碍物,1代表有障碍物
		// 设置障碍物
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		if (i == 0 || i == map.length - 1 || 
		// 			j == 0 || j == map[i].length - 1) {
		// 			map[i][j] = 1;
		// 		}
		// 		map[3][1] = 1;
		// 		map[3][2] = 1;
		// 	}
		// }

		// 图形化设置
		int[][] map = {	{1, 1, 1, 1, 1, 1, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 0, 0, 0, 0, 0, 1},
						{1, 1, 1, 0, 0, 0, 1},
						{1, 0, 0, 0, 0, 0, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 1, 1, 1, 1, 1, 1}	};


		// 创建对象
		T t = new T();

		// 打印初始地图
		System.out.println("初始迷宫地图情况如下:");
		t.printArr(map);
		int distance1 = 0;
		int distance2 = 0;

		// 策略1找路
		if (t.findway1(map, 1, 1)) {
			distance1 = t.distance(map);
			System.out.println("策略1找到了通路,通路长度为" + distance1);
		} else {
			System.out.println("策略1没有找到通路");
		}

		// 重新加载初始地图
		t.reloadMap(map);

		// 策略2找路
		if (t.findway2(map, 1, 1)) {
			distance2 = t.distance(map);
			System.out.println("策略2找到了通路,通路长度为" + distance2);
		} else {
			System.out.println("策略2没有找到通路");
		}

		t.reloadMap(map);

		// 比较策略优劣
		if (distance1 < distance2 && distance1 * distance2 != 0) {
			System.out.println("策略1更优");
			System.out.println("最短通路如下:");
			t.findway1(map,1 ,1);
			t.printArr(map);
		} else if (distance2 < distance1 && distance1 * distance2 != 0) {
			System.out.println("策略2更优");
			System.out.println("最短通路如下:");
			t.findway2(map,1 ,1);
			t.printArr(map);
		} 

    }
}

class T {
	// 出迷宫方法 递归回溯
	// 返回true通路,false代表此路不通
	// map 是当前迷宫地图,map[i][j]代表老鼠当前所处位置
	// 0 代表未尝试走过的路,可以尝试走
	// 1 代表障碍物 不能走
	// 2 代表是通路,可以继续
	// 3 代表死路,结束找路
	// 找路策略:下 => 右 => 上 => 左
	public boolean findway1(int[][] map, int i, int j) {
		if (map[6][5] == 2) { // 通路一直找到了终点
			return true;
		} else { // 还没找到终点
			if (map[i][j] == 0) { // 此点还没走过,可以尝试
				map[i][j] = 2; // 先暂时标记通路
				if (findway1(map, i + 1, j)) { // 看下一点是否属于通路
					return true;
				} else if (findway1(map, i, j + 1)) {
					return true;
				} else if (findway1(map, i - 1, j)) {
					return true;
				} else if (findway1(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3; // 改2为3,标记死路返回上级
					return false;
				}
			} else { // map[i][j] = 1, 2, 3 中之一,则是障碍或已标记,返回上级 
				return false;
			}
		}
	}


	// 改变策略:右 => 下 =>左 =>上
	public boolean findway2(int[][] map, int i, int j) {
		if (map[6][5] == 2) { // 通路一直找到了终点
			return true;
		} else { // 还没找到终点
			if (map[i][j] == 0) { // 此点还没走过,可以尝试
				map[i][j] = 2; // 先暂时标记通路
				if (findway2(map, i - 1, j)) { // 看下一点是否属于通路
					return true;
				} else if (findway2(map, i + 1, j)) {
					return true;
				} else if (findway2(map, i, j - 1)) {
					return true;
				} else if (findway2(map, i, j + 1)) {
					return true;
				} else {
					map[i][j] = 3; // 改2为3,标记死路返回上级
					return false;
				}
			} else { // map[i][j] = 1, 2, 3 中之一,则是障碍或已标记,返回上级 
				return false;
			}
		}
	}




	// 打印二维数组方法
	public void printArr(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");	
			}
			System.out.println();
		}
	}


	// 求通路长度方法
	public int distance(int[][] map) {
		int count = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 2) {
					count++;
				}
			}
		}
		return count;
	}

	// 地图回溯到初始状态
	public void reloadMap(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 2 || map[i][j] == 3) {
					map[i][j] = 0;
				}
			}
		}
	}
}