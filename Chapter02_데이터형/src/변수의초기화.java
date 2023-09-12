/*변수의 초기화
 1.변수추출
 2.변수선언 (데이터형)
 3.변수 초기화  
 	= 명시적인 초기화 
 		int a=10;
 	
 	= 입력값
 	  Scanner : 키보드 입력값을 받을때 사용
 	  BufferedReader : 에외처리
 	= 임의값을 받아서 초기화
 	  -----
 	   랜덤
 	= 크롤링   
*
*
*
*/

import java.util.Scanner;


public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = (int)(Math.random()*100)+1;//*100 = 0~99  // +1 0~100
		
		//0.0 and less than 1.0
		System.out.println(b);
		
		
		
		
		
		
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int c=scan.nextInt();
		System.out.println(c);
	
		
		int x=10;
		int y=20;
		int temp = x;//임시변수 x 값을 temp에 저장
		
		//x=20 y=10
		
		
		x=y;
		y=temp;
		
		System.out.println(x );
		System.out.println(y);
		
		
	}

}
