/*
 * 
 * 자바
 * ---
 * 1.데이터 저장
 * 	 변수 : 한개만 저장 (메모리 공간)
 * 	 => 변수 : 프로그램에 따라 변경이 가능
 * 	 => 상수 : 고정(final)
 * 2. 저장 방법 :메모리 크기 (기본형, 데이터형)
 * 	  정수
 *   1byte( -128~127)
 *   =>네트워크(송수신) , 파일 업로드,다운로드 , web
 *   int :default = > 모든 컴퓨터는 모든 숫자를 int 로 인식
 *   4byte(32bit) 
 *   ------
 *   long : 64bit (큰숫자를 저장) : 금융권
 *   ----
 *   ----------------------정수 
 *   정수 저장 = > 10 
 *   int 메모리공간 =10
 *   	--------  {} 종료시 ,프로그램 종료 = > 사라진다.
 *   
 *   
 *   실수 
 *   double :64bit(8byte) 15자리 소수점 저장
 *   문자
 *   char (0~65535) => 각문자 마다 고유번호를 가지고 있다.
 *   	컴퓨터는 무조건 => 0,1(2진법)
 *   	=>'A' =65 'a' = 97 '0' =>48
 *   논리 : 1byte ==>boolean
 *   	=>저장할수 있는 값 : true , false 만 저장 가능
 *   	
 *   
 * 	  ------------------------------------------------------------
 * 	데이터 가공
 * 	----------------------점수 입력(국어 ,영어 ,수학) => 평균 , 총점 , 등수 
 * 												 ---------------
 *  웹 => 조회수 증가 ,  인기 순위 (데이터 가공)
 *     hit = hit+1   sort
 *    =>연산자 , 제어문 
 *  			------->재사용(메소드)
 *  					----------- 컴포넌트/클래스    
 *  
 *  //깃헙 참고 필요  (화장실)
 *  1.주의점 
 *  	=>형변환(연산처리 -> 같은 데이터형이여야  연산된다)
 *  	int + char +double :자동형변환
 *  	---------------------double
 *  	int +(int)char + (int)double :강제형변환
 *  
 *  2. + (산술 ->문자열 결합)
 *  	+는 연산처리시 문자열이 존재하면 => 결과값은 문자열
 *  	7+7+7+7+" " => "28"
 *  	------------
 *  	7+"7"+7
 *  	----
 *  	"77"+7
 *   	--------
 *     "777"+1 => "7771"
 *  
 *  3./
 *  	정수/정수 =정수 , 정수/실수 =실수
 *  	0으로 나눌때 오류 발생
 *  
 *  
 *  4. % =>왼쪽 부호가 남는다(+,-)
 *  
 *  5.기타
 *   int +double =double
 *   char + int = int
 *   ----------------'
 *   char +char =int
 *   byte + byte = int
 *   char + byte = int
 *   ------------------ 산술규칙
 *   				  
 *  단항연산자 
 *  =증감연산자 (++ ,--)
 *    =전치 연산자
 *     ++a : 먼저 증가 = >다른 연산 수행
 *     int b= ++a; 
 *     	   -- --
 *       	2  1
 *     --a     
 *       
 *    =후치 연산자
 *    a++:먼저 다른 연산 수헹 = > 1개 증가
 *    int b = a++;
 *         --  --
 *          1  2
 *    a--
 *    ********a는 무조건 1증가 , b는 증가된 값을 받을거냐 안된값을 받을거나
 *    ******적용
 *    		 System.out.println("a="+ a++) => a값은 10 ( 출력후 증가)
 *  =부정 연산자 (!)
 *  반대효과
 *  ==>boolean 결과값
 *  true => false, false => true
 *  a%2==0 (짝수 조건) , a%2==1 , a%2!=0 , !(a%2==0)
 *  				  ---------------------------
 *  							홀수 조건
 *  =형변환 연산자 
 *  (데이터형)
 *    ------------------>자동 형변환
 *  byte<char<int<long<double
 *   <-------------------강제 형변환
 * ==> 클래스 형변환 
 * ---------boolean(true/false)
 * 			제어문 - > 조건문 ,반복문
 * 
 * 비교연산자
 *  정수/실수/문자/논리 = >equals , compare
 * = (==)
 * = (!=)
 * = <
 * = >
 * = <=
 * = >=
 * 논리연산자
 *    &&(포함), ||(포함이 안된경우)
 *    사용법(조건)&&(조건)
 *    	==> 여기부터 여기까지
 *    a>=1 && a<=100
 *    a>='A' && a<="Z'
 *    -----      ------
 *      |           |
 *      -------------
 *            |
 *           결과값
 *           true && true =>true
 *           true && false =>false
 *           false && true =>false
 *           false && false =>false
 *           
 *    a<'A' || a>'Z'
 *   -----     -----
 *     |         |
 *    -------------
 *          |
 *         결과값
 *           true && true =>true
 *           true && false =>true
 *           false && true =>true
 *           false && false =>false
 *          
 * 
 * -------------------
 * 대입연산자
 * = --> a=10
 * += --> a+=10 - > 기존의 a에 10을 더한다
 * -= --> a-=10 - > 기존의 a에 10을 빼라
 * 
 * 
 * 삼항연산자 : if~else 
 *  -> 두개의 값을 지정한다 =  >조건의 따라서 한개의 값을 갖고온다.
 *  	(조건) ? 참일때 값 : 거짓일때 값
 * 
 */

package 자바1주차정리;

public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
