public class Test4
{
	public static void main(String[] args){
		 int a = 10;
		 int b = 3;
		 System.out.println( a + b );//13
		 System.out.println( a - b );//7
		 System.out.println( a * b );//30
		 System.out.println( a / b );//3
		 System.out.println( a % b );//1
		 //基本运算

		 int c = 10;
		 c ++;//c=c+1;
		 System.out.println(c);//11
		 ++ c;//c=c+1;
		 System.out.println(c);//12
		 //自加1,并且加1后的值被赋予给变量c保存下来，所以再次使用++时会从上一个结果递加

		 int d = 10;
		 int e = d ++;
		 System.out.println(d);//11
		 System.out.println(e);//10
		 //++出现在变量后规则：先做赋值运算，再对变量中保存的值进行自加
		 int f = 10;
		 int g = ++ f;
		 System.out.println(f);//11
		 System.out.println(g);//11
		 //++出现在变量前规则：先进行自加1，再赋值
		 int h = 100;
		 System.out.println(h ++);//100
		 //这里使用了类库的println函数，详见jdk中的scr.rar文件中的java/io/printstring.java
		 System.out.println(h);//101
		 int h1= 100;
		 System.out.println(++h1);//101
		 System.out.println(h1);//101
		 //上面++运算符应用的变形 
		 System.out.println("--------------------关系运算符-----------------------");

		 //关系运算符
		 int i = 10;
		 int j = 10;
		 System.out.println( i > j );//false
		 System.out.println( i >=j );//true
		 System.out.println( i < j );//false
		 System.out.println( i <=j );//true
		 System.out.println( i ==j );//true
		 System.out.println( i !=j );//false
		 System.out.println("--------------------逻辑运算符------------------------");

		 //逻辑运算符
		 System.out.println("  ");
		 System.out.println( 8 > 1 & 8 > 4 );//true
		 System.out.println( 8 > 1 & 8 > 9 );//false
		 System.out.println( 8 > 1 | 8 > 9 );//true

         System.out.println(" 逻辑与 ");
		 System.out.println( true & true );//true
		 System.out.println( true & false );//false
		 System.out.println( false & false );//false

         System.out.println(" 逻辑或 ");
		 System.out.println( true | true );//true
		 System.out.println( true | false );//true
		 System.out.println( false | false );//false

         System.out.println(" 逻辑非 ");
		 System.out.println( !true );//false
		 System.out.println( !false );//true

         System.out.println(" 逻辑异或 ");
		 System.out.println( true ^ true );//false
		 System.out.println( true ^ false );//true
		 System.out.println( false ^ false );//false

         System.out.println(" 短路与 ");
		 System.out.println( true && true );//true
		 System.out.println( true && false );//false
		 System.out.println( false && false );//false

         System.out.println(" 短路或 ");
		 System.out.println( true | true );//true
		 System.out.println( true | false );//true
		 System.out.println( false | false );//false

		 //逻辑与与短路与
		 System.out.println("-------------------逻辑与与短路与-------------------------");
		 int k = 10;
		 int l = 12;
		 System.out.println( k < l & ++k < l );//false
		 System.out.println(k);//11
		 //此处虽然再第一个表达式中已经确定最终结果为假，但还是执行了第二个表达式

		 int k1 = 10;
		 int l1 = 12;
		 System.out.println( k1 < l1 && ++k1 < l1 );//false
		 System.out.println(k1);//10
		 //此处在第一个表达式中确定最终结果为假，所以不再执行第二个表达式

		 //赋值运算符
		 System.out.println("------------------------赋值运算符------------------------");
		 int m = 10;
		 m += 5;//m = m + 5;
		 System.out.println(m);//15
		 m -= 5;//m = m - 5;
		 System.out.println(m);//10
		 m *= 2;//m = m * 2;
		 System.out.println(m);//20
		 m /= 4;//m = m / 4;
		 System.out.println(m);//5
		 m %= 3;//m = m % 3;
		 System.out.println(m);//2
		 System.out.println(" ");
		 byte n = 10;
		 n = (byte)(n + 5);//直接n = n + 5会报错，错误为n和5数据类型不同
		 System.out.println(n);//15
		 byte n1 = 10;
		 n1 += 5;//这里的表达式等同于n1 = (byte)(n1 + 5),而不等同于n1 = n1 +5
		 System.out.println(n1);//15
		 byte n2 = 0;
		 n2 += 128;//这里依旧是老问题，会损失精度，取值范围依然适用
		 System.out.println(n2);//-128

         //字符串运算符       
		 //“+”
		 System.out.println("-----------------------字符串运算符--------------------------");
		 System.out.println("       “+”       ");
		 System.out.println( 10 +   20 +  30  );//60，这里+作用是求和
		 System.out.println( 10 +   20 + "30" );//3030，这里第一个+作用是求和，第二个是作为字符串运算符
		 System.out.println( 10 + ( 20 + "30" ) );//102030，由于小括号改变了优先级，使+都变成了字符串运算符

		 int o = 10;
		 int p = 20;
		 System.out.println( o + "+" + p + "=" + ( o + p ) );//成功完成10+20=30且是动态输出

		 System.out.println(" ");
		 String o1 = "我是傻逼。";
		 char p1 = '\n';
		 System.out.println("-谁是傻逼？" + p1 + "-" + o1 + p1 + "-哦。");//不能直接在这里添加\n
		 System.out.println("-谁是傻逼？ -" + o1 + "-哦。");
		 System.out.println(" ");
		 //+的字符串运算小测试，发现和C语言有不少差别，且语句内不能直接使用\n


		 //三元运算符/条件运算符（布尔表达式?表达式1:表达式2）
		 boolean gender = true;
		 char q = gender?'男':'女';//这里等同于char q = '女';其中表达式1和2只能和前面的char保持数据类型一致
		 System.out.println(q);
		 System.out.println(gender?"男":'女');//这里可以同时使用字符或者字符串		 
	}
}

/*class PrintlnDemo
{
	public void m(int x){

	}
	main{
		int a =10;
		m(a);
	}
}*/