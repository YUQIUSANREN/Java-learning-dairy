//package H.Java.Javacode.Test.Method;失败作，以后改
public class Method1{
	//public公开的
	//static静态的
	//void返回值[void表示不返回任何数据]
	//(String[] args)是形参
	//String[]是一种数据类型
	//args是一个局部变量名
	//主方法就需要这样编写，这是程序的入口[硬性规定]
	public static void main(String[] args){
		//下面直接调用写的sumab方法
		Method1.sumab(10,20);
		Method1.sumab(111,222);
		//这里就可以直接调用后设置参数，使代码得到了重复使用
	}

	//现在单独定义一个方法，来完成NoMethod类的程序的效果
	//这里void表示不要求返回数据，但是需要输出值
	public static void sumab(int a , int b ){//用来作为求两个int数据的和的方法
		System.out.println(a + " + " + b + " = " + ( a + b ) );
	}
}



class NoMethod{
	public static void main(String[] args){
		//不使用方法时的语句
		//1.计算10和20的和，并输出结果
		System.out.println("10 + 20 = " + ( 10 + 20 ));
		//或者
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		//缺点：不够灵活，若是每次使用同样的语句添加不同数据，就需要设置多个变量
		//代码无法重复使用，造成资源浪费
		//所以自然而然会想到写成某个方法并进行调用，用来节省资源
		/*char d = 25;
		System.out.println(d);*///请忽略
	}
} 


class ErrorList{
	public static void main(String[] args){
		for(int a = 0 ;a < 5 ; a++)
			System.out.println(a);
	}
}