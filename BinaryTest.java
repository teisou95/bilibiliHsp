//���������ֱ�ʾ��ʽ:
//������:0,1,��2��1,��0b��0B��ͷ��ʾ
//ʮ����:0-9,��10��1
//�˽���:0-7,��8��1,������0��ͷ��ʾ
//ʮ������:0-9��A-F(��a-f),��16��1,��0x��0X��ͷ��ʾ

public class BinaryTest {
	public static void main(String[] args) {
		int n1 = 0b1010;//������
		int n2 = 1010;//ʮ����
		int n3 = 01010;//�˽���
		int n4 = 0x1010;//ʮ������
		int n5 = 0xf0d;//ʮ������

		//�������ڴ��ж��Ƕ�������ʽ
		//���ʱ����ʮ����
		System.out.println(n1);//10
		System.out.println(n2);//1010
		System.out.println(n3);//520
		System.out.println(n4);//4112
		System.out.println(n5);//3583
	}
}