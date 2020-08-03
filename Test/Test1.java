public class Test1{//表示一个公开的类，叫做HelloWorld
	public static void main(String[] args) {//其中的args是一个变量的命名，可以根据实际情况更改
		System.out.println(100);//整数型
		System.out.println(3.14);//浮点型
		System.out.println(true);//布尔型
		System.out.println(false);//布尔型
		System.out.println("我是傻逼！");//字符串型
		System.out.println("abc");//字符串型
		System.out.println('我');//字符型
		System.out.println('a');//字符型

		int i = 88;
		System.out.println(i);

		System.out.println("Hello");
		System.out.println("World");//这两行表示Hello和World分别在不同的行
		System.out.print("Hello");
		System.out.println("World");//这两行会直接合并为HelloWorld
		System.out.println("HelloWorld");//这一行的效果和上面两行相同
		//所以println中的ln其实起到了换行的作用
		System.out.print("Hello");
		System.out.print('\n');//这里其实同时起到了换行的作用，也可以先定义一个变量为\n在输出该变量
		System.out.println("World");

		System.out.print("傻");
		System.out.print('\t');//这里是使用了制表符，和tab键的效果类似
		System.out.println("逼");

		System.out.println('\\');//这里将第二个特殊字符\转变为普通的\
		System.out.println("\"转义字符\"");//这里也是将半角的特殊双引号转变为了普通可直接输出的双引号

		char c ='\u6211';
		System.out.println(c);
		//这里是用的Unicode编码表示的‘我’这个中文字符，具体的转换可以在terminal中使用native2ascii指令查阅
		//实用性不大，且不能直接在输出语句中使用Unicode编码表示
	}
}

class bianliang{
	static int k = 1000;//k的变量直接定义在类体中，所以k变量作用域是在类体中，所有方法体都不可以再定义k
	//k属于成员变量

	static int m;//直接定义了m且未赋值，具体事件看main方法中的m输出解释
	//学对象后的补充说明：
	//这里两个成员变量之所以可以下static方法中使用，是因为变量也是static变量，不加static只能进行引用来实现效果

	public static void main(String[] args){
		int i = 10;//i属于局部变量
	//此时的i在另一个i的作用域中，不会和上面Test01类中的i冲突，但在bianliang类main方法中不能再定义i变量
		System.out.println(i);
		i = 20;//set数据
		System.out.println(i);//get数据
		//变量是可以重复赋值的，是变化的

		int t;//声明变量但未赋值，没有内存空间开辟，即未初始化，会报错
		t = 200;//赋值后才会开辟内存空间，不会再编译报错
		System.out.println(t);

		System.out.println(k);//此处编译k的输出则可以编译通过

		System.out.println(m);//这里输出了成员变量m且未被报错，是因为成员变量未赋值时系统会自动赋初始值

		char a = 'q';
		System.out.println(a);
		char b = '我';//中文字符正好是2字节
		System.out.println(b);
	}



	public static void dosome(){
		int i;//此时的i虽然和上面在同一个类体中，但不在同一个方法体，所以不冲突。
		//注意此时不是程序入口，只是一个方法，当调用此方法时才会输出结果
		i = 50;
		System.out.println(i);
		System.out.println(k);//此处编译k的输出则可以编译通过
	}
}
