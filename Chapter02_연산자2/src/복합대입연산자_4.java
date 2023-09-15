/*	 비트연산자 
 *  int a=10;
 *  a&=2; a=a&2
 *  a|=2; a=a|2
 *  a^2;  a=a^2
 *  
 *  
 *  1010 0010  & 0010 2
 *             | 1010 10
 * 			   ^ 1000 8
 * 32  16 8 4 2 1
 * 1   0  0 0 1 0     000010  2
 * 0   0  0 0 1 0     100010  34
 *                    100000  32
 */
public class 복합대입연산자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a&=2;
		System.out.println(a);
		
		a=10;
		a|=2;
		System.out.println(a);
		
		a=10;
		a^=2;
		System.out.println(a);
		
		System.out.println(" ======================");
	
	int b=34;
	b&=2;
	//2
	System.out.println(b);
	
	b=34;
	b|=2;
	System.out.println(b);
	
	b=34;
	b^=2;
	System.out.println(b);
	
	
	
	
	
	
	
	}

}
