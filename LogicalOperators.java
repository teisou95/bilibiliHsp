/**
 * �߼���������������Ӷ�������������ϵ���ʽ�������Ҳ��һ��booleanֵ
 * ��·��	&&		��true ->true	��flase ->false
 * ��·��	||		��true ->true	��flase ->flase
 * ȡ��		��		true ->flase	false ->true
 * �߼���	&		��true ->true	��flase ->false
 * �߼���	|		��true ->true	��flase ->flase
 * �߼����	^		��ͬ ->true		��ͬ ->false
 * �߼����	�������е����
 * ��·���	���ж���ټ�ֹͣ���򣬺�����䲻��ִ��
*/

//��ʾ�߼��������ʹ��

public class LogicalOperators {
	//main����
	public static void main(String[] args) {
		//&& �� & �İ�����ʾ
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		}

		if (age > 20 & age < 90) {
			System.out.println("ok200");
		}

		//����
		int a = 4;
		int b = 9;
		// if (a < 1 && ++b < 50) {
		// 	System.out.println("ok300");
		// }
		// System.out.println(b);// a < 1 �Ѿ�Ϊ�٣�++b��ִ�У����9

		if (a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(b);// a < 1 Ϊ�٣�++b ��Ȼ����ִ�У����10
	}
}