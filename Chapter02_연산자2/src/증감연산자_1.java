/*
 *  증감 연산자
 *  ---1개 증가 , 1개 감소
 *		++       --
 *	=전치연산자
 *	++a , --a
 *	=후치연산자
 *	aa++ , a--
 *
 *	int a=10;
 *	int b=++a;
 *		a=11 ,b=11 // a를 먼저 증가하고 b에 대입(++우선순위)
 *	int a=10;
 *	int b=a++; // b에  a 값을 대입후에 나중에 a값을 증가(= 우선순위)
 *  	a=11, b=10
 *  
 *  int a=10;
 *  int b=++a + ++a + a++
 *         11 + 12 +12
 *   
 * int b= a++ + a++ + ++a;
 *        10+11+13
 * 
 *  int b = ++a + a++ + ++a + a++
 *  	    11    11    13    13
 *   48
 * 
 * 
 * 
 * 	
 * 
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a=10; int b=++a;
		 * 
		 * System.out.println("a : "+ a); System.out.println("b : "+ b);
		 * 
		 * System.out.println("==================");
		 */
		int a=10;
		int b=a++;
		
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		
	}

}
