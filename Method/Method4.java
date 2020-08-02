public class Method4{
	public static void main(String[] args){
		System.out.println("-------------------------方法递归--------------------------");
		System.out.println(" ");
		//不使用递归和使用递归来实现1-a个数相加
		int a1 = 5 ;
		System.out.println(sum1(a1));//不使用递归

		int a2 = 5 ;
		System.out.println(sum2(a2));//使用递归
	}

	public static int sum1(int a ){
		int sum = 0;
		for( int b = 0 ; b <= a ; b++ ){
			sum += b ;
		}
		return sum;
	}//不使用递归

	public static int sum2(int a ){
		if(a == 1){
			return 1;
		}
		return a + sum2( a - 1 );
	}//使用递归
}