public class Test7{
	public static void main(String[] args){
		//while循环
		System.out.println("--------------------while循环----------------------");
		/*while(true){
			System.out.println("死循环");
		}*/
		//注：当这个循环语句变成无限循环时，下面再写语句编译器会报错，因为编译器知道永远也执行不了
		//但有办法可以使编译器在死循环时可以编译成功
		//下面是示例：
		/*int a = 5;
		int b = 2;
		while(a > b){//这里是不能直接写5 > 2的
			System.out.println("另一种方式的死循环");
		}
		System.out.println("并且这里添加语句编译器也不会报错");
		//这里的本质原因是编译器只编译，不运行，而a > b运行后才会显示真或假，至于5 > 2是直接表示了真假的
		*/
		int a = 1;
		while(a <= 10){
			System.out.println(a);//1-10
			a++;
		}
		System.out.println("a最终为：" + a);//11
		//while循环练手2【数据输出数字不同的原理和for循环相同】

		System.out.println("  ");
		System.out.println("-----------------do...while循环---------------------");
		int b = 10;
		do{
			System.out.println(b);
		}while(b > 100);//这里的“;”不要忘了写
		//这里至少会执行一次循环体，即输出一个10
		//如果是同样的循环体在while循环中则一次也不会执行

		System.out.println("----------------------break语句-----------------------");
		for(int c = 0 ; c < 10 ; c++){
			if(c == 5){
				break;
			}
			System.out.println("c => " + c);//0-4
		}//break语句练手1

		System.out.println("  ");
		for(int c1 = 1 ; c1 < 6 ; c1++){
			for(int c2 = 1 ; c2 < 7 ; c2++){
				if(c2 == 4){
					break;
				}
				System.out.print( c1 * c2 + " ");
			}
		}//break语句练手2【默认情况下break只影响最近的循环体】
		//但也有办法让break语句主动干涉非默认的循环体
		//示例：
		System.out.println();
		System.out.println("  ");
		for1:for(int c1 = 1 ; c1 < 6 ; c1++){//将这个for循环起名为for1
			for2:for(int c2 = 1 ; c2 < 7 ; c2++){//将这个for循环起名为for2
				if(c2 == 4){
					break for1;//终止的是for1循环
				}
				System.out.print( c1 * c2 + " ");
			}
		}//此处使用命名的方法直接将break强制作用在for1循环上，这样就影响到了for1循环

		System.out.println();


		System.out.println("----------------------continue语句--------------------------");
		//continue语句
		for(int c1 = 1 ; c1 < 6 ; c1++){
			for(int c2 = 1 ; c2 < 7 ; c2++){
				if(c2 == 4){
					continue;//直接跳过了c2=4时的这一次循环，直接到下一次循环
				}
				System.out.print( c1 * c2 + " ");
			}
		}//continue语句练手1
		//注：continue也可以通过命名循环来指定影响的是哪个循环
	}
}