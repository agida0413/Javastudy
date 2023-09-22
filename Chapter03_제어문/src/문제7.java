import java.util.Scanner;
public class 문제7 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
	System.out.print("국어점수 을 입력하세요 : ");
	int a= scan.nextInt();
	
	System.out.print("영어점수 을 입력하세요 : ");
	int b= scan.nextInt();
	
	System.out.print("수학점수 을 입력하세요 : ");
	int c= scan.nextInt();
	
	int total= a+b+c;
	double avg = total/3.0;
	
	System.out.println("국어 : "+a);
	System.out.println("영어 : "+b);
	System.out.println("수학 : "+c);
	System.out.println("총합 : "  +total);
	System.out.printf("평균 :%.2f ",avg);
	System.out.println();
	
	if (avg>=90) {
		
		System.out.println("학점 : A ");
		
	}
    if (avg>=80 && avg<90) {
		
		System.out.println("학점 : B ");
		
	}
if (avg>=70 && avg<80) {
		
		System.out.println("학점 : C ");
		
	}

if (avg>=60 && avg<70) {
	
	System.out.println("학점 : D ");
	
}
if (avg<60) {
	
	System.out.println("학점 : F ");
	
}



	
}
}
