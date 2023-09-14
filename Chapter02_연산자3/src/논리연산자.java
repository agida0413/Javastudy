/*
 * && , || = > 범위가 있는경우
 * 
 * (조건) && (조건) ==> 조건을 사용하는 연산자 (부정연산자 , 비교연산자)
 * (조건) || (조건) ==> 조건을 사용하는 연산자 (부정연산자 , 비교연산자)
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * 1~12입력 = >
		 * 12~1,2 => 겨울
		 * 3,4,5 =>봄
		 * 6,7,8 = >여름
		 * 9,10,11=>가을
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		
		int i = scan.nextInt();
		boolean check = (i>=1) && (i<13);
		while(check)
			if (!check) {
				System.out.println("다시입력하세여");
				
			 check=!check;
			 continue;
			
			}
		
		{
		if (i>=12 || (i<=2)) {
			System.out.println("겨울");
			
		}
		else if (i<=5 && i>2) {
			System.out.println("봄");
		}
		else if (i>=6 && i<=8) {
			System.out.println("여름");
			
		}
		else {
			
			System.out.println("가을");
			
		}
		
		
			
		
			
			
		}
		
		
		
	}

	}

