//����ɨ����
//
import java.util.Scanner;

public class SwitchDetail {
	public static void main(String[] args) {
		//����ɨ�����
		Scanner scan = new Scanner(System.in);

		//1.switch���ʽ��������,Ӧ��case��ĳ�������һ��
		//���ǿ����Զ�תΪ�ܹ��໥�Ƚϵ�����
		//�����������char,������int

		char c = 'a';
		switch (c) {
			case 'a' :
				System.out.println("ok1");
				break;
			case 98 ://char �����Զ�ת��Ϊint�����໥�Ƚ�
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok3");
		}

		//2.switch(���ʽ),���ʽ�ķ���ֵ������:
		//byte short int char enum[ö��] String
		//�������Ͳ�ƥ��:����double long float

		// double d = 1.1;
		// switch (d) {//����,double������switch
		// 	case 1.1 :
		// 		System.out.println("ok1");
		// 		break;
		// 	case 2.2 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }

		
		//3.case�Ӿ��е�ֵ�����ǳ������߳������ʽ(һ�������ֵ),�����Ǳ���
		//4.default�Ӿ��ǿ�ѡ��,��û��ƥ���caseʱ,ִ��default
		//��defaultҲû�е�ʱ��,һ��Ҳ��ִ��
		//5.break���������ִ����һ��case��֧��ʹ��������switch����
		//���û��break,�������ƥ����case��һֱ˳��ִ�е�switch��β,��������break
		//�� case��͸
		int num = 52;
		switch (num) {
			case 52 :
				System.out.println("ok1");
				// break;
			case 51+10 ://����ó�����Ҳ�ǿ��Ե�
				System.out.println("ok2");
				break;
			default ://default���Բ�д
				System.out.println("ok3");
		}
	}
}