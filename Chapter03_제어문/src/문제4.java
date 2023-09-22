import java.util.Scanner;
public class 문제4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수1 을 입력하세요 : ");
	int a= scan.nextInt();
	
	System.out.print("정수1 을 입력하세요 : ");
	int b= scan.nextInt();
	
	System.out.print("정수1 을 입력하세요 : ");
	int c= scan.nextInt();
	
	
	int max=a;
	int min =a;
	
	int total= a+b+c;
	double avg = total/3.0;
	
	if (max<b) {
		max=b;
	}
	if (max<c) {
		max=c;
	}
	
	
	
	if (min>b) {
		min=b;
	}
	if (min>c) {
		min=c;
	}
	
	
	System.out.println("정수 1 : "+a);
	System.out.println("정수 2 : "+b);
	System.out.println("정수 3 : "+c);
	System.out.println("총합 : "  +total);
	System.out.printf("평균 :%.2f ",avg);
	System.out.println();
	System.out.println("최댓값 : "+max);
	System.out.println("최솟값 : "+min);
}
}
