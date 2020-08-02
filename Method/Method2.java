//package H.Java.Javacode.Test.Method;失败作，以后修改(接口，包等均未制作)
//import Method1.Method1;


//只要是程序可以执行到的位置，都可以调用方法
public class Method2{
	//主方法
	public static void main(String[] args){
		//Method1 method1 = new Method1.sumab();
		//method1.sumab();
		int y = 0;
		while(y < 3){
			y++;
			Method2.yay2(1);//调用yay2方法
			//应该出现的效果：循环12次“yay1”
		}
		Method2.Long0(0,0);

		System.out.println(" ");

		a();//a方法带有关键字static且和主方法都在同一个类Method2中，可以省略类名
		//若a方法在其他类则无法省略类名来调用
		System.out.println(" ");

		System.out.println("main start");//执行顺序main-> a1 -> a2 -> a3(栈)
		a1();
		System.out.println("main over");
		//在四个方法中最先调用的最后结束，最后调用的最先结束(栈)
		//在这里main方法结束后整个程序结束(不适合所有Java)

		System.out.println(" ");
		System.out.println("------------------返回值和接收数据-------------------");
		ReturnInt(10,3);//这里调用了ReturnInt方法，但没有接收返回值的数据
		System.out.println(ReturnInt(10,3));//这里直接接收了返回值的数据[即默认接收值，所以这里实参不能为空]
		int returnint = ReturnInt(12,3);//这里新定义了一个变量来接收了ReturnInt方法的返回值数据
		System.out.println(returnint);

		System.out.println(" ");
		System.out.println(b1());
		System.out.println(b2());
		System.out.println(b3());
		//这三个方法的作用是相同的，但无疑第三个方法更简便

		System.out.println(" ");
		c1();//这里不会显示“执行”字样
		System.out.println("=========");
		c2();//这里会显示“执行”字样
		//return语句和break语句的区别
	}


	//yay2方法
	public static void yay2(int y1){
		for(y1 = 1 ; y1 < 5 ; y1++){
			Method2.yay1();//调用yay1方法
		}
	}
	//yay1方法
	public static void yay1(){
		System.out.println("yay1");
	}

	public static long Long0(long a , long b ){
		a = 0;
		b = 0;
		for(int c = 0 ; c < 4 ; c++){
			a++;
			b = a++ + a++;//在C++中这纯属孤儿写法
		    System.out.println( a + " and " + b);
	    }
	    return 0;
	}

	public static void a(){
		System.out.println("a method");
	}

	public static void a1(){
		System.out.println("a1 start");
		a2();
		System.out.println("a1 over");
	}

	public static void a2(){
		System.out.println("a2 start");
		a3();
		System.out.println("a2 over");
	}

	public static void a3(){
		System.out.println("a3 start");
		//a2();//无限循环a2 start和a3 start
		System.out.println("a3 over");
	}

	public static int ReturnInt(int a , int b ){
		return a / b;//直接将a/b作为返回值，省去定义新变量来表示a/b的时间
	}

	public static int b1(){
		int a = 10;
		if( a > 3 ){
			return 1;
		}else{
			return 0;
		}
	}//保证了绝对会有返回值
	public static int b2(){
		int a = 10;
		if( a > 3 ){
			return 1;
		}
		return 0 ;
	}//简化if语句
	public static int b3(){
		return 10 > 3 ? 1 : 0 ;
	}//直接使用三元运算符来表示一个返回值，省去了冗长的if语句

	public static void c1(){
		for( int a = 1 ; a < 10 ; a++){
			if( a == 6 ){
				return;//这里是直接结束了方法体，所以return后面需要运行的“执行”字样将不会执行
			}
			System.out.println(" a = " + a );
		}
		System.out.println("执行！");
	}
	public static void c2(){
	    for( int a = 1 ; a < 10 ; a++){
		    if( a == 6 ){
			    break;//这里结束的是for循环，并不会结束方法体，所以也不会影响执行“执行”字样的输出
			}
			System.out.println(" a = " + a );
		}
		System.out.println("执行！");
	}
}