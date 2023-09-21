import java.util.Iterator;
import java.util.Scanner;
public class 문제1_2_3_4_5 {
public static void main(String[] args) {
//5
	
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=6;j++) {
			if ((i+j)==6) {
				System.out.println(i+","+j);
				
			}
			
		}
		
//6
		
		
		
	}
	
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("첫번째 정수 입력 :");
	int a=scan.nextInt();
	System.out.println("두번째 정수 입력 :");
	int b= scan.nextInt();		
	int multi=1;
	
	for(int i=a;i<=b;i++) {
		multi*=i;

		
		
	}
	System.out.println(a+"부터"+b+"까지의 곱은"+multi);

	
	
	
	//문제14
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			
			System.out.print(i);
		}
		System.out.println();
		
		
		
	}
	

	//문제16
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			
			if(i==j) {
				System.out.print(i);
			}
			else {
				System.out.print("#");
			}
				
		}
		System.out.println();
		
		
	
	}
	//문제17
	
	for(int i=0;i<5;i++) {
		char c='A';
		for(int j=0;j<5;j++) {
			
			System.out.print(c);
			c++;
		}
		System.out.println();
		
	}
	char c='A';
	for(int i=0;i<5;i++) {
		
		for(int j=0;j<5;j++) {
			
			System.out.print(c);
			
		}
		c++;
		System.out.println();
		
	}
	
	
	
	
	
}
}
