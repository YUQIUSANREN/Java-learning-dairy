public class Test5
{
	public static void main(String[] args){
		//控制语句
		//if语句
		System.out.println("-----------------if语句--------------------");
		int mouth = 7;
		if(mouth < 9 && mouth >= 7){
			System.out.println("哎~还没开学呢~");
		}else if(mouth > 9){
            System.out.println("我操尼玛怎么就开学了？");
		}//if语句练手1/**/

		if(mouth > 0 && mouth <= 12){
			if(mouth <= 2){
				System.out.println("2020魔幻开局");
			}else if(mouth >= 3 && mouth <= 5){
				System.out.println("在家上网课");
			}else if(mouth <= 6){
				System.out.println("wdnmd开学了");
			}else if(mouth >= 7 && mouth <= 8){
				System.out.println("放假了，下雨了，洪水TM又来了");
			}else{
				System.out.println("2020魔幻大戏，敬请关注");
			}
		}//if语句练手2

		int age = 20;
		String a;
		if(age < 0 || age >150){
			a = "你TM是人？";
		}else if(age < 6){
			a = "儿童";
		}else if(age < 20){
			a = "青少年";
		}else if(age < 40){
			a = "青年";
		}else if(age < 60){
			a = "中年";
		}else{
			a = "老年";
		}
		System.out.println(a);
		//if语句练手3

				if(mouth > 0 && mouth <= 12){
			if(mouth <= 2){
				System.out.println("2020魔幻开局");
			}else if(mouth <= 5){
				System.out.println("在家上网课");
			}else if(mouth <= 6){
				System.out.println("wdnmd居然开学了");
			}else if(mouth <= 8){
				System.out.println("放暑假了，又下雨了，居然TM还有洪水");
			}else{
				System.out.println("2020魔幻大戏，敬请期待");
			}
		}//if语句练手2(优化版)

		System.out.println("  ");
		//输入语句试验
		java.util.Scanner b = new java.util.Scanner(System.in);//创建扫描器对象
		System.out.print("请输入一串字符：");
		String userInputContent = b.next();//调用Scanner的nect()方法开始接受用户键盘输入
		//程序执行到此处会停下来等待用户的输入，接收的文本是以字符串的形式接收
		//用户输入并最终敲回车键后，键入的信息会自动赋值给userInputContent，此时信息已经保存到内存中
		System.out.println("你输入的字符为" + userInputContent);//将内存中的数据输出到控制台

		System.out.println("  ");
		System.out.println("字符串if语句试验");
		System.out.print("请输入一段字符：");
		String qiezi = b.next();
		if("wdnmd".equals(qiezi)){
			System.out.println("您输入的字符是：" + qiezi);
			System.out.println("但您TM的请不要变成闸总");
		}//if语句的字符串选择


        System.out.println("  ");
		System.out.print("请输入您的年龄：");
		int userAge = b.nextInt();//
		if(userAge < 0 || userAge >150){
			a = "你TM是人？";
		}else if(userAge < 6){
			a = "儿童";
		}else if(userAge < 20){
			a = "少年";
		}else if(userAge < 40){
			a = "青年";
		}else if(userAge < 60){
			a = "中年";
		}else{
			a = "老年";
		}
		System.out.println(a);
		//if语句练手(加上了输入语句)

		System.out.println("  ");
		System.out.print("请正经的输入您的年龄：");
		int userAge2 = b.nextInt();//这里需要输入int类型的字面值，所以next()方法也必须确定为Int类型
		String c = "老年";//这里设置了一个默认值，减少代码编辑量
		if(userAge2 < 0 || userAge2 > 150){
			c = "你TM是人？";
		}else if(userAge2 < 6){
			c = "儿童";
		}else if(userAge2 < 20){
			c = "青少年";
		}else if(userAge2 == 20){
            c = "咸鱼";
		}else if(userAge2 < 40){
			c = "青年";
		}else if(userAge2 < 60){
			c = "中年";
		}
		System.out.println(c);//这个语句中若是System.out.println("你是"+c+"阶段");会在<0>150时出现bug，后面解决。
		//if语句练手4（添加了默认值，简化并美观了此Java语句块）

		//switch语句
		System.out.println("---------------------switch语句-------------------------");
		int d = 10;
		switch(d){
			case 1 : case 2 : case 3 : case 10 :
			System.out.println("wdnmd");//当变量d为1.2.3.10任意一个时此语句执行
		}//case穿透原理妙用

		System.out.print("请输入1-7的数字：");
		int num = b.nextInt();
		switch(num){
			case 1 :
			    System.out.println("这TM是星期一");
			    break;
			case 2 :
			    System.out.println("这TM是星期二");
			    break;
			case 3 :
			    System.out.println("这TM是星期三");
			    break;
			case 4 :
			    System.out.println("这TM是星期四");
			    break;
			case 5 :
			    System.out.println("这TM是星期五");
			    break;
			case 6 :
			    System.out.println("这TM是星期六");
			    break;
			case 7 :
			    System.out.println("这TM是星期日");
			    break;
			default :
			    System.out.println("你TM的输入的啥玩意儿！？");
		}//switch语句练手2(当所有case都无法与switch匹配时，就会输出默认的default分支的语句)

        System.out.println("  ");
        System.out.println("输入了个A");
		char e = 'A';
		switch(e){
            case 'A':
                System.out.println("就你TM是A啊");
                break;
            case 'B':
                System.out.println("就你TM是B啊");
                break;
            case 'C':
                System.out.println("就你TM是C啊");
                break;
            case 'D':
                System.out.println("就你TM是D啊");
                break;
		}//switch语句练手3(这里char实质上是自动转化为了int类型)

		System.out.println("  ");
		System.out.println("欢迎来到TM的祖安计算器。");
		System.out.println("这个只能进行简单计算");
		System.out.println("无他，我菜");
		System.out.print("不废话了，你先输入第一个数字：");
		int f = b.nextInt();
		System.out.print("你再输入一个运算符(提示，我只能TM的输入+=*/%)：");
		String g = b.next();
		System.out.print("你再输入最后一个数字：");
		int h = b.nextInt();
		int result = 0;//这里一定要初始化这个变量，否则会报错
		switch(g){
			case "+":
			    result = f + h;
			    break;
			case "-":
			    result = f - h;
			    break;
			case "*":
			    result = f * h;
			    break;
			case "/":
			    if(h == 0){
			    	System.out.println("你TM学过数学吗？");
			    }
			    result = f / h;
			    break;
			case "%":
			    if(h == 0){
			    	System.out.println("你TM学过数学吗？");
			    }
			    result = f % h;
			    break;
		}
		System.out.println("这个计算结果是：" + f + g + h + "=" + result);
		//注：如果这里真的执行了f/0的话，运行会断开，以下再写程序就不会运行了，但可以使用try catch之类的盖住[233]
	}
}
