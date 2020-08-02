public class Method3{
	public static void main(String[] args){
		System.out.println("---------------------------方法重载----------------------------------");
		System.out.println(" ");
		System.out.println(sumint(1,2));
		System.out.println(sumdouble(0.1,0.2));
		System.out.println(sumlong(1L,2L));
		//这是不使用重载机制编写的方法调用
		System.out.println(" ");
		System.out.println(sum(1,2));
		System.out.println(sum(0.1,0.2));
		System.out.println(sum(1L,2L));
		//这是使用了重载机制的方法调用，只需要记住sum方法的作用就行

		System.out.println(" ");
		打.印(1);
		打.印(0.1);
		打.印(10L);
		打.印('a');
		打.印("打印");
		//方法重载小妙用：创建新类并进行封装，在类内定义新方法来改变原输出方法
	}

	public static int sumint(int a , int b ){
		return a + b ;
	}
	public static double sumdouble(double a, double b ){
		return a + b ;
	}
	public static long sumlong(long a , long b ){
		return a + b ;
	}
	//这是不使用方法重载机制编写的方法

	public static int sum(int a , int b ){
		return a + b ;
	}
	public static double sum(double a , double b ){
		return a + b ;
	}
	public static long sum(long a , long b ){
		return a + b ;
	}
	//这是使用重载机制编写的方法，省去记忆不同方法名称的难处

	public static void a1(){}
	public static void a1(int a ){}
	//这两个方法构成方法重载(数量不同)
	public static void a2(int a , double b ){}
	public static void a2(double a , int b ){}
	//这两个方法也构成重载(顺序不同)
	public static void a3(int a ){}
	public static void a3(double a ){}
	//这两个方法也构成重载(数据类型不同)

	/*public static void a4(int a , int b ){}
	  public static void a4(int b , int a ){}*/
	//这两个方法不构成重载，造成了方法重复(编译会报错)

	/*public static void a4(){}
	public static int a4(){}*/
	//这两个方法不构成重载，因为方法重载和返回值类型无关，还是造成方法重复(编译会报错)
}