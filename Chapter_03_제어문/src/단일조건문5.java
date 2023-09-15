import java.util.Scanner;
public class 단일조건문5 {
	public static void main(String[] args) {
	//3개의 정수 -> 총점 평균 학점
		//A B C D F 
		//A>=90 B>=80 C >=70 >=60
//		100~97 A+ 96~93 A0 92~ 90 A-

		Scanner scan = new Scanner(System.in);
		System.out.print("정수1를 입력하세요 (0~100)");
		int a=scan.nextInt();
		System.out.print("정수2를 입력하세요 (0~100" );
		int b=scan.nextInt();
		System.out.print("정수2를 입력하세요 (0~100" );
		int c=scan.nextInt();
		
		int total = a+b+c;
		double avg = total/3.0;
		
		System.out.println("국어점수 : "+a);
		System.out.println("영어점수 : "+b);
		System.out.println("수학점수 : "+c);
		System.out.println("총점은 : "+ total);
		System.out.printf("평균은 :%.2f\n",avg);
		
		
		
		//학점
		
//		int temp = (int)avg/10;
//		if (temp==10 || temp==9) {
//		
//			System.out.println("학점 : A");
//		}
//		if (temp==8) {
//			System.out.println("학점 : B");
//			
//			
//		}
//		if (temp==7) {
//			System.out.println("학점 : C");
//			
//			
//		}
//		if (temp==6) {
//			System.out.println("학점 : D");
//			
//		}
//		if (temp==5) {
//			System.out.println("학점 : F");
//			
//		}
		char score ='A';
		char op = ' ';
		if (avg>=90 && avg<=100) {
			score='A';
			if (avg>=97) {
				op='+';
				
			}
			if (avg>=93 && avg<=96) {
				op='0';
				
			}
			if (avg>=90 && avg<96) {
				op='-';
				
			}
			
			
			
		}	
		if (avg>=80 && avg<90) {
			score='B';
		}	
		if (avg>=70 && avg<80) {
			score='C';
		}	
		if (avg>=60 && avg<70) {
			score='D';
		}	
		if (avg<60) {
			score='F';
		}	
		
		System.out.println("학점 : "+score +op);
		
		
		
		
	}
}