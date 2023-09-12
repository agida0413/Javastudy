
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 변수 : 변수명 => 소문자로 시작한다
		 * 		식별자(명명규칙) 
		 * 		1.알파벳(대소문자 구분)이나 한글로 시작 
		 * 		2.명칭의 개수는 제한 하지않는다.
		 * 		=>3~7로 압축 
		 * 		a , b , c => kor, math , eng
		 * 		3. 숫자 사용 가능(앞에는 사용 불가 ) 
		 * 		4.특수문자 사용가능 ($ , _ )
		 * 			= _name ( _가 앞에 붙은것은 임시변수이다.)
		 * 		5. 변수명에는 공백을 줄수 없다.
		 * 		6. 키워드는 사용할수 없다 . 
		 * 			--자바에서 사용하는 단어	
		 * 
		 * 
		 * 	25page 관리할 데이터를 저장하는 공간을 변수 
		 * 	-----------------------------------한개만 저장이 가능하다 
		 * 
		 * 변수 
		 *  	1)선언
		 *  		데이터형 변수명;
		 *  
		 *   		int a;==> 4byte 메모리공간을 만들고 이름을 a로 부여한다
		 *  	2)초기값을 부여
		 *  		a=100;	==>a라는 공간에 100을 저장
		 *  	
		 *      3) 동시 = > int a=100;(사용빈도가 많다)
		 *      
		 *      4)값읽기 / 값변경 
		 *      --------------- 읽기(값을 가지고 온다)/쓰기(저장) / 수정
		 *      		
		 * 
		 * 
		 * 26page 
		 * 형식 ) 데이터형 변수명 
		 * 		------ ----명명규칙
		 * 		정수값을 저장한다 (200)
		 * 		int num =200;
		 * 		--- --- -----
		 * 	 데이터형  변수   리터럴(값자체,실제값)
		 * 
		 * 
		 * 	프로그램 개발 : 가독성, 퍼포먼스(속도)
		 * 				---
		 * 				 |
		 * 				리팩토링
		 * 
		 *  
		 *  	
		 * long / float 
		 * 	float f = 10.5f = > 10.5가 default 라서 더블형이므로 float 에 저장 불가 따라서 뒤에 f 붙힘으로써 변환
		 * 
		 *  char a = 65 가능 
		 *  
		 *  	byte< char, short < int < long < float < double 
		 *  		 =>메모리 크기(x) = >수표현		 
		 * 	
		 * 
		 * 
		 * 	byte b = 100;
		 * 	int i = 100;
		 * 	long l = 100L; (long l=200 ==>200L)
		 * 	
		 * 
		 * 	char c = 'a' , char c =65;('A')
		 * 	
		 * 	boolean b = true; b =false;
		 * 
		 * float f = 10.5f;
		 * 
		 * double d ='A' d=65.0
		 * double d =10 d=10.0
		 * double d =10.5f d=10.5
		 * double d = 10L   d=10.0
		 * 	 
		 */
		
		
		
		
		
		byte _byte =127;
		int  _int = 20000;
		long _long = 20000L;
		
		float _float = 10.5f;
		double _double =100;
		char   _char =65;
		
		boolean _boolean = true;
		
		System.out.println("바이트 : "+_byte);
		System.out.println("인트 :" +_int);
		System.out.println("롱 : " +_long);
		System.out.println("플롯 : " +_float);
		System.out.println("캐릭터 : " +_char);
		System.out.println("불리안 :" +_boolean);
		
		System.out.println("더블 :" +_double);
		
		

	}

}
