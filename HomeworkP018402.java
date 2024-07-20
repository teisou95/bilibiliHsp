// 作业2
// 
public class HomeworkP018402 {
	public static void main(String[] args) {
		// 写出结果
		String foo = "blue";
		boolean[] bar = new boolean[2]; // 初始化未赋值 {false, false}
		if (bar[0]) { // bar[0] == false
			foo = "green"; // 不会执行
		}
		System.out.println(foo); //blue

    }
}