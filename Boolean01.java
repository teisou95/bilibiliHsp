//ASCII 	һ���ֽڱ�ʾ��һ��128���ַ�
//Unicode 	�̶�2���ֽڱ�ʾ�ַ����˷ѿռ䣬����ASCII����
//utf-8 	��Unicode�ĸ�������С�ɱ䣬ʹ��1-6���ֽڱ�ʾ�ַ�����ĸʹ��1���ֽڣ�����ʹ��3���ֽ�-
//gbk 		���Ա�ʾ���֣���Χ�㣬��ĸʹ��һ���ֽڣ�����2���ֽ�
//big5		���Դ�ŷ�������

//�������� boolean ֻ����ȡֵtrue��false����null
//booleanռ1���ֽ�
//boolean�����������߼����㣬һ�����ڳ������̿��ƣ�
//if ѭ��
//do-while ѭ��
//for ѭ��

public class Boolean01 {
	//main������
	public static void main(String[] args) {

		//��ʾ�жϳɼ��Ƿ�ͨ���İ���
		//java�в���������������false��true
		//����һ����������
		// boolean isPass = true;
		boolean isPass = (3 < 1);//(3 < 1) == false
		if(isPass == true){
			System.out.println("����ͨ������ϲ");
		}else {
			System.out.println("����û��ͨ�����´�Ŭ��");
		}
		System.out.println(isPass);
	}
}