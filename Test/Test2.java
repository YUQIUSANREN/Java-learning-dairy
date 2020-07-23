public class Test2
{

	public static void main(String[] args){
		int a = 10;//十进制
		int b = 010;//八进制
		int c = 0x10;//十六进制
		System.out.println(a);//10
		System.out.println(b);//8
		System.out.println(c);//16
		System.out.println(a + b + c);//34
		//无论定义的什么进制，系统默认的输出还是以十进制为基准

		int d = 123;//d变量声明时是int类型，123也是int类型，123赋值给d不存在类型转换
		System.out.println(d);
		long f = 123;//f变量声明时是long类型，123是int类型，123赋值给f存在类型转换，int转为long
		System.out.println(f);
		//由此可见，小容量整数类型可以自动转换为大容量整数类型，称为自动类型转换机制
		long g = 2147483648L;
		//由于这里的214783648已经超出了int的取值范围，所以默认的int无法处理，添加L使用long来处理
		System.out.println(g);

		System.out.println("             ");
		System.out.println(' ');//新手无聊测试能不能输出空格

		long h = 100L;
		int i = (int)h;//这里使用强制转换数据类型来通过损失精度编译运行成功，普通只需要int i=h;
		System.out.println(i);
		//这里数字只有100，所以尚且能成功输出正确
		long j = 2147483648L;//超出了int的最大强制范围
		int k = (int)j;//强制将long型转换为了int型
		System.out.println(k);//输出结果却为-2147483648
		//这里由于数字太大超出了int的取值范围，虽然能编译运行，但由于电脑的储存形式（补码）导致结果出错
		byte l = 50;//Java对byte、short和int会给予优待，使其在取值范围内能成功运行，但仍然会损失精度
		System.out.println(l);//l变量已经自动的强制从int转换为byte，只不过在取值范围内不会有影响
		byte m = (byte)128;
		System.out.println(m);//输出结果却变成了-128
		//此时的情况和上面的k变量同理
	}
}