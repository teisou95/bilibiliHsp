// ������Թ�����
// 
public class Maze {
	public static void main(String[] args) {
		// �Թ���ͼ
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
		// int[][] map = new int[8][7]; // 8��7��
		// ����,����Ԫ��Ϊ0����û���ϰ���,1�������ϰ���
		// �����ϰ���
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

		// ͼ�λ�����
		int[][] map = {	{1, 1, 1, 1, 1, 1, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 0, 0, 0, 0, 0, 1},
						{1, 1, 1, 0, 0, 0, 1},
						{1, 0, 0, 0, 0, 0, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 0, 0, 0, 1, 0, 1},
						{1, 1, 1, 1, 1, 1, 1}	};


		// ��������
		T t = new T();

		// ��ӡ��ʼ��ͼ
		System.out.println("��ʼ�Թ���ͼ�������:");
		t.printArr(map);
		int distance1 = 0;
		int distance2 = 0;

		// ����1��·
		if (t.findway1(map, 1, 1)) {
			distance1 = t.distance(map);
			System.out.println("����1�ҵ���ͨ·,ͨ·����Ϊ" + distance1);
		} else {
			System.out.println("����1û���ҵ�ͨ·");
		}

		// ���¼��س�ʼ��ͼ
		t.reloadMap(map);

		// ����2��·
		if (t.findway2(map, 1, 1)) {
			distance2 = t.distance(map);
			System.out.println("����2�ҵ���ͨ·,ͨ·����Ϊ" + distance2);
		} else {
			System.out.println("����2û���ҵ�ͨ·");
		}

		t.reloadMap(map);

		// �Ƚϲ�������
		if (distance1 < distance2 && distance1 * distance2 != 0) {
			System.out.println("����1����");
			System.out.println("���ͨ·����:");
			t.findway1(map,1 ,1);
			t.printArr(map);
		} else if (distance2 < distance1 && distance1 * distance2 != 0) {
			System.out.println("����2����");
			System.out.println("���ͨ·����:");
			t.findway2(map,1 ,1);
			t.printArr(map);
		} 

    }
}

class T {
	// ���Թ����� �ݹ����
	// ����trueͨ·,false�����·��ͨ
	// map �ǵ�ǰ�Թ���ͼ,map[i][j]��������ǰ����λ��
	// 0 ����δ�����߹���·,���Գ�����
	// 1 �����ϰ��� ������
	// 2 ������ͨ·,���Լ���
	// 3 ������·,������·
	// ��·����:�� => �� => �� => ��
	public boolean findway1(int[][] map, int i, int j) {
		if (map[6][5] == 2) { // ͨ·һֱ�ҵ����յ�
			return true;
		} else { // ��û�ҵ��յ�
			if (map[i][j] == 0) { // �˵㻹û�߹�,���Գ���
				map[i][j] = 2; // ����ʱ���ͨ·
				if (findway1(map, i + 1, j)) { // ����һ���Ƿ�����ͨ·
					return true;
				} else if (findway1(map, i, j + 1)) {
					return true;
				} else if (findway1(map, i - 1, j)) {
					return true;
				} else if (findway1(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3; // ��2Ϊ3,�����·�����ϼ�
					return false;
				}
			} else { // map[i][j] = 1, 2, 3 ��֮һ,�����ϰ����ѱ��,�����ϼ� 
				return false;
			}
		}
	}


	// �ı����:�� => �� =>�� =>��
	public boolean findway2(int[][] map, int i, int j) {
		if (map[6][5] == 2) { // ͨ·һֱ�ҵ����յ�
			return true;
		} else { // ��û�ҵ��յ�
			if (map[i][j] == 0) { // �˵㻹û�߹�,���Գ���
				map[i][j] = 2; // ����ʱ���ͨ·
				if (findway2(map, i - 1, j)) { // ����һ���Ƿ�����ͨ·
					return true;
				} else if (findway2(map, i + 1, j)) {
					return true;
				} else if (findway2(map, i, j - 1)) {
					return true;
				} else if (findway2(map, i, j + 1)) {
					return true;
				} else {
					map[i][j] = 3; // ��2Ϊ3,�����·�����ϼ�
					return false;
				}
			} else { // map[i][j] = 1, 2, 3 ��֮һ,�����ϰ����ѱ��,�����ϼ� 
				return false;
			}
		}
	}




	// ��ӡ��ά���鷽��
	public void printArr(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");	
			}
			System.out.println();
		}
	}


	// ��ͨ·���ȷ���
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

	// ��ͼ���ݵ���ʼ״̬
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