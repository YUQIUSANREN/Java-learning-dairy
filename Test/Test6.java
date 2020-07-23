public class Test6{
	public static void main(String[] args){
		//for循环
		System.out.println("------------------for循环---------------------");
		for(int a = 1;a <= 10;a++){//i++也可以写成i = i + 1;或者i += 1;
			System.out.println(a);//若是在for外部定义的i，也可以将此语句放到外面
		}//for循环练手1(就算for()内不写表达式，也不可以缺少;;)

        System.out.println("    ");
		int a1 = 0;
		for(; a1 < 10 ; a1++){
			System.out.println("a1 : " + a1);//0-9(注：若是++a1会是1-9)
		}
		System.out.println("a1 => " + a1);//输出10
		//原理：再执行循环体后，变量a1已经被更新，而当a1为10时才终止了循环，所以a1最终为10
		//可以以此类推第一个for循环若这么做结果将是11

		System.out.println("  ");
		for(int a2 = 0 ; a2 < 10 ;){
			System.out.println("a2 => " + a2);//0-9
			a2 ++;
		}
		for(int a3 = 0 ; a3 < 10 ;){
			a3 ++;
			System.out.println("a3 => " + a3);//1-10
		}//你细品


		for(int a4 = 1 ; a4 < 50 ; a4 +=2){
			System.out.println("a4奇数为：" + a4);
		}
		//或者
		System.out.println("另一种编程方式，具体看代码");
		for(int a5 = 1 ; a5 < 50 ; a5 ++){
			//这回的原理是判断是否是奇数，再进行输出
			if(a5 % 2 == 1){//记住不要写成a5 % 2 = 1,这是赋值表达式不是布尔表达式
				System.out.println("a5奇数为：" + a5);
			}
		}//这两种循环第一种更加推荐，因为更节省写代码的时间，并且更加美观

		System.out.println("  ");
		int sum = 0;
		for(int b = 1;b < 100 ; b +=2){
			sum += b;
		}
		System.out.println("0-100所有奇数的和为：" + sum);
		//for循环练手2(累加思想：把所有的东西往一个盒子放，所以要有个盒子sum，东西b往里加)
		//如果需要再次使用sum且需要是初始值，需要再将sum初始化，即sum = 0;


		System.out.println("  ");
		for(int c1 = 1 ; c1 <= 9 ; c1++){
			for(int c2 = 1 ; c2 <= 9 ; c2++){
				System.out.println(c1 + " x " + c2 + " = " + ( c1 * c2 ));
			}
		}//for循环练手3：简单的for循环嵌套来实现乘法表

		System.out.println("  ");
		for(int c1 =1 ; c1 <= 9 ; c1++){
			for(int c2 = 1 ; c2 <= c1 ; c2++){
				System.out.print(c2 + "x" + c1 + "=" + ( c1 * c2 ) + " ");
			}
			System.out.println();//或者System.out.print("\n");
		}//for循环实现乘法表(进阶版)


        /*自我小测验：
        编写for循环找出1-10000中所有的素数，要求每8个换一行输出
        */
		//System.out.println("  ");
		//for(int d1 = 1 ; d1 <= 8 ; d1++){}
		//我将会写在Classwork文件夹的sushu.java文件中
	}
}