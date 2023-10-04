//1. 1~10까지 출력하는 메소드 구현
//2. 1~10까지 합을 구하는 메소드 구현
//3. 1~n까지 합을 구하는 메소드 구현
//4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
//5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
//6. 문자열을 거꾸로 출력하는 메소드 구현

import java.util.Scanner;

public class 문제1_2_3_4_5_6 {
public static void main(String[] args) {
	first();
	second();
	third_1(third_2());
	nanutsem(4, 2);
	five(five_2());
	six(five_2());
	
}


public static void first() {
	
	for(int i=1;i<=10;i++) {
		
		System.out.println(i);
	}
	
	
}

public static void second() {
	int sum=0;
	for(int i=1;i<=10;i++) {
		sum+=i;
		
	}
	System.out.println(sum);
	
}

public static void third_1(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		
		sum+=i;
	}
	System.out.println(sum);
	
}

public static int third_2() {
	Scanner scan =new Scanner(System.in);
	System.out.println("몇번까지 합할까요");
	return scan.nextInt();
	
}


//4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
//5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
//6. 문자열을 거꾸로 출력하는 메소드 구현



public static void nanutsem(int n,int k) {
	
	int result = n/k;
	System.out.println(result);
}

public static void five(String str) {
	
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);	
		c-=32;
		
		System.out.print(c);
	}
}

public static String five_2() {
	Scanner scan = new Scanner(System.in);
	System.out.print("문자열을 입력하세요");
	return scan.next();
}

public static void six(String str) {
	
	for(int i=str.length()-1;i>=0;i--) {
		char c=str.charAt(i);
		System.out.print(c);
		
		
	}
	
}
}
