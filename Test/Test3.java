public class Test3
{
	public static void main(String[] args){
		double a = 8.0;
		System.out.println(a);
		//3.0是double类型的字面值，d是double类型的变量，所以不存在类型转换
		float b = (float)8.0;
		System.out.println(b);
		float c = 8.0f;
		System.out.println(c);
		//两种强制将double类型转换为float类型的方法
		double d = 8.01;
		System.out.println(d);

		boolean zu_an = true;
		if(zu_an)
		{
			System.out.println("nmsl");
		} 
		else
		{
			System.out.println("nmms");
		}//简单的布尔类型的运用

		long e = 10;
		byte f = (byte)(e/3);//错误示例:byte f = (byte)(int)g/3;byte f = (byte)e/3;
		System.out.println(f);
		//基本数据类型转换的应用1【在编译时需要分清计算的优先级】

		char g = 233;
		System.out.println(g);
		//基本数据类型转换的应用2【在使用char类型表示整数时默认会当作int类型处理,但运行时会当作ASCII码值处理】

		char h = 'a';//a的ASCII码是97
		System.out.println(h);//输出h变量的字符
		System.out.println((byte)h);//将a强制转换为byte型，输出h变量的ASCII码值
		int i = h+3;//这里自动将所有的数据类型变为int型来处理，字符则使用了ASCII码
		System.out.println(i);//输出的值是a的ASCII码值加上3
		//基本数据类型转换的应用3【多种数据类型混合运算时，会自动使用最大容量的数据类型来计算】
	}
}