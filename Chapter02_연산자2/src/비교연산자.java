/*
 * 
 * 44page 
 * 비교연산자 ====>결과값 (boolean : true/false)
 * -------사용처 (조건문 , 반복문 )
 * 
 * 숫자 ( 정수 , 실수 , boolean , 문자 ) =>문자열은 비교할수 없다.
 * ---------------------------------
 * 
 * 1) == 같다 
 * 	  != 같지않다
 *    <  작다 
 *    >  크다
 *    <= 작거나 같다
 *    >= 크거나 같다
 *  ---------------------
 *  
 *   
 *  	
 * 
 * 
 * 
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =(int)(Math.random()*100)+1;
		/*
		 *           -------------------
		 *                    1
		 *     ---- 
		 *       2 
		 *                               --
		 *                                3
		 */
		
		int b=(int)(Math.random()*100)+1;
		
		
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("a==b = " + (a==b));
		System.out.println("a!=b = " + (a!=b));
		System.out.println("a<b = " +(a<b) );
		System.out.println("a>b = " +(a>b) );
		System.out.println("a<=b = " +(a<=b) );
		//a<b || a==b
		System.out.println("a>=b = " +(a>=b) );
		
		char c=(char)((Math.random()*26)+65);
		char d=(char)((Math.random()*26)+65);
         //ctrl + f 는 선택하여 바꾸기
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+"=="+d+" =="+  ( c==d));
		
		boolean b1 =false;
		boolean b2 = true;
		
		System.out.println("b1==b2 : "+(b1==b2));
		System.out.println("b1==b2 : "+(b1!=b2));
		
		
		
		
	}

}
