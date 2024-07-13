// 作业7
//
public class HomeworkP014707 {
	public static void main(String[] args) {
		// 输出小写的a-z及大写的Z-A

		// char lowerCase = 'a';
		// char upperCase = 'Z';
		// int count = 0;

		// // 输出小写字母
		// for (int i = 1; i <= 26; i++) {
		// 	System.out.print(lowerCase + "\t");
		// 	lowerCase++;
		// 	count++;
		// 	if (count % 5 == 0) {
		// 		System.out.println();
		// 	}
		// }
		// System.out.println();
		// System.out.println();

		// // 输出大写字母
		// count = 0;
		// for (int i = 1; i <= 26; i++) {
		// 	System.out.print(upperCase + "\t");
		// 	upperCase--;
		// 	count++;
		// 	if (count % 5 == 0) {
		// 		System.out.println();
		// 	}
		// }

		// 尝试更快捷的方式
		for (char lowerCase = 'a'; lowerCase <= 'z'; lowerCase++) {
			System.out.print(lowerCase + " ");
		}
		for (char upperCase = 'Z'; upperCase >= 'A'; upperCase--) {
			System.out.print(upperCase + " ");
		}
    }
}