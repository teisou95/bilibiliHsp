// 顺序查找
// 导入扫描器
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		// 键盘中任意输入一个名称,判断数组中是否包含此名称
		// 如果找到了,就提示找到,并给出下标值

		// 创建扫描对象
		Scanner myScanner = new Scanner(System.in);

		// 初始化数组
		String[] names = {"白毛鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};

		// 提示输入
		System.out.println("请输入一个名称:");
		String nameInput = myScanner.next();
		boolean found = false;

		for (int i = 0; i < names.length; i++) {
			if (nameInput.equals(names[i])) {
				System.out.println("找到了,下标为" + i);
				found = true; // 标记找到了
				break;
			}
			
		}
		if (!found) {
			System.out.println("遍历结束没找到");
		}

		// 关闭扫描器
		myScanner.close();
    }
}