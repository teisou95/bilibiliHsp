//强制类型转换，容量大数据类型 -> 容量小数据类型
//使用时加上强制转换符()，但可能造成精度降低或数据溢出


//案例演示
public class ForceConvert {
	//main主方法
	public static void main(String[] args) {

		int n1 = (int)10.9;
		System.out.println(n1);//造成精度损失
		int n2 = 1000;
		byte b1 = (byte)n2;// n2 超过 byte 的范围，会造成数据溢出
		System.out.println(n2 + "\n" + b1);
 	}
}