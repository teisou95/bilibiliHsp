// ��ҵ7
//
public class HomeworkP014707 {
	public static void main(String[] args) {
		// ���Сд��a-z����д��Z-A

		// char lowerCase = 'a';
		// char upperCase = 'Z';
		// int count = 0;

		// // ���Сд��ĸ
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

		// // �����д��ĸ
		// count = 0;
		// for (int i = 1; i <= 26; i++) {
		// 	System.out.print(upperCase + "\t");
		// 	upperCase--;
		// 	count++;
		// 	if (count % 5 == 0) {
		// 		System.out.println();
		// 	}
		// }

		// ���Ը���ݵķ�ʽ
		for (char lowerCase = 'a'; lowerCase <= 'z'; lowerCase++) {
			System.out.print(lowerCase + " ");
		}
		for (char upperCase = 'Z'; upperCase >= 'A'; upperCase--) {
			System.out.print(upperCase + " ");
		}
    }
}