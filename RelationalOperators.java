//��ϵ������Ľ������boolean�ͣ�Ҫô��true��Ҫô��false
//��ϵ�������������if�ṹ��������ѭ���ṹ�����������
// == != < > <= >= instanceof(����Ƿ�������Ķ���)
// "hdas" instanceof String -> true
public class RelationalOperators {
	//main����
	public static void main(String[] args) {
		//instanceof ʹ��
		String s = "yasumi";
		boolean b1 = s instanceof String;
		boolean b2 = "����" instanceof String;
		System.out.println(b1);
		System.out.println(b2);

		//��ϵ�����������ʾ
		int a = 9;
		int b = 8;
		//��ϵ�������ɵı��ʽ����Ϊ��ϵ���ʽ���� a > b 
		//��ϵ���ʽ�Ľ����һ��booleanֵ

		System.out.println("\n");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		boolean flag = a > b;
		System.out.println("flag = " + flag);
	}
}