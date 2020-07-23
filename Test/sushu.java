//非常经典的一个小程序，非常重要，一定要会！！
public class sushu{
	public static void main(String[] args){
		/*自我小测验：
        编写for循环找出1-10000中所有的素数，要求每8个换一行输出
        */
		System.out.println("  ");
		int huanhang = 0;//统计思想,在排版时作用很大
		for(int a1 = 2 ; a1 <= 10000 ; a1++){
			boolean shisushu =true;//这里只用作判断是否为素数的标记，数据类型不限，只要起到作用就行
            for(int a2 = 2 ; a2 < a1 ; a2++){
            	if(a1 % a2 == 0){
            		shisushu = false;//不是素数，所以标记相反
            		break;
            	}
            }
            if(shisushu){//shisushu == true时
            	System.out.print(a1 + " ");//顺序很重要，如果这个语句在if循环下面则第一行只有7个数字
            	huanhang++;
            	if(huanhang % 8 == 0){
            		System.out.println();
            	}
            	//下面是归零思想
            	/*
                if(huanhang == 8){
	                System.out.println();
	                huanhang = 0;
                }
            	*/
            }
		}
		//这个小程序中使用到了三种逻辑思维：统计思维、标记思维、归零思维




		//下面为尝试的废作
		//for(int a0 = 1 ; a0 <= 8 ; a0++){
		    /*for(int a1 = 2 ; a1 <= 100 ; a1++){//23456789 10
			    boolean shisushu = true;//使用sisushu变量作为一个标记【不限类型】，用来标记一个判断的逻辑
			    for(int a2 = 2 ; a2 < a1 ; a2++){//2
				    if(a1 % a2 == 0){
			            huanhang++;
					    shisushu = false;
					    break;
				    }
			    }
			    if(huanhang % 8 == 0){
			    	System.out.println();
			    }
			    System.out.print(shisushu == true ?a1 + " " :"");
		    }*/
		    //System.out.println();
	    //}
	}
}