//�����������ͺ�String���͵�ת��
//������������ -> String:��""����
//String -> �����������ͣ�ͨ���������͵İ�װ�����parseXX����

public class StringAndBasic {
	//main������
	public static void main(String[] args) {

		//Basic -> String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;

		String str1 = n1 + "";
		String str2 = f1 + "";
		String str3 = d1 + "";
		String str4 = b1 + "";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);


		//String -> Basic
		String str100 = "25";
		String str200 = "21.25";
		String str300 = "421.51";
		String str400 = "\n545ds";//����"true"֮�����е��ַ�������ȡΪfalse

		//ʹ�û����������Ͷ�Ӧ�İ�װ�����Ӧ�����õ�������������
		int n100 = Integer.parseInt(str100);
		float f100 = Float.parseFloat(str200);
		double d100 = Double.parseDouble(str300);
		boolean b100 = Boolean.parseBoolean(str400);

		System.out.println(n100 + "\n" + f100 + "\n" + d100 + "\n" + b100);

		System.out.println("=======================");
		System.out.println(str100 + 1);//ƴ��
		System.out.println(n100 + 1);//�������

		//String -> char ֻ�ܵõ�String ������һ���ַ�
		System.out.println(str400.charAt(4));//������0��ʼ

 	}
}