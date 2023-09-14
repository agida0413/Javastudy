//) 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.

import java.util.Scanner;

public class practice3 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("첫번째 수를 입력하세요 : ");
	int a=  scan.nextInt();
	
	System.out.print("두번째 수를 입력하세요 : ");
	
	int b =scan.nextInt();
	
	
	int result = a%b;
	
	System.out.println(a+"%"+b+"="+result);
	
	
	System.out.print("정수 두개를 입력하세요(0 0) :");
	int c=  scan.nextInt();
	int d=  scan.nextInt();
	
	
	System.out.println(c + "+"+ d);

	
	
	
}
}
