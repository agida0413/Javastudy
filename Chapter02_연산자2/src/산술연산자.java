	/*
		 * 1. 실행순서
		 *  =>자바 파일명과 클래스명은 동일하다.(대소문자 구분)
		 * 	 
		 * A.java (원시소스 : 프로그래머 )-----------------------> A.class (바이너리 코드 / 모든 운영체제에 호환)------------->실행
		 * 이클립스 : javac+java = ctrl+f11
		 * 
		 * 2. 소스 코딩의 주의점
		 *  - 대소문자 구분
		 *  - 명령문 = >;
		 *  - 주석 처리
		 *  - 들여쓰기 => {=> 엔터} 
		 * 3. 자바개발자의 약속
		 * 	- 변수 / 클래스 / 메소드 / 상수 
		 *  변수 : 소문자 시작 = > 다른 단어는 첫자 대문자 
		 *  	fileName , file_name
		 *  상수 : 모든 알파벳의 대문자 
		 *  클래스 ,인터페이스 : 첫자는 대문자 => MainClass
		 *  메소드 : 변수와 동일
		 *  
		 *  ***프로그램(데이터 관리)
		 *  데이터 저장 
		 *  =메모리
		 *  한개의 데이터 관리 - 변수
		 *  =>기본형으로 메모리 크기 결정
		 *  여러개 - 배열 /클래스 ( 사용자정의=> 참조형)
		 *   
		 *  -------------휘발성저장(프로그램 종료와 동시에 사라진다.)
		 *  =파일
		 *  =RDMS(오라클)
		 *  --------------영구적저장
		 * 4. 변수/ 연산자 / 제어문/ 데이터 모음/데이터 모아서 관리/ 재사용/ 예외처리
		 *  
		 *  	
		 *  			
		 * =>라이브러리를 이용한 조립식
		 * 5.응용: 네트워크 , 파일
		 * 
		 * -----------------------------------------------------------
		 * 오라클(21c) : CURD (추가 ,수정 ,삭제 , 검색)
		 * --------------------------------------------------------------필수
		 * 브라우저 연동 : HTML5/CSS3/JavaScript
		 *                       -------------Jquery(Ajax)
		 *                       			  VueJs(Vuex)
		 *                       			  ReactJs(Redux)
		 *                       			옵션 TypeScript/NodeJs(실시간 상담)
		 *                       
		 *                       
		 *                       
		 *   JSP = >Back-end + Front-end
		 *   	----MVC(SpringMVC = > 직접 Spring 제작)
		 *   dataBase 연동=> MyBatis / JPA
		 *   Spring 
		 *   Spring-boot : ThymeLeaf
		 *   AWS = > paaS ==>EC2
		 *   -------------------------------------------------------------------------
		 *   python : 데이터 분석 , 시각화 
		 *   		  pandas/Numpy /MatplotL
		 *   		  옵션 : 머신러닝 / 딥러닝
		 *   				------------                    
		 *  변수 : 메모리에 한개 테이터하는 공간의 별칭 ( 주소 )
		 *  
		 *   	변수명 설정 
		 *   	--------
		 *   1. 알파벳 시작 ( 대소문자 구분) , 한글
		 *   2. 숫자  사용(앞에 사용 금지) 
		 *   3. 키워드 사용금지
		 *   4. 공백 사용불가
		 *   5. 특수문자 (_ , $)
		 *   6. 기타사항 => 압축(3~7) = i,j
		 *   ------------------------------------------
		 *   변수 선언 방식 
		 *   데이터형 변수명;
		 *   변수의 초기화
		 *   변수명 = 값;
		 *   변수의 활용
		 *   변수명 =값(수정) ==>자동으로 {}을 벗어나면 삭제
		 *   변수의 종류 ===> 지역변수 {}
		 *    
		 *   데이터를 저장 ===> 데이터를 가공 =====>가공된 데이터 출력
		 *   		      (연산자, 제어문)       (화면에 출력)
		 *                 ---메소드
		 *                 
		 *   1.산술연산자 
		 *   	+ , - , * ,  / , %
		 *   -연산은 같은 데이터형 끼리만 연산가능
		 *    10.5 + 10->double로 변경 = 20.5 (double)
		 *    ***int 이하 데이터형 계산은 결과값 int
		 *    ex char + byte = int
		 *    
		 *    
		 *    2.
		 *    + : 산술처리 , 문자열 결합 
		 *    
		 *    산술 => 왼쪽에서 오른쪽으로 연산 ( *, /,%는 우선순위)
		 *    		=>우선순위 변경할때는 () -> 최우선
		 *    /
		 *    ==>정수/정수 =정수
		 *    10/3=3
		 *      0으로 나누면 오류발생
		 *    
		 *    % 
		 *    ==>부호는 왼쪽 부호 따라감 
		 *    ex -5 % 2 = -1
		 *    
		 *    
		 *    
		 *    형변환
		 *    int a ='A' ==== a =65
		 *    double d = 10; d = 10.0
		 *    
		 *    
		 *      
		 *     
		 *     
		 *     
		 */

//3개 정수 (1~100) => 총합 , 평균 
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int)(Math.random()*100)+1;
			//0.0~0.99 *100 => 0.0~99.0 
		// 0~99 + 1 => 1~100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		
		int total= a+b+c;
		double avg = total/3.0;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("====================");
		System.out.println("총점 : " + total);
		System.out.println("=========================");
		System.out.printf("평균 : %.2f",avg);
		System.out.println();
		/*
		 * 
		 * 실수 : %f %.2f %.3f
		 * 정수 : %d 
		 * 문자 : %c
		 * 문자열 : %s
		 * 
		 * 
		 * 
		 */
		
		
		
		System.out.println("==========================\n");
		System.out.print("aaa");
		System.out.print("bbb");
		
		
	
	}

}
