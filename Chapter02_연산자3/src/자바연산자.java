/*
 * 변수 : 저장공간
 * ===
 *  자바 저장 공간을 설정 ( 자료형 , 데이터형)
 *  
 *  정수 
 *  byte (8bit) => 0,1 을 8개 채워서 숫자 한개 저장
 *  	-128~127
 *  int(32bit) -> -21억 4천 ~ 21억 4천 
 *   default (컴퓨터에서 모든 숫자는 int 를 인식)
 *  long(64bit) => 금융권 , 빅데이터
 *  실수
 *  문자
 *  논리
 *  --->데이터 저장 - > 데이터 가공 (사용자 요청에 맞게)
 * 
 * 단항연산자 : 
 * =증감 연산자(++ , --) : 한개 증가 ,한개 감소
 * 	++a = 값을 1증가 시킨후에 다른 연산을 수행
 *  a++ = 먼저 다른 연산 후  나중에 1증가
 *  
 * =부정 연산자 ( !)
 * =형 변환 연산자(type)
 * 
 * 숫자 관련만 ( 정수,실수 , 문자만)
 * 
 * 
 * 이항 연산자: 
 * =산술 연산자(+,-,*,/,%)
 * =비교 연산자(==,!=,<,>,<=,>=)
 * =논리 연산자(&&,||)
 * =대입 연산자(=, +=, -=)
 * 
 * 
 * 삼항연산자 : 조건연산자 ? :
 * 
 * 
 * 
 * 
 * 
 */


//산술연산자
//정수 3개 입력을 받아서 총점 , 평균 ,학점

import java.util.Scanner;
public class 자바연산자 {
	
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//new => 메모리에 저장 ( 클래스)
		//연산처리 = >
	System.out.print("국어점수를 입력하세요  :");	
	int kor = scan.nextInt();
	System.out.print("영어점수를 입력하세요  :");	
	int eng = scan.nextInt();
	System.out.print("수학점수를 입력하세요  :");	
	int math = scan.nextInt();
	
	int total=kor+eng+math;
	double avg=total/3.0;
	char grade = 'A';
				
				System.out.println("=============");
				System.out.println("국어점수 : "+kor);
				System.out.println("영어점수 : "+eng);
				System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : "+ avg);
		System.out.println();

		if (avg>90) {
			grade='A';
			
		}
		else if ((avg<=90)&&(avg>70)) {
			grade++;
			
		}
		else if ((avg<=70)&&(avg>50)) {
			grade+=2;
			
			
		}else {
			grade+=3;
		}
		
		System.out.println("학점 : "+grade);
		
		
	
		//삼항 연산자 이용
			//avg >=90 && avg<=100 ? "A학점 " : " " ;
		
		
		
			}
	
}
			
			
			
			
			
		
	


