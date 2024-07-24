// 成员方法 细节
// 访问修饰符(四种): public protected 默认 private

// 
import java.util.Scanner;
public class MethodDetail {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		AA a1 = new AA();
		int[] res = a1.getSumAndSub(10, 60);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		

		myScanner.close();

    }
}

class AA {

	// 1. 访问数据类型:一个方法最多只能有一个返回值,但可以返回数组得到多个值

	public int[] getSumAndSub(int n1, int n2) {
		// int[] resArr = new int[2];
		// resArr[0] = n1 + n2;
		// resArr[1] = n1 - n2;
		// return resArr;
		return new int[]{n1 + n2, n1 - n2}; // 一句话写完
	}

	// 2. 返回类型可以是任意类型,包括基本数据类型和引用类型(对象和数组)
	// 3. 如果方法要求有返回数据类型,则方法体中最后的执行语句必须为 return 语句;
	// 		而且要求返回值类型必须和 return 的值类型一致或兼容

	public int f1() {
		// return 100.0; // 返回值double 给 int ,错误
		char c1 = 'b';
		return c1; // char 被隐式转换为int 返回,可以

	}

	// 4. 如果方法是 void ,可以不写 return ,或者只写 return 但不带具体的值
	// 5. 方法名,使用驼峰命名法,要有含义,见名知义
	// 6. 形参列表,多个形参用", "间隔,可以是任意类型,调用带参数的方法时,
	//		一定对应参数列表传入相同或兼容类型的参数
	// 7. 方法定义时的参数是 形式参数,方法调用时传入的参数是 实际参数,
	//		实参传给形参时,必须类型一致或兼容,个数和顺序必须一致
	// 8. 方法内不能嵌套定义方法
}