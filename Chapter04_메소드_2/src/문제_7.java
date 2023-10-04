//3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
//년도 입력 메소드
//윤년 처리 
//출력 
//윤년은 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 연도입니다. 이 조건을 만족하는 연도가 윤년이

import java.util.Scanner;

public class 문제_7 {
public static void main(String[] args) {
	int year = year();
	check(year);
}

public static int year() {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("연도를 입력하세요:");
	 return scan.nextInt();
	}

public static void check(int year) {
	if ((year%4==0 && year%100!=0)|| year%400==0) {
		System.out.println(year+"는 윤년입니다.");
	}
	else {
		System.out.println(year+"는 평년입니다.");
	}
	
}
}
